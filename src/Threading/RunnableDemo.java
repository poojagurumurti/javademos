package Threading;

public class RunnableDemo {

	public static void main(String[] args) {
		Utils.printmessage("Begin main");
		
		ImageProcessor ip = new ImageProcessor();
		Thread t=new Thread(ip);
		t.start();
		
		//Anonymous inner class
		
		Thread t1 = new Thread(new Runnable() {
				public void run() {
					Utils.printmessage("Do some work....");
				}
		});
		t1.start();
		
		//main() is waiting for thread t1 to complete
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		Utils.printmessage("End Main");
	}
}
class ImageProcessor implements Runnable{
	public void run() {
		Utils.printmessage("Processing an Image");
	}
}