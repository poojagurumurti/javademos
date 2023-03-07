package StateDesign;

public class DynamoDB implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connecting to DynamoDB store...");
		
	}

	@Override
	public void close() {
	System.out.println("Closing the DynamoDB connection...");
		
	}

}
