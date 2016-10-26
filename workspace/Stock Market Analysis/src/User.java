
public class User {
	
	private String login;
	private String password;
	
	public User (String log, String pass) {
		
		login = log;
		password = pass;
	}
	
	public boolean equals(User user) {
		
		return (this.login.equals(user.login) && this.password.equals(user.password));
	}
	
	public String toString () {
		
		return "Login: " + login + ", Password: " + password;
	}
}
