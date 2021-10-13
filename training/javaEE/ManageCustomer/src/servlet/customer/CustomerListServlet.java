package servlet.customer;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.ServiceFactory;
import model.Customer;
import model.Membership;
import service.ICustomerService;
import service.IMembershipService;

/**
 * Servlet implementation class CustomerListServlet
 */
@WebServlet("/CustomerListServlet")
public class CustomerListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerListServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String errMessages = null;
		List<Customer> listCustomer = null;
		List<Membership> listMembership = null;

		listCustomer = ServiceFactory.get(ICustomerService.class).getAllCustomer();
		listMembership = ServiceFactory.get(IMembershipService.class).getAllMembership();
		
		if (listCustomer == null) {
			errMessages = "No customer in data!";
		}

		if (errMessages != null) {
			request.setAttribute("errorMessages", errMessages);
		}
		request.setAttribute("levels", listMembership);
		request.setAttribute("customers", listCustomer);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/pages/customers.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = null, gender = null, phoneNumber = null, membership = null, minPoint = null, maxPoint = null;
//		String errorMessages = null;

		name = request.getParameter("name");
		gender = request.getParameter("gender");
		phoneNumber = request.getParameter("phoneNumber");
		membership = request.getParameter("membership");
		minPoint = request.getParameter("minPoint");
		maxPoint = request.getParameter("maxPoint");

		String phoneNumberPattern = "^\\d{10}$";
		String pointPattern = "\\d+";

		if (name == null || name == "") {
			name = null;
		}

		if (gender == null || gender == "")
			gender = null;

		if (phoneNumber == null || phoneNumber == "" || Pattern.matches(phoneNumberPattern, phoneNumber) == false) {
		    phoneNumber = null;
		}

		if (membership == null || membership == "")
			membership = null;

		if(isInvalidPoint(maxPoint, pointPattern) || isInvalidPoint(minPoint, pointPattern)) {
			minPoint = null;
			maxPoint = null;
		}

		System.out.println(minPoint + "-" + maxPoint);

		List<Customer> list = null;
		List<Membership> listMembership = null;
		
		if (name == null && gender == null && phoneNumber == null && membership == null && minPoint == null
				&& maxPoint == null) {
			response.sendRedirect("/CustomerListServlet");
			System.out.println(true);
		} else {
			System.out.println(false);
			listMembership = ServiceFactory.get(IMembershipService.class).getAllMembership();
			list = ServiceFactory.get(ICustomerService.class).findCustomer(name, gender, phoneNumber, membership, minPoint, maxPoint);
			request.setAttribute("customers", list);
			request.setAttribute("levels", listMembership);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("pages/customers.jsp");
			requestDispatcher.forward(request, response);
		}

	}

	public boolean isInvalidPoint(String point, String regex) {
		return point == null || point == "" || Pattern.matches(regex, point) == false;
	}
}
