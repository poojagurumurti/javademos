package javademosproject;

public class loopsdemo {

	public static void main(String[] args) {
		int i,m,k,n,p;
		for( i=1;i<=3;i++) {
			System.out.println("Hello World");
		}
		System.out.println("-----------");
		
		
		//print even numbers from 1 to 10 using for loop
				for( m=1;m<=10;++m) {
					if(m%2==0) {
						System.out.println(m);
					}
				}
				System.out.println("-----------");
//				for( k=0;k<=10;k=k+2) {
//					System.out.println(k);
//				}

		
				//find sum of odd numbers from 1 to 10
				int sum=0;
				for(n =1;n<10;n=n+2) {
					sum +=n;
					
				}
				System.out.println(sum);
				
				System.out.println("-----------");
				
				
				//print numbers from 10 to 1
				for(int j=10;j>0;j--) {
					System.out.println(j);
				}
				
				System.out.println("-----------");
				
		
				for( p=1;p<=10;p++) {
					System.out.println(p);
					if(p>=5)
						break;
					else
						continue;
							
				}
				System.out.println("-----------");
				
				
				
				//while loop
			 int r=1;
			while(r<6) {
				System.out.println("Hello World");
				r++;
			}
				
		
		
		
		
		
		
		
		
		
		
	}

}
