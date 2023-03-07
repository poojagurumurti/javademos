package StateDesign;

public class MongoDB implements DatabaseConnection{

	@Override
	public void connect() {
		System.out.println("Connecting to MongoDB databse");
		
	}

	@Override
	public void close() {
		System.out.println("Closing the MongoDB connection...");
		
	}

}
