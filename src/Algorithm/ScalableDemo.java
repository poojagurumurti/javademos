package Algorithm;

public class ScalableDemo {
	public static void main(String[] args) {
//		String[] myarray= {"TV","Computer","Radio","radio","raDio"};
		String[] myarray= {"radio"};
		
		//O(n)-is the time it takes to find an element
		mysearchmethod(myarray);

	}

	//O(n)-n number of operations
	private static void mysearchmethod(String[] myarray) {
		long start =System.currentTimeMillis();
		for(int i=0;i<myarray.length;i++) {
			if(myarray[i]=="radio") {
				System.out.println("Found radio"); 
				
			}
		}
		long end =System.currentTimeMillis();
		System.out.println("Took "+(end-start) +"milliseconds to complete");
	}

	private static void mysearchmethod2(String[] myarray) {
		//O(1)-it doesn't matter what is the size of the array.
				System.out.println("Found radio"); 
	}

}
