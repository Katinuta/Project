package Service;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {
	public ActionCommand defineCommand(HttpServletRequest request){
		ActionCommand current;
		String action=request.getParameter("command");
		CommandEnum currentEnum=CommandEnum.valueOf(action.toUpperCase());
		current=currentEnum.getCurrentCommand();
		return current;
	}
}
