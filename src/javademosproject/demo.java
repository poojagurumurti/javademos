package javademosproject;



public class demo {
	public static void main(String args[]) {
		System.out.println("From main Method");
		
	}
	
	static {
		System.out.println("From static block1");
	}
	static {
		System.out.println("From static block2");
	}

}
//static blocks get executed by itself but not the static methods()