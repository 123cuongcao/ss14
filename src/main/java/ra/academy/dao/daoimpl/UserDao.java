package ra.academy.dao.daoimpl;

import org.springframework.stereotype.Component;
import ra.academy.dao.IUserDao;
import ra.academy.model.User;
import ra.academy.util.ConnectDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao implements IUserDao {
    @Override
    public boolean save(User u) {

        Connection conn = ConnectDB.getConnection();
        try {
            PreparedStatement pre = conn.prepareStatement("insert into user(name,email,age,birthday,avatar,slogan) value(?,?,?,?,?,?)");
            pre.setString(1, u.getName());
            pre.setString(2, u.getEmail());
            pre.setInt(3, u.getAge());
            pre.setDate(4, u.getBirthday());
            pre.setString(5, u.getAvatar());
            pre.setString(6, u.getSlogan());
            pre.executeUpdate();
        } catch (SQLException e) {
            return false;
        } finally {
            ConnectDB.closeConnection(conn);
        }
        return true;
    }

    @Override
    public List<User> findAll() {
        List<User> user = new ArrayList<>();
        Connection conn = ConnectDB.getConnection();
        PreparedStatement pre = null;
        try {
            pre = conn.prepareStatement("Select * from user ");
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setName(rs.getString("name"));
                u.setAge(rs.getInt("age"));
                u.setAvatar(rs.getString("avatar"));
                u.setBirthday(rs.getDate("birthday"));
                u.setAvatar(rs.getString("avatar"));
                u.setSlogan(rs.getString("slogan"));
                user.add(u);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectDB.closeConnection(conn);
        }
        return user;
    }


    @Override
    public void delete(Integer id) {
        Connection conn = ConnectDB.getConnection();
        PreparedStatement pre = null;
        try {
            pre = conn.prepareStatement("delete from user where id = ?");
            pre.setInt(1,id);
            pre.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectDB.closeConnection(conn);
        }
    }
}
