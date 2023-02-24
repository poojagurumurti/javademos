package javademosproject;

public class BoxingUnBoxingDemo {
	public static void main(String args[]) {
		//Wrapper types
		int i=10;//primitive
		Integer a = new Integer(10);//corresponding object representation of the primitive type

		
		//Boxing- automatic conversion of primitive to wrapper class
	     Integer x=5;
	     
		//UnBoxing - conversion of wrapper class to primitive class
	     Integer a1 = new Integer(70);
	     int z= a1;
	     System.out.println(z);
	     
	     Integer y=200;
	     if(y>100) { //Unboxing
	    	 System.out.println(y);
	     }
	     main();
	     
	}
	public static void main() {
		 System.out.println("Fake main");
}
}