package ExceptionHandling;

public class LoginException extends Exception {// Parent class.
	
	public  LoginException() {

		super("Invalid User,please fill correct credentials");
	}

}
