package innerclass;
public class AnonDemo {
	public static void main(String[] args) {
		PrinterConnection con = PrinterDriver.getConnection();
		con.print();
	}

}
class PrinterDriver{
	static PrinterConnection getConnection() {
		
		//anonymous inner class-->creating a class inside a method without a name
		PrinterConnection con = new PrinterConnection() {
			public void print() {
				System.out.println("Printing....");
			}
		};
		return con;
		
		
//		PrinterConnection pc = new MyPrinterConnection();
//		return pc;
	}
}


interface PrinterConnection{
	void print();
}

//class MyPrinterConnection implements PrinterConnection{
//	public void print() {
//		System.out.println("MyPrinter connection....");
//	}
//}