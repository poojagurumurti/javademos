package Threading;

import java.util.ArrayList;

public class GarbageCollectionDemo {
	public static void main(String[] args) {
		new House(1);
		new House(2);
//		ArrayList<House>houses = new ArrayList<>();
//		for(int i=1;i<=100000;i++) {
//			houses.add(new House(i));
//			new House(i);
//		}
		//We can request gc to run.
		System.gc();
	}

}
class House{
	int id;
	
	House(int id){
		this.id=id;
		Utils.printmessage("House created -"+id);
	}
	
	protected void finalize() throws Throwable{
		Utils.printmessage("House Destroyed");
	}
}