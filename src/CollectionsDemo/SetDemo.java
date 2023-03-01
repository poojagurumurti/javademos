package CollectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
//		randomDemo();
		hashsetdemo();

	}
	private static void randomDemo() {
		Random obj=new Random();
		int x=obj.nextInt(100,200);
		System.out.println(x);
	}
	private static void hashsetdemo(){
		Random obj1=new Random();
		List<Integer>list=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			list.add(obj1.nextInt(1,10));
			
		}
		System.out.println(list);
		Set<Integer> set=new HashSet<>(list);
		System.out.println(set);
		
		Set<Integer> set2=new LinkedHashSet<>(list);//same(order) as the that of ArrayList
		System.out.println(set2);
		
		Set<Integer> set3=new TreeSet<>(list);//HashSet(same)
		System.out.println(set3);
	}

}
