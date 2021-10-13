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
import service.ICustomerService;

/**
 * Servlet implementation class EditCustomerServlet
 */
@WebServlet("/EditCustomerServlet")
public class EditCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditCustomerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("pages/editcustomer.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<String> errors = new ArrayList<String>();
		Customer customer = null;

		String newName = request.getParameter("newName");
		String newGender = request.getParameter("newGender");
		String newPhoneNumber = request.getParameter("newPhoneNumber");
		String newPoint = request.getParameter("newPoint");
		String newAddress = request.getParameter("newAddress");
		String newEmail = request.getParameter("newEmail");
		String id = request.getParameter("id");

		customer = ServiceFactory.get(ICustomerService.class).getCustomerById(Integer.parseInt(id));

		if ((newName == null) || (newName.equals(""))) {
			errors.add("name is not empty");
		}
		
		if (newPhoneNumber == null || newPhoneNumber == "") {
			errors.add("phone number is not empty");
		} else if (Pattern.matches(Regex.PHONENUMBER.getRegex(), newPhoneNumber) == false) {
			errors.add("phone number is invalid");
		}

		if (newPoint == null || newPoint == "") {
			errors.add("point is not empty");
		} else if (Pattern.matches(Regex.NUMBER.getRegex(), newPoint) == false) {
			errors.add("point is invalid");
		} else if (Integer.parseInt(newPoint) < 0) {
			errors.add("point is not less than 0");
		}
		
		if (newAddress != "" && Pattern.matches(Regex.ADDRESS.getRegex(), newAddress) == false) {
			errors.add("address is invalid");
		}

		if (newEmail != "" && Pattern.matches(Regex.EMAIL.getRegex(), newEmail) == false) {
			errors.add("email is invalid");
		}

		System.out.println(errors.size());

		if (errors.size() > 0) {
			request.setAttribute("errors", errors);
			request.setAttribute("customer", customer);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/pages/editcustomer.jsp");
			requestDispatcher.forward(request, response);
		} else {

			ServiceFactory.get(ICustomerService.class).updateCustomer(Integer.parseInt(id), newName, newGender,
					newPhoneNumber, Integer.parseInt(newPoint), newAddress, newEmail);
			response.sendRedirect("/CustomerListServlet");
		}
	}

}
