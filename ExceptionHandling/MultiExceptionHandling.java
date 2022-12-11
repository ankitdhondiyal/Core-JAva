package ExceptionHandling;

public class MultiExceptionHandling {

	public static void main(String[] args) {

		String name = "Vijay";
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String lenght is small");
			 e.printStackTrace();

		} catch (NullPointerException e) {
			System.out.println("Null data or empty data");

			 e.printStackTrace();
		} finally {
			System.out.println("Pandit hu mai");
		}

	}
}
