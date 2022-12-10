package in.co.rays.basic;

public class Loop {

	public static void main(String[] args) {
		
		int a=0; //Execute only once
		
		while (a <= 5) {
			
			System.out.println("Hello"+a);
			a++;
		}
		
		System.out.println("\n");

	for (int i=0; i <= 5; i++)	{
		
		System.out.println("Hello"+i);

	}
	
	System.out.println("\n");

	int A=0;
	
	do {
		System.out.println("Hello"+A);
		A++;
		
	}while (A <=5);
	
	
	//1. Statement inside the body of the loop get executed.
	//2. Value Increment.
	//3.Condition checking.
	//4.If condition is TRUE, go to Step1.
	//5.If condition is FALSE, the flow outside the loop.
			
	}
}