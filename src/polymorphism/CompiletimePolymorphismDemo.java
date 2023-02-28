package polymorphism;

public class CompiletimePolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePolymorphism ctp = new CompileTimePolymorphism();
		ctp.add(1,3);
		ctp.add(1.25f,3.65f);
		ctp.add(1, 2, 3);
		ctp.add("a","b");
	}

}

class CompileTimePolymorphism{
	//method overloading
	void add(int a, int b) {
		int result = a+b;
		System.out.println("Addition of 2 integers="+result);
	}
	public void add(String s1, String s2) {
		String result = s1+s2;
		System.out.println("Addition of 2 strings="+result);
	}
	void add(float a, float b) {
		float result = a+b;
		System.out.println("Addition of 2 non-integers="+result);
	}
	void add(int a, int b, int c) {
		int result = a+b+c;
		System.out.println("Addition of 3 numbers="+result);
	}
}
