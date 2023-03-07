package StateDesign;

public class S3 implements DatabaseConnection {

	public void connect() {
	System.out.println("Connecting to S3 store...."); 
	
		
	}

	public void close() {
		System.out.println("Closing the S3 store connection....");
	}

}
