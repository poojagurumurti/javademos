package Exception;
import java.util.*;

public class ExceptionDemo {

	public static void main(String[] args) {
//	divideByZeroDemo();
	stringParserDemo();
//	nullPointerDemo();
	}
	
	
	private static void stringParserDemo() {
		try {
		String s="hello";
		int i=Integer.parseInt(s);
		System.out.println("Converted integer="+i);
		}catch(Exception e) {
			System.out.println("Exception occured");
		}
	}
	private static void nullPointerDemo() {
		String s =null;
		System.out.println("Length of my string= "+s.length());
	}

	private static void divideByZeroDemo() {
		int a,b;
		float c,d;
		System.out.println("Enter numbers to divide...");
		
		Scanner sc = new Scanner(System.in);
		a =sc.nextInt();
		System.out.println("The first number inputted by user="+a);
		System.out.println("Enter one more number...");
		b=sc.nextInt();
		System.out.println("The second number inputted by user="+b);
		try {
			c=a/b;
			d=a%b;
			System.out.println(a+"/"+b+"="+c+",Remainder="+d);
			System.out.println("End of calci");
		}catch(ArithmeticException aex) {
				System.out.println("Arithmetic Exception occured"+aex.getMessage());
			}
	}
	

}
