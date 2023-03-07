package DesignPattern;

public abstract class NetFlixPlan {
	protected int price;
	
	abstract int getPrice();
	
	public int getFinalAmount(int months) {
		return price *months;
	}
	


}
