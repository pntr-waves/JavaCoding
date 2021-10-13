package servlet.customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.ServiceFactory;
import model.Membership;
import service.IMembershipService;

@WebServlet("/test")
public class testServlet extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Membership membership = ServiceFactory.get(IMembershipService.class).getMembershipById(3);
        if(membership == null) {
            System.out.println(true);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
    }

}
