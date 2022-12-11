package ExceptionHandling;

public class TestLoginException {

	public static void main(String[] args) throws LoginException {

		TestLoginException t = new TestLoginException();
		try {
			t.authenticate("adm");
			System.out.println("No exception found");

		}catch (LoginException e) {

			System.out.println("User access denied ");
		}

		finally {
			System.out.println("This is final block");

		}
	}

	public void authenticate(String name) throws LoginException {

		if (!"admin".equals(name)) {
			LoginException e = new LoginException();
			throw e;
		}
	}

}
