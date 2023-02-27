package abstraction;

public class AbstractionDemo {
	public static void main(String[] args) {
		BMWThreeSeries  b3= new BMWThreeSeries();
		b3.accelerate();
		b3.start();

		
		BMWFiveSeries  b5= new BMWFiveSeries();
		b5.accelerate();
		b5.start();
		
		BMW bmw = new BMWThreeSeries();
		bmw.start();
		bmw.accelerate();
	}

}
abstract class BMW{
	void start() {
		System.out.println("BMW started.....");
	}
	abstract void accelerate();
	
}
class  BMWThreeSeries extends BMW{
	void accelerate() {
		System.out.println("Three times acceleration.....");
	}
}
class  BMWFiveSeries extends BMW{
	void accelerate() {
		System.out.println("Five times acceleration.....");
	}
}
