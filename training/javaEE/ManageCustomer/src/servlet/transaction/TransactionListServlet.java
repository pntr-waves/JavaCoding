package servlet.transaction;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.sql.Date;
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
import model.Transaction;
import service.ITransactionService;
import service.TransactionService;

@WebServlet("/TransactionListServlet")
public class TransactionListServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TransactionListServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// service
		TransactionService transactionService = new TransactionService();
		// init
		List<Transaction> list = transactionService.getAllTransaction();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();

		req.setAttribute("nowDate", dtf.format(now));
		req.setAttribute("bills", list);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/transactions.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// service
		// init
		List<Transaction> list = ServiceFactory.get(ITransactionService.class).getAllTransaction();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();

		String id = req.getParameter("id");
		String update = req.getParameter("update");
		String delete = req.getParameter("delete");
		String search = req.getParameter("search");
		String name = null, day = null, minNumber = null, maxNumber = null;
		Date date = null;
		String newNumberTicket = req.getParameter("newNumberTicket");
		String newFreeTicket = req.getParameter("newFreeTicket");
		List<String> errors = new ArrayList<String>();
		int i = 0;
		boolean sendRedirect = true;

		if (id != null) {
			i = Integer.parseInt(id);
		}

		if (update != null) {
		    Transaction transaction = ServiceFactory.get(ITransactionService.class).getTransactionByTransactionId(i);
		    
			if (isInvalid(newNumberTicket, Regex.NUMBER.getRegex())) {
				newNumberTicket = null;
				errors.add("number of ticket is invalid");
			}

			if (isInvalid(newFreeTicket, Regex.NUMBER.getRegex())) {
				newFreeTicket = null;
				errors.add("number of free ticket is invalid");
			}else {
			    if(Integer.parseInt(newFreeTicket) > transaction.getCustomer().getFreeTicket()) {
			        errors.add("customer does not enough number of free ticket");
			    }
			}
			
		}

		if (search != null) {

			name = req.getParameter("nameCustomer");
			day = req.getParameter("day");
			minNumber = req.getParameter("minNumber");
			maxNumber = req.getParameter("maxNumber");

			if (name == null || name == "") {
				name = null;
			}

			if (isInvalid(day, Regex.DATETIME.getRegex())) {
				day = null;
			} else {
				date = Date.valueOf(day);
			}

			if (isInvalid(maxNumber, Regex.NUMBER.getRegex()) || isInvalid(minNumber, Regex.NUMBER.getRegex())) {
				minNumber = null;
				maxNumber = null;
			}

			System.out.println(minNumber + "-" + maxNumber);
		}

		if (errors.size() > 0) {
			req.setAttribute("errors", errors);
			req.setAttribute("nowDate", dtf.format(now));
			req.setAttribute("bills", list);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/pages/transactions.jsp");
			requestDispatcher.forward(req, resp);
			sendRedirect = false;
		} else {
			if (delete != null) {
				System.out.println("do");
				ServiceFactory.get(ITransactionService.class).deleteTransaction(i);
			}

			if (search != null) {
				if (name == null && day == null && minNumber == null && maxNumber == null) {
					System.out.println("check!");
					sendRedirect = true;
				} else {
					System.out.println(minNumber + "-" + maxNumber);
					list = ServiceFactory.get(ITransactionService.class).findTransaction(name, date, minNumber, maxNumber);
					req.setAttribute("nowDate", dtf.format(now));
					req.setAttribute("bills", list);
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("pages/transactions.jsp");
					requestDispatcher.forward(req, resp);
					sendRedirect = false;
				}
			}

			if (update != null) {
				ServiceFactory.get(ITransactionService.class).updateTransaction(i, Integer.parseInt(newNumberTicket), Integer.parseInt(newFreeTicket));
			}

		}

		if (sendRedirect) {
			resp.sendRedirect("/TransactionListServlet");
		}
	}

	public boolean isInvalid(String point, String regex) {
		return point == null || point == "" || Pattern.matches(regex, point) == false;
	}
}
