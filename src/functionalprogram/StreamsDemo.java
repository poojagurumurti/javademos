package functionalprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		List<Integer>filteredList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(filteredList);
		
		List<Integer>multipliedBy2=list.stream().map(i->i *2).collect(Collectors.toList());
		System.out.println(multipliedBy2);
		
		//challenge
		List<String>names=new ArrayList<>();
		names.add("MAX");
		names.add("MILLER");
		names.add("JOHN");
		names.add("COLLINS");
		//print an arraylist of lowercase names
		List<String>l2=names.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(l2);
		
		
		Random random= new Random();
		List<Integer> numlist = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			numlist.add(random.nextInt(1,10));
		}
		System.out.println("Original List"+ numlist);
		System.out.println("Sorted List"+numlist.stream().sorted().collect(Collectors.toList()));
		
	}
	
	
//static void traditionalWay(int[] x) {
//	List<Integer> result = new ArrayList<>();
//	for(int i:x) {
//		if(i%2==0)
//			result.add(i);
//	}
   }

