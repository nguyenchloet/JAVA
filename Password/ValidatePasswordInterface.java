// Validate password with Password.java 
import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		//user input password
		Scanner scanner = new Scanner(System.in);
		System.out.print("(Password should be at least 6 characters long, \n contain at least one uppercase \n and one lowercase letter and one digit)\n");
     	System.out.println("Please enter password: ");
     	String inputPass = scanner.nextLine();
     	
    if (!ValidatePassword.validatePassword(inputPass)) {
        System.out.println("Invalid Password");
        System.out.print("Please Re-enter Password: ");
        inputPass = scanner.nextLine();
    } else {
      System.out.println("Valid input. Thank you.");
    } 
  }
}
