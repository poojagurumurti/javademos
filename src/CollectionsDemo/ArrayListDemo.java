package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {	
		demo3();
	 
	}
	private static void demo1() {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20.4);
		list.add("hello");
		System.out.println(list);
	}
	private static void demo2() {
		ArrayList<String> newlist =new ArrayList<String>();
		 newlist.add("10");
		 newlist.add("hello");
		 System.out.println(newlist);
	}
	private static void demo3() {
		 ArrayList<Integer> intlist =new ArrayList<Integer>();
		 for(int i=10;i<=100;i=i+10) {
			 intlist.add(i);
		 }
		 System.out.println(intlist);
		 
		 intlist.add(2,100);
		 System.out.println(intlist);
		 //set value of position 3 to 101
		 intlist.set(3, 101);
		 System.out.println(intlist);
		 //remove a value from the list
		 intlist.remove(3);
		 System.out.println(intlist);
		 //search for a value
		 int value = 111;
		 if(intlist.contains(value)) {
			 System.out.println("In list");
		 }else {
			 System.out.println("Not In list");
		 }
	}
}
