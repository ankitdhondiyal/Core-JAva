package in.co.rays.basic;

public class StringRefrenceAndValue {

	public static void main(String[] args) {

		String s1 = "Ram";// String literal pool
		String s2 = "Ram";

		String S1 = new String("Ram");// Heap memory
		String S2 = new String("Ram");

		boolean result1 = (s1 == s2);// Check Reference (Address/Location)
		System.out.println(result1);

		boolean result2 = (s1.equals(s2));// Check value
		System.out.println(result2 + ("\n"));

		boolean result3 = (S1 == S2); // Check Reference (Address/Location)
		System.out.println(result3);

		boolean result4 = (S1.contentEquals(S2));// Check value
		System.out.println(result4);

	}
}
