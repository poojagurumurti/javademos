package javademosproject;

public class operatorsdemo {

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		//arithmetic operator
		int result=a+b;
		System.out.println(result);
		result=a-b;
		result=a/b;
		result=a*b;
		result=a%b;
		
		//unary operators
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		System.out.println(a++);//increment happens after executing the statement
		System.out.println(a);
		System.out.println(++a);//increment happens before executing the statement
		System.out.println(--a);
		
		
		boolean isSelected =false;
		if (!isSelected) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}

		
		//Relational Operators
		//<, > ,!,!=
		//Logical Operators =&& ||
		
		int age = 14;
		boolean drivingClassesAttended = true;
		if(age>15 && drivingClassesAttended) { //both have to be true
			System.out.println("License issued");
		}else {
			System.out.println("Come later..");
		}
		boolean isAccountActive = true;
		int balance =5000;
		if(balance>1000 || isAccountActive) { //one have to be true
			System.out.println("Transaction Approved");
		}else {
			System.out.println("Transaction Rejected");
		}
		
	
	
	//ternary operator
	String license = (age >15 && drivingClassesAttended) ? "License Issued"  : "Come Later";
	System.out.println(license);
	
	int p=5;
	int q=4;
	int min= ((p<q)?p:q);
	System.out.println(min);
	
	//assignment operator
//	q=q+5;
	q+=5;
	System.out.println(q);
	p-=3; 
	System.out.println(p);
	}
}
