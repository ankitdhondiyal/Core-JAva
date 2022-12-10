package in.co.rays.basic;

public class calculatorSwitchCase {

	public static void main(String[] args) {

		int a = 5;

		int b = 10;

		int A = 1;

		switch (A) {

		case 1:
			System.out.println(a + b);
			break;

		case 2:
			System.out.println(a - b);
			break;

		case 3:
			System.out.println(a * b);
			break;

		case 4:
			System.out.println(a / b);
			break;

		default:
			System.out.println("default");
			break;
		}
	}
}
