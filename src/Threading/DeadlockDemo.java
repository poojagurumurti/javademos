package Threading;

public class DeadlockDemo {
	public static void main(String[] args) {
		FirstResource fr=new FirstResource();
		SecondResource sr=new  SecondResource();
		
		 ResourceWorker rw= new  ResourceWorker(fr,sr);
		 Thread t= new Thread(rw);
		 t.start();
		 
		 sr.method1(fr);
	}

}
class ResourceWorker implements Runnable{
	FirstResource fr;
	SecondResource sr;
	
	ResourceWorker(FirstResource fr,SecondResource sr){
		this.fr=fr;
		this.sr=sr;
	}
	public void run() {
		fr.method1(sr);
	}
	
}

class FirstResource{
	public synchronized void method1(SecondResource sr){
		Utils.printmessage("Inside FirstResource.method1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Utils.printmessage("Invoking SecondResource.method2");
		sr.method2();
	}
	public synchronized void method2() {
		Utils.printmessage("FirstResource.method2");
	}
}

class SecondResource{
	public synchronized void method1(FirstResource fr) {
		Utils.printmessage("Inside SecondResource.method1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Utils.printmessage("Invoking FirstResource.method2");
		fr.method2();
	}
	
	public synchronized void method2() {
		Utils.printmessage("SecondResource.method2");
	}
}