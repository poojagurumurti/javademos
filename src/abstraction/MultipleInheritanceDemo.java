package abstraction;

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TV tv = new TV();
//		tv.poweron();
//		
//		Monitor monitor = new Monitor();
//		monitor.poweron();
		
		 DesktopComputer dc = new  DesktopComputer();
		 dc.powerOn();
	}

}
class ElectronicDevice{
	void poweron(){
		System.out.println("Device powered on");
	}
}
//class TV extends ElectronicDevice{
//	void poweron(){
//		System.out.println("TV GUIDE Screen displayed");
//	}
//}
//class Monitor extends ElectronicDevice{
//	void poweron(){
//		System.out.println("Black screen displayed");
//	}
//}
class DesktopComputer implements TV, Monitor{
	public void powerOn() {
		TV.super.powerOn();
		Monitor.super.powerOn();
	}
}

interface TV{
	public default void powerOn() {
		System.out.println("I1 is starting");
	}
}
interface Monitor{
	public default void powerOn() {
		System.out.println("I2 is starting");
	}
}

