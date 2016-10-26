import java.util.LinkedList;

public class Database {
	
	private LinkedList<User> users;
	
	public Database () {
		
		users = new LinkedList<User>();
		
		users.add(new User("martin", "pass"));
		users.add(new User("johanne", "kiwi"));
		users.add(new User("siegfried", "brunhild"));
	}
	
	public boolean createAccount(String login, String password) {
		
		User user = new User(login, password);
		
		for (User check : users) {
			
			if (check.equals(user)) {
				
				System.out.println("You already have an account!");
				return false;
			}
		}
		
		users.add(user);
		System.out.println("Account successfully created.");
		return true;
	}
	
	public boolean log_in(String login, String password) {
		
		User user = new User(login, password);
		
		for (User check : users) {
			
			if (check.equals(user)) {
				
				System.out.println("Login successful.");
				return true;
			}
		}
		
		System.out.println("Your login or password seem to be incorrect. Try again.");
		return false;
	}
}
