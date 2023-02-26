// regex validate password with ValidatePassword.java

public class ValidatePassword {
	//validate password
	public static boolean validatePassword(String password) {
		return password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{6,}");
   } 
}
