package javademosproject;

public class javanonstaticdemo {
	public javanonstaticdemo() {
		System.out.println("from Constructor");
		
	}
	{
		System.out.println("from non-static-block-1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from Main Method");
		 javanonstaticdemo jnsd = new  javanonstaticdemo();

	}

}
