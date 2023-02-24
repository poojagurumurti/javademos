package javademosproject;

public class typecastingdemo {

	public static void main(String[] args) {
	
		
		byte b=100;
		int a =65;
//implicit casting= casting or conversion happens automatically
//		a=b;
//		System.out.println(a);
//explicit casting means you have to explicitly specify the target data type
		b=(byte)a; //bigger datatype to smaller
		System.out.println(b);
		
		//implicit
		long l=a;
		//char=2 bytes
		char ch='a';
		System.out.println(ch);
		
		//int is 4 bytes.implicit conversion
		int x=ch;
		System.out.println(x);
		
		int y=119;
		char z=(char)y; //bigger to smaller
		System.out.println(z);
		
		
		
		
		
	}

}
