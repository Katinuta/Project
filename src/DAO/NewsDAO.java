package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.Entity;
import DTO.News;
import DTO.User;

public class NewsDAO extends AbstractDAO<News>{
	final static String SQL_SELECT_NEWS="SELECT * FROM news";
	public NewsDAO(Connection connection) {
		super(connection);
	}

	@Override
	public List<News> findAll() {
		List<News> list=new ArrayList<>();
		PreparedStatement ps=null;
		try {
			ps=connection.prepareStatement(SQL_SELECT_NEWS);
			ResultSet resultSet=ps.executeQuery();
			while(resultSet.next()){
				News news = new News();
				news.setNewsId(resultSet.getInt("news_id"));
				news.setName(resultSet.getString("name"));
				news.setAnnotation(resultSet.getString("annotation"));
				news.setAuthor(resultSet.getString("author"));
				news.setCategoryId(resultSet.getInt("category_id"));
				news.setText(resultSet.getString("text"));
				list.add(news);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(ps);
		}
		return list;
	}

	@Override
	public boolean delete(int id) {
		return false;
	}

	@Override
	public boolean create(News entity) {
		return false;
	}

	@Override
	public News update(News entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
