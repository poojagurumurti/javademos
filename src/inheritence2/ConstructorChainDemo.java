package inheritence2;

public class ConstructorChainDemo {

	public static void main(String[] args) {
//		ChildClass cc= new ChildClass();
		ChildClass cc= new ChildClass(10);

	}

}
class SuperClass{
	int x;
	SuperClass(){
		System.out.println("No args constructor");
	}
	SuperClass(int x){
		this.x= x;
		System.out.println("One arg superclass constructor");
	}
}
class ChildClass extends SuperClass{
	ChildClass(){
		this(10);
		System.out.println("No args child class constructor");
		
	}
	ChildClass(int y){
		super(y);
		System.out.println("One arg child class constructor called");
	}
}