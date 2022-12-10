package in.co.rays.basic;

public class IfElseExample {
	public static void main(String[] args) {

		int a = 10;
		if (a > 0) {

			System.out.println("Inside IF Block" + ("\n"));

		} else {
			System.out.println("Insise ELSE block");
		}

		int A = 0;

		if (A < 0) {

			System.out.println("Insise IF Block");

		} else {
			System.out.println("Inside ELSE Block" + ("\n"));
		}

		int b = -1;
		if (b > 0) {
			System.out.println("Inside If Block");

		} else if (b < 0) {
			System.out.println("Insise ELSE IF Block" + ("\n"));

		} else {
			System.out.println("Insise Else block");

		}

		int c = 0;
		int C = 10;

		if (c > C || 0 < C) {
			System.out.println("Logical OR" + ("\n"));

		} else {
			System.out.println("Default Block");

		}

		int d = 8;
		int D = 5;

		if (d > D && D < 8) {
			System.out.println("Logical AND");

		} else {
			System.out.println("Default Block");

			//////////////////////

			int F = 0;
			int G = 2;
			int H = 3;
			int I = 6;

			if (F + G + H > I) {
				System.out.println("Inside IF Block");

			} else if (F + G + H < I) {
				System.out.println("Insisde ELSE IF Block");

			} else {
				System.out.println("Inside ELSE Block");

			}

		}
	}
}