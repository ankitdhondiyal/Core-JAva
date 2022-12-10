package in.co.rays.basic;

public class DecrementOperators {
	
	public static void main(String[] args) {
		
		int a =5;
		System.out.println("a is "+ a+("\n"));
		
		int b = --a; //Pre Decrement
		
		System.out.println("After Pre Decrement"+"\n");
		System.out.println("a is " +a);
		System.out.println("b is "+b+("\n"));
		
		int A =5;
		System.out.println("A is "+ A+("\n"));
		
		int B = A--; //Post Decrement
		
		System.out.println("After Post Decrement"+"\n");
		System.out.println("A is " +A);
		System.out.println("B is "+B);
			
	}
}