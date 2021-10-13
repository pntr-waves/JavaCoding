package service;

import java.sql.Date;
import java.util.List;

import model.Transaction;

public interface ITransactionService {
	public List<Transaction> getAllTransaction();
	public void addTransaction(int customerId, int numberTicket, int numberFreeTicket);
	public void deleteTransaction(int id);
	public List<Transaction> findTransaction(String name, Date day,
			String minNumber, String maxNumber);
	public void updateTransaction(int transactionId, int newNumberTicket, int newFree);
	public boolean isCustomerExistInTransaction(int customerId, List<Transaction> list);
	public boolean isCustomerExistInTransaction(int customerId);
	public void deleteTransactionByCustomerId(int id);
	public Transaction getTransactionByTransactionId(int id);
}
