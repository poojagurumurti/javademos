package innerclass;


public class InnerClassesDemo {

	public static void main(String[] args) {
		ElectronicDevice.poweron();
		
		ElectronicDevice.Chip.displaybrandname();
		
		//Non-static method inside the static class
		ElectronicDevice.Chip chip =new ElectronicDevice.Chip();
		chip.specs();
		
		//Non static Inner class
		ElectronicDevice laptop = new ElectronicDevice();
		laptop.poweron();
		ElectronicDevice.Processor proc =laptop.new Processor();
		proc.getVoltage();
		
		//static method inside the non-static class
		ElectronicDevice.Processor.displayProcessorBrand();
	}

}
class ElectronicDevice{
	static void poweron() {
		System.out.println("Device powered on....");
	}
	//static inner class
	static class Chip{
		static void displaybrandname() {
			System.out.println("From Sony");
		}
//		static void currentFlow() {
//			System.out.println("Current flow....");
//		}
		void specs() {
			System.out.println("Specifications for this chip...");
		}
	}
	//non-static inner class
	class Processor{
		void getVoltage() {
			System.out.println("Display voltage on the processor....");
		}
		static void displayProcessorBrand() {
			System.out.println("Processor brand displayed");
		}
	}
}