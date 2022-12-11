package ExerciseExceptionHandling;

public class Ans1 {
public static void main(String[] args) {
	
	int a=0;
	int b=5;
	
	try {int c=b/a;
		System.out.println(c);
	}finally{
		System.out.println("Finally block");
	}
}
}
