package functionalprogram;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
//		Predicate<Integer>gt20 =(i)->(i>20);
//		System.out.println("Is 15>20: "+gt20.test(15));
//		
//		Predicate<String>stringLengthGreaterThan5 =(s)->(s.length()>5);
//		System.out.println("Hello>5: "+stringLengthGreaterThan5.test("Hello"));
//		
//		Predicate<Integer>gt10 =(i)->(i>10);
//		int[] x= {0,10,20,30,40};
//		m1(gt10,x);
		
		Predicate<Integer>gt5=(i)->(i>5);
		Predicate<Integer> isEven = (i) -> (i%2 == 0);
		int[] y = {1,2,3,4,5,6,7,8,9,10};
		m1(gt5.and(isEven), y);
	}

//	static void m1(Predicate<Integer>p,int[] x) {
//		for(int i:x) {
//			if (p.test(i)) {
//				System.out.println(i);
//			}
//		}
//	}
	
	static void m1(Predicate<Integer> p, int[] x) {
		for (int j : x) {
			if(p.test(j)) {
				System.out.println(j);
			}
		}
	}

//private boolean check(int a) {
//	return a>20;
//}
	
	
	
		
		

	}
