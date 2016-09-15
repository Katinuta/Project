package Service;

public enum CommandEnum {
	LOGIN{
		{
			this.command=new LoginCommand();
		}
	},
	ALLNEWS{
		{
			this.command=new AllNewsCommand();
		}
	};
	ActionCommand command;
	public ActionCommand getCurrentCommand(){
		return command;
	}
}
