    package servlet.memberhship;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import constant.Regex;
import core.ServiceFactory;
import model.Membership;
import service.ICustomerService;
import service.IMembershipService;

@WebServlet("/MembershipListServlet")
public class MembershipListServlet extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public MembershipListServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Membership> listMembership = ServiceFactory.get(IMembershipService.class).getAllMembership();

        req.setAttribute("levels", listMembership);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/membership.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String update = req.getParameter("update");
        String delete = req.getParameter("delete");
        List<String> errors = new ArrayList<String>();
        Membership membership = null;
        int i = Integer.parseInt(id);

        List<Membership> listMembership = ServiceFactory.get(IMembershipService.class).getAllMembership();

        if (delete != null) {
            boolean e = ServiceFactory.get(ICustomerService.class).isLevelExistInCustomer(Integer.parseInt(id));

            System.out.println("isExist: " + e);
            if (e) {
                errors.add("This membership level has exist in customer");
            }
        }

        if (update != null) {
            String newName = req.getParameter("newName");
            String newPoint = req.getParameter("newPoint");
            String newFreeTicket = req.getParameter("newFreeTicket");

            if (isInvalid(Regex.MEMERSHIPNAME.getRegex(), newName)) {
                newName = null;
                errors.add("name is invalid");
            }

            if (isInvalid(Regex.NUMBER.getRegex(), newPoint)) {
                newPoint = null;
                errors.add("point is invalid");
            }

            if (isInvalid(Regex.NUMBER.getRegex(), newFreeTicket)) {
                newFreeTicket = null;
                errors.add("freeTicket is invalid");
            }

            if (newName == null || newPoint == null || newFreeTicket == null) {
                req.setAttribute("errorMessages", errors);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/createmembership.jsp");
                requestDispatcher.forward(req, resp);
            } else {
                membership = ServiceFactory.get(IMembershipService.class).getMembershipById(listMembership,
                        Integer.parseInt(id));
                membership.setName(newName);
                membership.setFreeTicket(Integer.parseInt(newFreeTicket));
                membership.setPoint(Integer.parseInt(newPoint));
            }
        }

        if (errors.size() > 0) {
            req.setAttribute("errors", errors);
            req.setAttribute("levels", listMembership);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/membership.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            if (delete != null) {
                System.out.println("do");
                ServiceFactory.get(IMembershipService.class).deleteMembership(i);
            }

            if (update != null) {
                ServiceFactory.get(IMembershipService.class).updateMembership(membership);
                System.out.println("new Point: " + membership.getPoint());
            }

            resp.sendRedirect("/MembershipListServlet");
        }
    }

    public boolean isInvalid(String regex, String value) {
        if (value == null || value == "" || Pattern.matches(regex, value) == false) {
            return true;
        } else {
            return false;
        }
    }
}
