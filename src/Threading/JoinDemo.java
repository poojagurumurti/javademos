package Threading;
import java.util.Scanner;

public class JoinDemo {
	
	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		Utils.printmessage("Sum of first 'N' numbers");
		Utils.printmessage("Enter a value");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		Calculator calc= new Calculator(n);
		calc.start();
		
		try {
			calc.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Utils.printmessage(" Sum of first " +n +" numbers= "+calc.getSum());
		long endtime =System.currentTimeMillis();
		Utils.printmessage(" Total time taken " +(endtime-starttime)/1000 +" seconds ");
		
	}
	
//	private static void printmessage(String message) {
//		System.out.println(Thread.currentThread().getName()+"-"+message);
//	}

}
class Calculator extends Thread{
	int n;
	int sum;
	Calculator(int n){
		this.n=n;
	}
	public void run() {
		for(int i=1;i<=n;i++) {
			this.sum+=i;
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
	public int getSum() {
		return sum;
	}
}