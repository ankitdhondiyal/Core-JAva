package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx {
	public static void main(String[] args) {

		Collection c = new ArrayList();

		// Add elements into collection

		c.add("Bura mat dhekho");// Index0
		c.add("Bura mat suno");// Index1
		c.add("Bura mat karo");// Index2

		System.out.println("Length of collection is " + c.size());

		// Print all element of a collection

		for (Object ele : c) {
			System.out.println(ele);
		}
// Convert collection to Array
		Object[]arr= c.toArray();
	
//Print all element of array		
		
		for(Object ele: arr) {
			String s= ele.toString()	;
			System.out.println(s);}
		
	}

}
