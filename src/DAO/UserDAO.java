package DAO;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import DTO.User;
import Service.ConnectorDB;

public class UserDAO extends AbstractDAO<User> {
	final static String SQL_SELECT_USER_BY_EMAIL = "SELECT * FROM user WHERE email=?";

	public UserDAO(Connection connection) {
		super(connection);
	}

	@Override
	public List<User> findAll() {
		return null;
	}

	@Override
	public boolean delete(int id) {
		return false;
	}

	@Override
	public boolean create(User entity) {
		return false;
	}

	@Override
	public User update(User entity) {
		return null;
	}

	public User findUserByEmail(String email) {
		User user = new User();
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(SQL_SELECT_USER_BY_EMAIL);
			ps.setString(1, email);
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				user.setEmail(resultSet.getString("email"));
				user.setName(resultSet.getString("name"));
				user.setSurname(resultSet.getString("surname"));
				user.setPassword(resultSet.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(ps);
		}
		return user;
	}
}
