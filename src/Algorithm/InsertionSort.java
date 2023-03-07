package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
		public static void main(String[] args) {
//			int[] numbers= {99,44,6,2,1,5,63,87,283,4,0};
			List<Integer>numbers = new ArrayList<>();
			numbers.add(99);
			numbers.add(44);
			numbers.add(6);
			numbers.add(5);
			numbers.add(63);
			numbers.add(87);
			numbers.add(4);
			System.out.println("Before sorting: "+numbers);
			
			System.out.println("After sorting: "+insertionSort( numbers));
			
			
		}

	static List<Integer> insertionSort(List<Integer> numbers) {
		for(int i=0;i<numbers.size();i++) {
			
			if(numbers.get(i)<=numbers.get(0)) {
				numbers.add(0,numbers.get(i));
				numbers.remove(i+1);
			}
			else if(numbers.get(i)<numbers.get(i-1)) {
				for(int j=1;j<i;j++) {
					if(numbers.get(i)<numbers.get(j)) {
						numbers.add(j,numbers.get(i));
						numbers.remove(i+1);
					}
				}
			}
		}
			
		return numbers;
	}
}

