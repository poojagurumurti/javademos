package abstraction;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Pooja pgt = new Pooja();
		pgt.setColour("coldBlue");
		System.out.println(pgt.getColour());
		System.out.println(pgt.getNumOfWheels());

	}

}
class Pooja {
	//Initialize the objects with default values
	private String colour;
	private int numofwheels;
	private boolean customisable;
	
	public static String manufacturer="Honda";

	public Pooja() {
		numofwheels=4;
		colour="white";
		customisable=true;
	}
	
	public void setColour(String colour) {
		if(customisable)
			 this.colour=colour;
	}
	public String getColour() {
		return this.colour;
	}
	
	public void setNumOfwheels(int numofwheels) {
		this.numofwheels =numofwheels;
	}
	public int getNumOfWheels() {
		return this.numofwheels;
	}
}
