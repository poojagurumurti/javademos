package inheritance;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		System.out.println(car.fuel());
		Bus bus = new Bus();
		System.out.println(bus.fuel());
		Bike bike = new Bike();
		System.out.println(bike.fuel());
		

	}

}
class Vehicle{
	String fuel() {
		return "Petrol";
	}
}

class Bus extends Vehicle{
	String fuel() {
//		return "CNG";
		return super.fuel();
	}
}
class Car extends Vehicle{
	String fuel() {
		return "Diesel";
	}
}
class Bike extends Vehicle{
	
}
