package inheritence2;


public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car  = new Car();
//		car.fuel();
//		Bike  bike  = new Bike();
//		bike.fuel();
		Bus bus = new Bus(1,2,3,4);
		bus.fuel();
		
	}
	
	

}
class Vehicle{
	int a,b;
	Vehicle(int a, int b){
		this.a =a;
		this.b=b;
		
	}
	void fuel() {
		System.out.println("Petrol");
	}
}
class Bus extends   Vehicle{
	int c,d;
	Bus(int a, int b,int c, int d){
		super(a,b);
		this.c=c;
		this.d=d;
	}
	void fuel() {
		super.fuel();
		System.out.println("Diesel");
	}
}
//class Car extends Vehicle{
//	
//}
//class Bike extends Vehicle{
//	
//}
