package javademosproject;

public class demo2 {

	public static void main(String[] args) {
			System.out.println("From main Method");
			method1();
			method2();
			//method3(); From the static method non-static method can't be called
			
			demo2 dem2=new demo2();
			dem2.method3();
		}
		
		static void method1() {
			System.out.println("From static method1");
		}
		static void method2(){
			System.out.println("From static method2");
		}
		void method3() {
			System.out.println("From non static method3");
		}

	}


