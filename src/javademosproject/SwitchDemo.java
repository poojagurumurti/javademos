package javademosproject;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int userOption =4;
		switch (userOption) {
		case 1:
			System.out.println("Main Menu");
			break;
		case 2:
			System.out.println("Existing Customer");
			break;
		case 3:
			System.out.println("New Customer");
			break;
		default:
			System.out.println("Plz select a valid option");
			
			
		}
	}

}
