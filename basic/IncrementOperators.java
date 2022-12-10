package in.co.rays.basic;

public class IncrementOperators {
	
	public static void main(String[] args) {
		
		int a= 10;
		System.out.println(("a= ")+a+ ("\n"));
		
		int b= ++a; // Pre Increment
		
		System.out.println("After Pre Increment"+"\n");
		System.out.println(a);
		System.out.println(b+("\n"));
		
		int A=10;
        System.out.println(("A= ")+A+ ("\n"));
		
		int B= A++; // Post Increment
		
		System.out.println("After post Increment"+"\n");
		System.out.println(A);
		System.out.println(B);
				
	}
}