package Algorithm;

import java.util.Arrays;

public class BubbleSortDemo {
	public static void main(String[] args) {
		int[] numbers= {99,44,6,2,1,5,63,87,283,4,0};
		System.out.println("Before sorting: "+Arrays.toString(numbers));
		long start =System.currentTimeMillis();
		System.out.println("After sorting: "+Arrays.toString(bubbleSort(numbers)));
		long end =System.currentTimeMillis();
		System.out.println("Time: "+(end-start));

	}

	 static int[] bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					int temp =array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}

}
