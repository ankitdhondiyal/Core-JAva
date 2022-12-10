package in.co.rays.basic;

public class TypeConversationOrCasting {

	public static void main(String[] args) {

 //Small to big datatype conversation called IMPLICIT type-casting.
		
		int i=5;
		System.out.println(i+"\n");
		
		double d= i;
		System.out.println(d+"\n");
		
// Big to small data-type conversation called EXPLICIT type-casting.
		
		double D= 5;
		System.out.println(D+"\n");
		
		int I= (int)D;
		System.out.println(I);
		
	}
}