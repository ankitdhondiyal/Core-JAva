package ExceptionHandling;

public class ExceptionTryCatch {

	public static void main(String[] args) {

		int i = 0;
		int j = 10;

		try {
			int value = j / i;
			System.out.println(value);
		} catch (Exception e) {
			//sSystem.out.println("Divided by zero");

			e.printStackTrace();
		System.out.println(e.getMessage());

		} finally {
			System.out.println("Finally Block");
		}

	}
}
