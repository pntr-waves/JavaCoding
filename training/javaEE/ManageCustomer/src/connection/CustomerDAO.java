package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;
import model.Membership;

public class CustomerDAO {

//    public static void main(String[] args) {
//        try {
//            List<Customer> list = getCustomerGreaterThanPoint(101);
//            System.out.println(list.get(0).getPoint());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public List<Customer> getCustomerGreaterThanPoint(int point, int levelId) throws SQLException {
        List<Customer> listCustomer = new ArrayList<Customer>();
        PreparedStatement pstm = null;
        Connection connection = DatabaseConnection.getConnection();
        String sql = "select *, membership.id as membership_id, membership.point as membership_point  from customer left join membership on level = membership.id where customer.point >= ? and customer.point < (select point from membership where point > ? order by point asc limit 1) or level = ?";
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, point);
            pstm.setInt(2, point);
            pstm.setInt(3, levelId);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int levelResultId = rs.getInt("membership_id");
                String levelName = rs.getString("name");
                int levelPoint = rs.getInt("membership_point");
                int freeTicket = rs.getInt("free_ticket");
                Membership membership = new Membership(levelResultId, levelName, levelPoint, freeTicket);

                int customerId = rs.getInt("id");
                String name = rs.getString("customer_name");
                String gender = rs.getString("gender");
                String phoneNumber = rs.getString("phone_number");
                String address = rs.getString("address");
                String email = rs.getString("email");
                int customerPoint = rs.getInt("point");
                int free = rs.getInt("free");

                Customer customer = new Customer(customerId, name, gender, phoneNumber, customerPoint, membership,
                        address, email, free);
                listCustomer.add(customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCustomer;
    }

    public boolean isLevelExistInCustomer(int id) throws SQLException {
        boolean exist = false;
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement pstm = null;
        String sql = "select exists(select * from customer where level = ?)";
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                exist = rs.getBoolean("exists");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return exist;
    }

    public Customer getCustomerById(int id) throws SQLException {
        Customer customer = null;
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement pstm = null;
        String sql = "select * , membership.id as membership_id, membership.point as membership_point from customer left join membership on customer.level = membership.id where customer.id = ?";
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int levelId = rs.getInt("membership_id");
                String levelName = rs.getString("name");
                int levelPoint = rs.getInt("membership_point");
                int freeTicket = rs.getInt("free_ticket");
                Membership membership = new Membership(levelId, levelName, levelPoint, freeTicket);

                int customerId = rs.getInt("id");
                String name = rs.getString("customer_name");
                String gender = rs.getString("gender");
                String phoneNumber = rs.getString("phone_number");
                String address = rs.getString("address");
                String email = rs.getString("email");
                int point = rs.getInt("point");
                int free = rs.getInt("free");

                customer = new Customer(customerId, name, gender, phoneNumber, point, membership, address, email, free);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    public List<Customer> getCustomerFromIdLevel(int id) throws SQLException {
        List<Customer> list = new ArrayList<Customer>();
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement pstm = null;
        String sql = "select *, membership.id as membership_id, membership.point as membership_point from customer left join membership on customer.level = membership.id where level = ?";

        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int levelId = rs.getInt("membership_id");
                String levelName = rs.getString("name");
                int levelPoint = rs.getInt("membership_point");
                int freeTicket = rs.getInt("free_ticket");
                Membership membership = new Membership(levelId, levelName, levelPoint, freeTicket);

                int customerId = rs.getInt("id");
                String name = rs.getString("customer_name");
                String gender = rs.getString("gender");
                String phoneNumber = rs.getString("phone_number");
                String address = rs.getString("address");
                String email = rs.getString("email");
                int point = rs.getInt("point");
                int free = rs.getInt("free");

                Customer customer = new Customer(customerId, name, gender, phoneNumber, point, membership, address,
                        email, free);
                list.add(customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Customer> findCustomer(String name, String gender, String phoneNumber, String membership,
            String minPoint, String maxPoint) throws SQLException {

        Connection connection = DatabaseConnection.getConnection();

        List<Customer> list = new ArrayList<Customer>();
        Map<Integer, String> listString = new HashMap<Integer, String>();
        Map<Integer, Integer> listInt = new HashMap<Integer, Integer>();

        String sql = "select *, membership.id as membership_id, membership.point as membership_point from customer left join membership on customer.level = membership.id where ";
        String and_sql = "and ";
        int index = 1;
        if (name != null) {
            sql = sql + "customer_name = ? ";
            listString.put(index, name);
            index++;
        }
        if (gender != null) {
            if (index == 1) {
                sql = sql + "gender = ? ";
            } else {
                sql = sql + and_sql + "gender = ? ";
            }
            listString.put(index, gender);
            index++;
        }
        if (phoneNumber != null) {
            if (index == 1) {
                sql = sql + "phone_number = ? ";
            } else {
                sql = sql + and_sql + "phone_number = ? ";
            }
            listString.put(index, phoneNumber);
            index++;
        }
        if (membership != null) {
            if (index == 1) {
                sql = sql + "name = ? ";
            } else {
                sql = sql + and_sql + "name = ? ";
            }
            listString.put(index, membership);
            index++;
        }

        if (minPoint != null && maxPoint != null) {
            if (index == 1) {
                sql = sql + "customer.point >= ? and customer.point <= ? ";
            } else {
                sql = sql + and_sql + "customer.point >= ? and customer.point <= ? ";
            }

            listInt.put(index++, Integer.parseInt(minPoint));
            listInt.put(index++, Integer.parseInt(maxPoint));
        }

        PreparedStatement preparedStatement = null;
        System.out.println(sql);
        try {
            preparedStatement = connection.prepareStatement(sql);
            while (index > 1) {
                if (listString.get(index - 1) == null && listInt.get(index - 1) != null) {
                    preparedStatement.setInt(index - 1, listInt.get(index - 1));
                } else if (listString.get(index - 1) != null && listInt.get(index - 1) == null) {
                    preparedStatement.setString(index - 1, listString.get(index - 1));
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
                Membership m = new Membership(levelId, levelName, levelPoint, freeTicket);

                int id = rs.getInt("id");
                String n = rs.getString("customer_name");
                String g = rs.getString("gender");
                String p = rs.getString("phone_number");
                String address = rs.getString("address");
                String email = rs.getString("email");
                int point = rs.getInt("point");
                int f = rs.getInt("free");

                Customer customer = new Customer(id, n, g, p, point, m, address, email, f);
                list.add(customer);
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

    public void updateCustomer(Customer customer) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String sql = "update customer set customer_name = ?, gender = ?, phone_number = ?,  point = ?, level = ?, address = ?, email = ?, free = ? where id = ?";
        System.out.println(customer.getMembership().getId());
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getGender().getValue());
            preparedStatement.setString(3, customer.getPhoneNumber());
            preparedStatement.setInt(4, customer.getPoint());
            preparedStatement.setInt(5, customer.getMembership().getId());
            preparedStatement.setString(6, customer.getAddress());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setInt(8, customer.getFreeTicket());
            preparedStatement.setInt(9, customer.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null)
                preparedStatement.close();
        }
    }

    public void deleteCustomer(int id) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();

        String sql = "delete from customer where id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstm != null)
                pstm.close();
        }

    }

    public void addCustomer(Customer customer) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();

        String sql = "insert into customer(customer_name, address, email, gender, point, level, phone_number, free) values(?,?,?,?,?,?,?,?) ";
        PreparedStatement pstm = null;
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, customer.getName());
            pstm.setString(2, customer.getAddress() == null ? "" : customer.getAddress());
            pstm.setString(3, customer.getEmail() == null ? "" : customer.getEmail());
            pstm.setString(4, customer.getGender().getValue());
            pstm.setInt(5, customer.getPoint());
            pstm.setInt(6, customer.getMembership().getId());
            pstm.setString(7, customer.getPhoneNumber());
            pstm.setInt(8, customer.getFreeTicket());

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstm != null)
                pstm.close();
        }
    }

    public List<Customer> getAllCustomer() throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        List<Customer> list = new ArrayList<Customer>();
        PreparedStatement pstm = null;

        String sql = "select *, membership.id as membership_id, membership.point as membership_point from customer left join membership on customer.level = membership.id";

        try {
            pstm = connection.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                int levelId = rs.getInt("membership_id");
                String levelName = rs.getString("name");
                int levelPoint = rs.getInt("membership_point");
                int freeTicket = rs.getInt("free_ticket");
                Membership m = new Membership(levelId, levelName, levelPoint, freeTicket);

                int id = rs.getInt("id");
                String n = rs.getString("customer_name");
                String g = rs.getString("gender");
                String p = rs.getString("phone_number");
                String address = rs.getString("address");
                String email = rs.getString("email");
                int point = rs.getInt("point");
                int f = rs.getInt("free");

                Customer customer = new Customer(id, n, g, p, point, m, address, email, f);
                list.add(customer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

}
