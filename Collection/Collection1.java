package Collection;

import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {

		// Somple code to read element kept inside an arraylist

		ArrayList a = new ArrayList();

		a.add("One");
		a.add("Two");
		a.add("Three");
		a.add("Four");

		// System.out.println(a);
		int size = a.size();
		System.out.println("Size is " + size);

		for (int i = 0; i < a.size(); i++) {
			System.out.println(i + "-" + a.get(i));

		for (Object obj : a)
				System.out.println(obj);
		}
		Integer i = new Integer(4);
		a.add(i);
System.out.println(a);

ArrayList sublist = new ArrayList (a.subList(0,2));
System.out.println(sublist);
 	}
}
