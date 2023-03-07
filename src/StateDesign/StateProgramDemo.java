package StateDesign;

import java.util.Scanner;

public class StateProgramDemo {
	Controller controller;
	
	StateProgramDemo (String conn){
		 controller = new  Controller();
		 
		 if(conn.equalsIgnoreCase("mongodb")) {
		 	controller.setMongoDBConnection();
	}
	else if(conn.equalsIgnoreCase("s3")) {
		controller.setS3Connection();
	}
	else if(conn.equalsIgnoreCase("DynamoDB")) {
		controller.setDynamoDB();
	}
		controller.connect();
		controller.close();
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the databse u want to connect to");
		String dbName = sc.next();
		new StateProgramDemo(dbName);

	}

}
