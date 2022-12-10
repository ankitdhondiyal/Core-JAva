package in.co.rays.basic;

public class TernaryConditionalOperators {
	
	public static void main(String[] args) {
	
		int a=60;
		int b=80;
		
		//Ternary Conditional Operators
		// condition ? expression a to be executed if condition is True : 
		// condition is false;
		
		int maximun=(a>b) ? a : b;
		 System.out.println("Largest no is "+ maximun);
	
		 int smaller=(a<b) ? a : b;
		 System.out.println("Smaller no is "+ smaller+ ("\n"));
		 
	int	A= 10;
	int B= 20;
	int C= 30;
	
	int greater = (A>B) && (A>C) ? A :(B>C) ? B : C; 
	
	System.out.println(greater);
	
	}
}