package DesignPattern;

import java.util.Scanner;

public class FactoryPatternProgram {
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	NetflixPlanFactory planFactory = new NetflixPlanFactory();
	
	System.out.println("Enter your subscription plan");
	String user_choice=sc.next();
	
	System.out.println("Enter for how many months u want to subscribe the plan for?");
	int n = sc.nextInt();
	
	NetFlixPlan plan = planFactory.getPlan(user_choice);
	
	System.out.println("Monthly bill amount for the plan is: "+plan.getPrice());
	System.out.println("Overall bill amount for the plan is :"+plan.getFinalAmount(n));
	
	
	

	}

}
