package CollectionsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Run time polymorphism
public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer>marks=new HashMap<>();
		marks.put("Pooja",90);
		marks.put("Tota", 40);
		marks.put("Jhon", 98);
		marks.put("Tom", 67);
		marks.put("Lee", 89);
		marks.put("Lee", 79);
		System.out.println(marks);
		System.out.println(marks.keySet());
		System.out.println(marks.values());
		for(String key:marks.keySet()) {
			System.out.println(marks.get(key));
		}
		Map<String,Integer>marks2=new LinkedHashMap<>();
		marks2.put("Pooja",90);
		marks2.put("Tota", 40);
		marks2.put("Jhon", 98);
		marks2.put("Tom", 67);
		marks2.put("Lee", 89);
		marks2.put("Lee", 79);
		marks2.put(null, 10);
		System.out.println(marks2);
		
	}

}
