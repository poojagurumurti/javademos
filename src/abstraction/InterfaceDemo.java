package abstraction;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h = new Honda();
		h.go();
		h.stop();
	}

}
interface Car{
	void go();
	void stop();
}

class Honda implements Car{
	public void go() {
		System.out.println("Inside Honda.go().....");
	}
	public void stop() {
		System.out.println("Inside Honda.stop().....");
	}
}