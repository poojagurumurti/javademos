package Threading;

public class ThreadCommunicationDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread mythread= new MyThread();
		Thread t = new Thread(mythread);
		t.setName("T1");
		t.start();
		synchronized(t) {
			Utils.printmessage("Going to wait");
			t.wait();

//			try {
//				t.wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			Utils.printmessage("Notified");
			Utils.printmessage("Total = "+mythread.total);
		}

	}

}
class MyThread implements Runnable{
int total;
	@Override
	public void run() {
		Utils.printmessage("Calculating Sum");
		//block level synchronization
		synchronized (this) {
		for(int i=0;i<=100;i++) {
			total+=i;
		}
		
		Utils.printmessage("Calculation completed...Notifying");
		this.notify();
	 }
	}
	public int getTotal()
	{	
		return total;
	}
}