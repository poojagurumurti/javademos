package CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilsDemo {

	public static void main(String[] args) {
//		CollectionsDemo();
		ArraysDemo();

	}
	private static void ArraysDemo() {
		int[] a = {40,10,15,7};
		for(int i:a)
			System.out.print(i +",");
		System.out.println();
		
		Arrays.sort(a);
		for(int i:a)
			System.out.print(i +",");
		
		System.out.println();
		String[] s = {"V","A","Z","P"};
		List<String>l=Arrays.asList(s);
		System.out.println(l);
		
		}

	private static void CollectionsDemo() {
		List<String>mylist = new ArrayList<>();
		mylist.add("Max");
		mylist.add("Zoe");
		mylist.add("John");
		mylist.add("Will");
		mylist.add("Robert");
		System.out.println(mylist);
		
		//natural ordering
		Collections.sort(mylist);
		System.out.println(mylist);
		
//		//natural ordering
//		Collections.sort(mylist,new MyComparator());
//		System.out.println(mylist);
//		
		//Reversing the natural ordering
		Collections.reverse(mylist);
		System.out.println(mylist);
		
		int result=Collections.binarySearch(mylist,"Max");
		System.out.println("Max found at "+ result);
		
		int result2=Collections.binarySearch(mylist,"Will");
		System.out.println("Max found at "+ result2);

	
	
	}

}
//To change the natural ordering
class MyComparator implements Comparator<String>{
	public int compare(String o1, String o2) {
//		return o1.compareTo(o2); //same as natural ordering
		return o2.compareTo(o1); //reversing 
	}
}
