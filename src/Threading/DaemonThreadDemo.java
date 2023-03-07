package Threading;

public class DaemonThreadDemo {
	public static void main(String[] args) {
		Utils.printmessage(Thread.currentThread().isDaemon());
		Worker1 worker=new Worker1();
//		worker.setDaemon(true);
		Thread.currentThread().setDaemon(true);
		Utils.printmessage(worker.isDaemon());
		worker.start();
//		worker.setDaemon(true);cannot set daemon after it has started
//		try {
//			worker.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

	}

}
class Worker1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			Utils.printmessage(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
