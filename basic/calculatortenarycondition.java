package in.co.rays.basic;

public class calculatortenarycondition {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;

		int C = (a + b);
		int D = (a - b);
		int E = (a * b);
		int F = (a / b);

		int sum = (a + b == C) ? C : b;

		int subs = (a - b == D) ? D : b;

		int multip = (a * b == E) ? E : b;

		int div = (a / b == F) ? F : b;

		System.out.println(sum);
	}
}