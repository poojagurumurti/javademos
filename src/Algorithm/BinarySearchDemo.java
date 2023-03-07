package Algorithm;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int searchItem = 89;
		
		int[] arr= {45,20,67,38,89,54};
		System.out.println("Before sorting: "+Arrays.toString(arr));
		
		
		Arrays.sort(arr);
		System.out.println("After sorting: "+Arrays.toString(arr));
		
		
		int index= binarySearch(arr,searchItem);
		if(index==-1) {
			System.out.println("Item "+searchItem +" not found");
		}else {
		   System.out.println("Item "+ searchItem +" found at "+index);
		
		}

	}

	private static int binarySearch(int[] arr, int searchItem) {
		int firstIndex=0;
		int lastIndex=arr.length-1;
		int middleIndex=(firstIndex + lastIndex)/2;
		
		while(firstIndex <= lastIndex) {
			if(searchItem > arr[middleIndex]) {
				firstIndex = middleIndex +1;
			}else if(searchItem==arr[middleIndex]) {
				return middleIndex;
			}else {
				lastIndex = middleIndex -1;
			}
			middleIndex=(firstIndex + lastIndex)/2;
		}
		return 0;
	}
}


