package polymorphism;

public class RuntimePolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MacBook  mac= new MacBookPro();
		mac.start();
		mac.shutdown();
	}

}
//method overriding
class MacBook{
	void start() {
		System.out.println("Macbook started");
	}
	void shutdown() {
		System.out.println("Macbook shutdown");
	}
}
class MacBookAir extends MacBook{
	void start() {
		System.out.println("MacbookAir started");
	}
	void shutdown() {
		System.out.println("MacbookAir shutdown");
	}
}

class MacBookPro extends MacBook{
	void start() {
		System.out.println("MacbookPro started");
	}
	void shutdown() {
		System.out.println("MacbookPro shutdown");
	}
}