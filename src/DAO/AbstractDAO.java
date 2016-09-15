package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import DTO.Entity;

public abstract class AbstractDAO<T extends Entity> {
	protected Connection connection;

	public AbstractDAO(Connection connection) {
		this.connection = connection;
	}

	public abstract List<T> findAll();

	public abstract boolean delete(int id);

	public abstract boolean create(T entity);

	public abstract T update(T entity);

	public void close(PreparedStatement ps) {

		try {
			if (ps != null) {
				ps.close();
			}
		} catch (SQLException e) {

		}
	}

}
