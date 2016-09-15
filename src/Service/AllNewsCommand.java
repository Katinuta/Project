package Service;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import DAO.NewsDAO;
import DTO.News;

public class AllNewsCommand implements ActionCommand{

	@Override
	public String execute(HttpServletRequest request) {
		String page=null;
		HttpSession session=request.getSession();
		ConnectorDB connectorDB=null;
		Connection cn=null;
		try {
			connectorDB=ConnectorDB.getInstance();
			try {
				cn=connectorDB.getConnection();
				NewsDAO newsDAO= new NewsDAO(cn);
				List<News> listNews=newsDAO.findAll();
				request.setAttribute("listNews", listNews);
				page="allnews.jsp";
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		
		return page;
	}

}
