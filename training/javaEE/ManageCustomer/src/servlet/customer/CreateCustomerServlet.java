package servlet.customer;

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
import model.Customer;
import model.Membership;
import service.ICustomerService;
import service.IMembershipService;

/**
 * Servlet implementation class CreateCustomerServlet
 */
@WebServlet("/CreateCustomerServlet")
public class CreateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateCustomerServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Membership> list = ServiceFactory.get(IMembershipService.class).getAllMembership();

		request.setAttribute("levels", list);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/pages/createcustomer.jsp");
		requestDispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String gender = (String) request.getParameter("gender");
		String phoneNumber = request.getParameter("phoneNumber");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String id = request.getParameter("membership_id");
		int point = 0;
		int free = 0;

		List<Membership> listMembership = ServiceFactory.get(IMembershipService.class).getAllMembership();
		Membership membership = ServiceFactory.get(IMembershipService.class).getMembershipById(Integer.parseInt(id));
		
		point = membership.getPoint();
		free = membership.getFreeTicket();
		System.out.println("gender - " + membership.getFreeTicket());

		Customer customer = new Customer(name, gender, phoneNumber, point, membership, address, email, free);
		List<String> errorMessages = new ArrayList<String>();

		if (name == null || name == "") {
			errorMessages.add("name is not empty!");
		}

		if (phoneNumber == null || phoneNumber == "") {
			errorMessages.add("phone is not empty!");
		} else if (Pattern.matches(Regex.PHONENUMBER.getRegex(), phoneNumber) == false) {
			errorMessages.add("phone number is invalid");
		}

		if (address != "" && Pattern.matches(Regex.ADDRESS.getRegex(), address) == false) {
			errorMessages.add("address is invalid");
		}

		if (email != "" && Pattern.matches(Regex.EMAIL.getRegex(), email) == false) {
			errorMessages.add("email is invalid");
		}

		request.setAttribute("errorMessages", errorMessages);

		if (errorMessages.size() > 0) {
			request.setAttribute("levels", listMembership);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/pages/createcustomer.jsp");
			requestDispatcher.forward(request, response);
		} else {
			ServiceFactory.get(ICustomerService.class).addCustomer(customer);
			response.sendRedirect("/CustomerListServlet");
		}
	}
}
