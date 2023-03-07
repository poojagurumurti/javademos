package DesignPattern;

public class NetflixPlanFactory {
	
	public NetFlixPlan getPlan(String plan) {
		if(plan==null) {
			return null;
		}
		if(plan.equalsIgnoreCase("Basic")) {
			return new BasicPlan();
		}
		else if(plan.equalsIgnoreCase("Standard")) {
			return new StandardPlan();
		}
		else if(plan.equalsIgnoreCase("Premium")) {
			return new PremiumPlan();
		}
	
		return null;
	}

	
}
