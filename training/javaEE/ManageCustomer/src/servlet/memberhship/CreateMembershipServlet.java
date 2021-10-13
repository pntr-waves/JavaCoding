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
import service.IMembershipService;

@WebServlet("/CreateMembershipServlet")
public class CreateMembershipServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CreateMembershipServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/createmembership.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String point = req.getParameter("point");
		String freeTicket = req.getParameter("freeTicket");
		List<String> errors = new ArrayList<String>();
		
		if (isInvalid(Regex.MEMERSHIPNAME.getRegex(), name)) {
			name = null;
			errors.add("name is invalid");
		}

		if (isInvalid(Regex.NUMBER.getRegex(), point)) {
			point = null;
			errors.add("point is invalid");
		}

		if (isInvalid(Regex.NUMBER.getRegex(), freeTicket)) {
			freeTicket = null;
			errors.add("freeTicket is invalid");
		}

		if (name == null || point == null || freeTicket == null) {
			req.setAttribute("errorMessages", errors);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/createmembership.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			Membership membership = new Membership(name, Integer.parseInt(point), Integer.parseInt(freeTicket));
			ServiceFactory.get(IMembershipService.class).addMembership(membership);

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
