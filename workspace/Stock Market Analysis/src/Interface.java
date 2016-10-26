import java.util.Scanner;

public class Interface {
	
	private static Database database;

	public static void main (String[] args) {
		
		database = new Database();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello and welcome to our Stock Analysis software!");
		System.out.print("Do you have an account? ");
		
		String account = input.next();
		
		if (account.equals("yes")) {
			
			String login;
			String password;
			
			do {
				
				System.out.print("Login: ");
				login = input.next();
				System.out.print("Password: ");
				password = input.next();
			
			} while(!database.log_in(login, password));
		}
		else {
			
			String login;
			String password;
			
			do {
			
				System.out.print("Login: ");
				login = input.next();
				System.out.print("Password: ");
				password = input.next();
				
			} while (!database.createAccount(login, password));
		}
		
		input.close();
	}
}
