package javademosproject;

public class loopsdemo {

	public static void main(String[] args) {
		int i,k;
		for( i=1;i<=3;i++) {
			System.out.println("Hello World");
		}
		//print even numbers from 1 to 10 using for loop
		for( i=1;i<=10;++i) {
			if(i%2==0) {
				System.out.println(i);
			}
			System.out.println("-----------");
			for( k=0;k<=10;k=k+2) {
				System.out.println(k);
			}
			//find sum of odd numbers from 1 to 10
			int sum=0;
			for(i =1;i<10;i=i+2) {
				sum +=i;
				
			}
			System.out.println(sum);
			//print numbers from 10 to 1
			for(int j=10;j>0;j--) {
				System.out.println(j);
			}
		}
	}

}
