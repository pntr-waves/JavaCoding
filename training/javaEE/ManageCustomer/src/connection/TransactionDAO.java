package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.sql.Date;
import java.util.HashMap;

import model.Customer;
import model.Membership;
import model.Transaction;

public class TransactionDAO {

    public boolean isCustomerExistInTransaction(int customerId) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String sql = "select exists(select * from bill where customer_id = ?)";
        PreparedStatement preparedStatement = null;
        boolean exist = false;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, customerId);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                exist = rs.getBoolean("exists");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
        return exist;
    }

    public Transaction getTransactionById(int id) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String sql = "select *, customer.id as c_id, membership.id as membership_id, membership.point as membership_point, bill.id as bill_id from bill left join customer left join membership on level = membership.id on customer_id = customer.id where bill.id = ?";
        PreparedStatement preparedStatement = null;
        Transaction transaction = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int levelId = rs.getInt("membership_id");
                String levelName = rs.getString("name");
                int levelPoint = rs.getInt("point_level");
                int freeTicket = rs.getInt("free_ticket");
                Membership membership = new Membership(levelId, levelName, levelPoint, freeTicket);

                int customerId = rs.getInt("c_id");
                String customerName = rs.getString("customer_name");
                String gender = rs.getString("gender");
                String phoneNumber = rs.getString("phone_number");
                String address = rs.getString("address");
                String email = rs.getString("email");
                int point = rs.getInt("point");
                int free = rs.getInt("free");

                Customer customer = new Customer(customerId, customerName, gender, phoneNumber, point, membership,
                        address, email, free);

                int billId = rs.getInt("bill_id");
                int numberTicket = rs.getInt("number_ticket");
                int numberFreeTicket = rs.getInt("used_free");
                Date submitDate = rs.getDate("submit_date");

                transaction = new Transaction(billId, customer, submitDate, numberTicket, numberFreeTicket);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }

        return transaction;
    }

    public void updateTransaction(Transaction transaction) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String sql = "update bill set number_ticket = ?, used_free = ? where id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, transaction.getNumberTicket());
            preparedStatement.setInt(2, transaction.getNumberFreeTicket());
            preparedStatement.setInt(3, transaction.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null)
                preparedStatement.close();
        }
    }

    public List<Transaction> findTransaction(String name, Date day, String minNumber, String maxNumber)
            throws SQLException {

        Connection connection = DatabaseConnection.getConnection();

        List<Transaction> list = new ArrayList<Transaction>();
        Map<Integer, String> listString = new HashMap<Integer, String>();
        Map<Integer, Integer> listInt = new HashMap<Integer, Integer>();
        Map<Integer, Date> listDate = new HashMap<Integer, Date>();

        String sql = "select *, customer.id as c_id, membership.id as membership_id, membership.point as membership_point, bill.id as bill_id from bill left join customer left join membership on level = membership.id on customer_id = customer.id where ";
        String and_sql = "and ";
        int index = 1;
        if (name != null) {
            sql = sql + "customer_name = ? ";
            listString.put(index, name);
            index++;
        }

        if (day != null) {
            if (index == 1) {
                sql = sql + "submit_date = ? ";
            } else {
                sql = sql + and_sql + "submit_date = ? ";
            }
            listDate.put(index, day);
            index++;
        }

        if (minNumber != null && maxNumber != null) {
            if (index == 1) {
                sql = sql + "number_ticket >= ? and number_ticket <= ? ";
            } else {
                sql = sql + and_sql + "number_ticket >= ? and number_ticket <= ? ";
            }

            listInt.put(index++, Integer.parseInt(minNumber));
            listInt.put(index++, Integer.parseInt(maxNumber));
        }

        PreparedStatement preparedStatement = null;
        System.out.println(sql);
        try {
            preparedStatement = connection.prepareStatement(sql);
            while (index > 1) {

                if (listInt.get(index - 1) != null) {
                    preparedStatement.setInt(index - 1, listInt.get(index - 1));
                }

                if (listString.get(index - 1) != null) {
                    preparedStatement.setString(index - 1, listString.get(index - 1));
                }

                if (listDate.get(index - 1) != null) {
                    preparedStatement.setDate(index - 1, listDate.get(index - 1));
                }
                System.out.println(listString.get(index - 1));
                index--;
            }
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int levelId = rs.getInt("membership_id");
                String levelName = rs.getString("name");
                int levelPoint = rs.getInt("membership_point");
                int freeTicket = rs.getInt("free_ticket");
                Membership membership = new Membership(levelId, levelName, levelPoint, freeTicket);

                int customerId = rs.getInt("c_id");
                String customerName = rs.getString("customer_name");
                String gender = rs.getString("gender");
                String phoneNumber = rs.getString("phone_number");
                String address = rs.getString("address");
                String email = rs.getString("email");
                int point = rs.getInt("point");
                int free = rs.getInt("free");

                Customer customer = new Customer(customerId, customerName, gender, phoneNumber, point, membership,
                        address, email, free);

                int billId = rs.getInt("bill_id");
                int numberTicket = rs.getInt("number_ticket");
                int numberFreeTicket = rs.getInt("used_free");
                Date submitDate = rs.getDate("submit_date");

                Transaction transaction = new Transaction(billId, customer, submitDate, numberTicket, numberFreeTicket);
                list.add(transaction);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
        return list;
    }

    public void deleteTransaction(int id) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String sql = "delete from bill where id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstm != null) {
                pstm.close();
            }
        }
    }

    public void deleteTransactionByCustomerId(int id) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String sql = "delete from bill where customer_id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstm != null) {
                pstm.close();
            }
        }
    }

    public void addTransaction(int customerId, int numberTicket, int numberFreeTicket) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement pstm = null;
        String sql = "insert into bill(customer_id, number_ticket, used_free) values(?,?,?)";

        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, customerId);
            pstm.setInt(2, numberTicket);
            pstm.setInt(3, numberFreeTicket);

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstm != null) {
                pstm.close();
            }
        }

    }

    public List<Transaction> getAllTransaction() throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement pstm = null;
        String sql = "select *, customer.id as c_id, membership.id as membership_id, membership.point as membership_point, bill.id as bill_id from bill left join customer left join membership on level = membership.id on customer_id = customer.id order by submit_date desc";

        List<Transaction> list = new ArrayList<Transaction>();

        try {
            pstm = connection.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int levelId = rs.getInt("membership_id");
                String levelName = rs.getString("name");
                int levelPoint = rs.getInt("membership_point");
                int freeTicket = rs.getInt("free_ticket");
                Membership membership = new Membership(levelId, levelName, levelPoint, freeTicket);

                int customerId = rs.getInt("c_id");
                String customerName = rs.getString("customer_name");
                String gender = rs.getString("gender");
                String phoneNumber = rs.getString("phone_number");
                String address = rs.getString("address");
                String email = rs.getString("email");
                int point = rs.getInt("point");
                int free = rs.getInt("free");

                Customer customer = new Customer(customerId, customerName, gender, phoneNumber, point, membership,
                        address, email, free);

                int billId = rs.getInt("bill_id");
                int numberTicket = rs.getInt("number_ticket");
                int numberFreeTicket = rs.getInt("used_free");
                Date submitDate = rs.getDate("submit_date");

                Transaction transaction = new Transaction(billId, customer, submitDate, numberTicket, numberFreeTicket);
                list.add(transaction);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstm != null) {
                pstm.close();
            }
        }

        return list;
    }
}
