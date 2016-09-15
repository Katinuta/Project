package Service;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import DAO.UserDAO;
import DTO.User;

public class LoginCommand implements ActionCommand{

	@Override
	public String execute(HttpServletRequest request) {
		String page=null;
		String emailEnter=request.getParameter("email");
		String passwordEnter=request.getParameter("password");
		HttpSession session=request.getSession();
		ConnectorDB connectorDB=null;
		Connection cn=null;
		try {
			connectorDB=ConnectorDB.getInstance();
			try {
				cn=connectorDB.getConnection();
				UserDAO userDAO=new UserDAO(cn);
				User user=userDAO.findUserByEmail(emailEnter);
				session.setAttribute("user", user);
				if(user.getEmail().equals(emailEnter)&&user.getPassword().equals(passwordEnter)){
					page="main.jsp";
				}else{
					page="login.jsp";
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		return page;
	}

}
