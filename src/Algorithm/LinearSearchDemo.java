package Algorithm;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int searchItem = 12;
		int[] arr= {12,45,67,78,89,54};
		int index= linearSearch(arr,searchItem);
		if(index==-1) {
			System.out.println("Item "+searchItem +" not found");
		}else {
		   System.out.println("Item "+ searchItem +" found at "+index);
		
		}

	}

	private static int linearSearch(int[] arr, int searchItem) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] ==searchItem) {
				return i;
			}
		}
		return -1;
	}

}
