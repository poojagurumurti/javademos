package javademosproject;


public class javanonstaticdemo {
	public javanonstaticdemo() {} //Compiler adds the default constructor
//	public javanonstaticdemo() {
//		System.out.println("from Constructor");
//		//gets executed when we create a object
//	}
	static{
		System.out.println("from static-block-1");
	}
	{
		System.out.println("from non-static-block-1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from Main Method");
		 javanonstaticdemo jnsd1 = new  javanonstaticdemo();
		 javanonstaticdemo jnsd2 = new  javanonstaticdemo();
		 
		 Car mycar = new Car();
		 System.out.println(mycar.numofwheels);
		 System.out.println(Car.manufacturer); //accessing the static variable
		 

	}

}
