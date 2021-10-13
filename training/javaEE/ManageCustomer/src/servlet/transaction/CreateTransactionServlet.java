package servlet.transaction;

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
import service.ITransactionService;

@WebServlet("/CreateTransactionServlet")
public class CreateTransactionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		int i = Integer.parseInt(id);
		Customer customer = ServiceFactory.get(ICustomerService.class).getCustomerById(i);

		req.setAttribute("customer", customer);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/createtransaction.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> errors = new ArrayList<String>();

		String id = req.getParameter("id");
		String numberTicket = req.getParameter("numberTicket");
		String numberFreeTicket = req.getParameter("numberFreeTicket");
		int i = Integer.parseInt(id);
		Customer customer = ServiceFactory.get(ICustomerService.class).getCustomerById(i);

		if (isInvalid(Regex.NUMBER.getRegex(), numberTicket)) {
			numberTicket = null;
			errors.add("number of ticket is invalid");
		}

		if (isInvalid(Regex.NUMBER.getRegex(), numberFreeTicket)) {
			numberFreeTicket = null;
			errors.add("number freeTicket is invalid");
		} else {
			if (customer.getFreeTicket() < Integer.parseInt(numberFreeTicket)) {
				errors.add("customer does not enough number of free ticket");
			}
		}

		if (errors.size() > 0) {
			req.setAttribute("errorMessages", errors);
			req.setAttribute("customer", customer);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/createtransaction.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			ServiceFactory.get(ITransactionService.class).addTransaction(Integer.parseInt(id), Integer.parseInt(numberTicket),
					Integer.parseInt(numberFreeTicket));
			resp.sendRedirect("/CustomerListServlet");
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
