package in.co.rays.basic;

public class Arrays {

	public static void main(String[] args) {
	
		int[]arr= new int[5];
		
		arr [0] =1;
		arr[1]= 2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
    	// int[] arr1 = {1,2,3,4,5};
		
		int element =arr[1];
		System.out.println("Element at 1st index is "+ element);

		int size=arr.length;
		System.out.println(size);
		
		for (int i=0; i<5;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
