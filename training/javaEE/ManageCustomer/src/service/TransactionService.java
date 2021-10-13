package service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.TransactionDAO;
import core.ServiceFactory;
import model.Transaction;

public class TransactionService implements ITransactionService {

    TransactionDAO transactionDAO = new TransactionDAO();

    @Override
    public List<Transaction> getAllTransaction() {
        List<Transaction> list = new ArrayList<Transaction>();

        try {
            list = transactionDAO.getAllTransaction();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public void addTransaction(int customerId, int numberTicket, int numberFreeTicket) {
        try {
            transactionDAO.addTransaction(customerId, numberTicket, numberFreeTicket);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ServiceFactory.get(ICustomerService.class).updateCustomerByTransaction(customerId, numberTicket,
                numberFreeTicket);

    }

    @Override
    public void deleteTransaction(int id) {
        Transaction transaction = getTransactionByTransactionId(id);
        try {
            transactionDAO.deleteTransaction(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int newTicket = -1 * transaction.getNumberTicket();
        int newFree = -1 * transaction.getNumberFreeTicket();
        ServiceFactory.get(ICustomerService.class).updateCustomerByTransaction(transaction.getCustomer().getId(),
                newTicket, newFree);
    }

    @Override
    public List<Transaction> findTransaction(String name, Date day, String minNumber, String maxNumber) {
        List<Transaction> list = null;
        try {
            list = transactionDAO.findTransaction(name, day, minNumber, maxNumber);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void updateTransaction(int transactionId, int newTicket, int newFreeTicket) {
        Transaction transaction = getTransactionByTransactionId(transactionId);
        int amoutChangesTicket = newTicket - transaction.getNumberTicket();
        int amoutChangesFree = newFreeTicket - transaction.getNumberFreeTicket();
        transaction.setNumberTicket(newTicket);
        transaction.setNumberFreeTicket(newFreeTicket);

        try {
            transactionDAO.updateTransaction(transaction);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ServiceFactory.get(ICustomerService.class).updateCustomerByTransaction(transaction.getCustomer().getId(),
                amoutChangesTicket, amoutChangesFree);

    }

    @Override
    public boolean isCustomerExistInTransaction(int customerId, List<Transaction> list) {
        int length = list.size();
        int index = 0;

        while (index < length) {
            if (customerId == list.get(index).getCustomer().getId()) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public boolean isCustomerExistInTransaction(int customerId) {
        boolean exist = false;
        try {
            exist = transactionDAO.isCustomerExistInTransaction(customerId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exist;
    }

    @Override
    public void deleteTransactionByCustomerId(int id) {
        try {
            transactionDAO.deleteTransactionByCustomerId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Transaction getTransactionByTransactionId(int id) {
        Transaction transaction = null;
        try {
            transaction = transactionDAO.getTransactionById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transaction;
    }

}
