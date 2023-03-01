package arrays;

import java.io.Serializable;



public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
//		int arr2[];
//		System.out.println(arr);
		printArray(arr);
		
//		arr[0]=13;
//		printArray(arr);
//	
//		arr[3]=new Integer(24);
//		printArray(arr);
//		
//		System.out.println(arr.length);
//		int x=arr[4];
//		System.out.println(x);
//		sumofarray();
//		 sumofEvennumbersInArray();
//		 chararray();
		 arrayofobjects();
	}
	private static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ ",");
		}
		System.out.println();
	}
	//{3,5,4,5,6,3,5,7}//replace that 5's that follow a 3, with zero
	//{3,0,4,5,6,3,0,7}
//	for( int i=1 ; i<arr.length; i++) {
//		if ( arr[i] == 5 && arr[i-1] == 3) {
//			arr[i] = 0;
//		}
//	}
	
	//Sum of array
	private static void sumofarray() {
		int a[] = {2,3,4,5,6,7};
		int sum=0;
		int sum2=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		for (int i:a) {
			sum2+=i;
		}
		System.out.println(sum);
		System.out.println(sum2);
	}
	
	private static void sumofEvennumbersInArray() {
		int a[] = {2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}

	private static void chararray() {
//		char[] c= {'a','z','b','q'};
		String s1="Hello world", res="";
		//print the reverse of the above string s1
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
//		for(char x:s1.toCharArray()) {
//			System.out.println(x);
//			res=x+res;
//			System.out.println(res);
//		}
//		System.out.println("Reversed String:"+res);
	}
	private static void arrayofobjects() {
		Employee[] employees = new Employee[4];
		Employee emp1=new Employee(1,"Mark",12000,"AA1001");
		Employee emp2=new Employee(2,"Jhon",13000,"AB1002");
		Employee emp3=new Employee(3,"Pooja",15000,"AC1003");
		Employee emp4=new Employee(4,"Tota",19000,"AD1004 ");
		employees[0]=emp1;
		employees[1]=emp2;
		employees[2]=emp3;
		employees[3]=emp4;
		for(Employee e:employees) {System.out.println(e);
	}
}
}

class Employee implements Serializable{
	int id;
	String name;
	double salary;	
	String aadharno;
	
	Employee(int id, String name, double salary, String aadharno){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadharno=aadharno;
	}
	public String toString() {
		return this.id + "|"+this.name+"|"+this.salary+"|"+this.aadharno;
	}
 }
