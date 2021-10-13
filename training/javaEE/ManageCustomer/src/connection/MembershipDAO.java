package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Membership;

public class MembershipDAO {
    
//    public static void main(String[] args) {
//    }

    
    public Membership getMembershipById(int id) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement pstm = null;
        Membership membership = null;
        String sql = "select * from membership where id = ?";
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();
            while(rs.next()) {
                int levelId = rs.getInt("id");
                String name = rs.getString("name");
                int levelPoint = rs.getInt("point");
                int freeTicket = rs.getInt("free_ticket");
                membership = new Membership(levelId, name, levelPoint, freeTicket);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstm != null) {
                pstm.close();
            }
        }

        return membership;
    }

    public Membership getMembershipByPoint(int point) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement pstm = null;
        Membership membership = null;
        String sql = "select * from membership where point <= ? order by point desc limit 1";
        try {
            pstm = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pstm.setInt(1, point);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                int levelId = rs.getInt("id");
                String name = rs.getString("name");
                int levelPoint = rs.getInt("point");
                int freeTicket = rs.getInt("free_ticket");
                membership = new Membership(levelId, name, levelPoint, freeTicket);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return membership;
    }

    public void updateMembership(Membership membership) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String sql = "update membership set name = ?, point = ?, free_ticket = ? where id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, membership.getName());
            preparedStatement.setInt(2, membership.getPoint());
            preparedStatement.setInt(3, membership.getFreeTicket());
            preparedStatement.setInt(4, membership.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null)
                preparedStatement.close();
        }
    }

    public void deleteMembership(int id) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String sql = "delete from membership where id = ?";
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

    public List<Membership> getAllMembership() throws SQLException {
        List<Membership> list = new ArrayList<Membership>();
        Membership membership = null;
        Connection connection = DatabaseConnection.getConnection();
        String sql = "select * from membership order by point asc";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int point = rs.getInt("point");
                int freeTicket = rs.getInt("free_ticket");
                membership = new Membership(id, name, point, freeTicket);
                list.add(membership);
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

    public void addMembership(Membership membership) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String sql = "insert into membership(name, point, free_ticket) values(?,?,?)";
        PreparedStatement pstm = null;

        try {
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, membership.getName());
            pstm.setInt(2, membership.getPoint());
            pstm.setInt(3, membership.getFreeTicket());

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstm != null) {
                pstm.close();
            }
        }

    }
}
