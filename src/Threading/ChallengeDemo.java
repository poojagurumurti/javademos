package Threading;

public class ChallengeDemo {
	public static void main(String[] args) {
			
		Runnable r1=new Runnable() {
			public void run() {
				for(int i=1;i<=10;i++) {
					if(i%2==0)
					Utils.printmessage(""+i);
					
				}
			}
		};
		Runnable r2=new Runnable() {
			public void run() {
				for(int i=1;i<=10;i++) {
					if(i%2!=0)
					Utils.printmessage(""+i);
					
				}
			}
		};

//		ThrA ta = new ThrA();
//		ta.start();
//		
//		ThrB tb = new ThrB();
//		tb.start();
//		
//		ThrC tc = new ThrC();
//		tc.start();

		Thread t1= new Thread(r1);
		t1.setName("TEven");
		t1.start();
		
		Thread t2= new Thread(r1);
		t2.setName("TOdd");
		t2.start();
		
		for(int i=1;i<=10;i++) {
			Utils.printmessage(""+i);
		}
		
		
	}

}

//create a thread to print odd numbers btw 0 tp 10
//create another thread to print even numbers btw 0 to 10
//from the main thread, print all the numbers 0 to 10 and start
//the even number thread and odd number thread
//total three threads
//give name to each thread

//class ThrA extends Thread{
//	public void run() {
//		for(int i=0;i<=10;i++) {
//			if(i%2==0) {
//				System.out.println("Even numbers "+i);
//			}
//		}
//	}
//}
//
//class ThrB extends Thread{
//	public void run() {
//		for(int i=0;i<=10;i++) {
//			if(i%2!=0) {
//				System.out.println("Odd numbers "+i);
//			}
//		}
//	}
//}
//
//
//class ThrC extends Thread{
//	public void run() {
//		for(int i=0;i<=10;i++) {
//			System.out.println("Natural numbers from 1 to 10 :"+i);
//		}
//		System.out.println ("\n");
//	}
//}