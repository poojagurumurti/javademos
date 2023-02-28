package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		
		divideByZeroDemo();
//		multiCatchDemo();
		try {
			checkedExceptionDemo();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

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
		
	}catch(ArithmeticException aex) {
			System.out.println("Arithmetic Exception occured.   "+aex.getMessage());
		}finally {
			System.out.println("End of calci");
		}
}


private static void multiCatchDemo() {
	
	try {
		String s="7";
		int i=Integer.parseInt(s);
		System.out.println("Converted integer="+i);
		String s2 =null;
		System.out.println("Length of my string= "+s2.length());
	}catch(NumberFormatException nex) {
		System.out.println("Number format exception occured"+nex.getMessage());
	}catch(NullPointerException npex) {
		System.out.println("Null pointerexception occured"+npex.getMessage());
	}
	catch(Exception ex) {
			System.out.println("Exception occured. "+ex.getMessage()+ex.toString());
		}
	
}


//CompileTime Exception
private static void checkedExceptionDemo() throws FileNotFoundException {
	FileInputStream  fis = new FileInputStream("C:\\Users\\ptamragouri\\Documents\\check.txt");
}



}
