package abstraction;

public final class FinalKeywordDemo {
	public static void main(String args[]) {
		int x=5;
		x=6;
		B b = new B();
		b.doSomeWork();
	}
	
}
 class A{
	final void doSomeWork() {
		System.out.println("A is doing some work");
	}
}
class B extends A{
//	void doSomeWork() {
//		System.out.println("B is doing some work");
//	}
}