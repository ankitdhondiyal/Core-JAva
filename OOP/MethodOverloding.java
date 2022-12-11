package in.co.OOP;
//Compile time polymorphism or Static binding.

public class MethodOverloding {

	public static void main(String[] args) {

		disply(1);
		disply(1, 4);
		disply("Hey", "Hello", "Hi", "Hii");

	}

	private static void disply(String S, String T, String U, String V) {
		System.out.println("Arguments : " + S + ", " + T + ", " + U + " and " + V);
	}

	private static void disply(int i, int j) {
		System.out.println("Arguments : " + i + " and " + j);
	}

	private static void disply(int i) {
		System.out.println("Argument :" + i);
	}

}
