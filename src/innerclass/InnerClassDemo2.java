package innerclass;

public class InnerClassDemo2 {

	public static void main(String[] args) {
		Car car = new Car("Blue");
		car.start();
		
		Car.MusicSystem ms= car.new MusicSystem(8);
		ms.displayDetails();
		
		ms.playSomeMusic();

	}
}
class Car{
	private static String model="Hundai I20 Automatic";
	private int speed;
	private String colour;
	
	void start() {
		System.out.println("Car with"+colour+"Colour is starting");
	}
	
	Car(String colour){
		this.colour=colour;
	}
	
	class MusicSystem{
		private int numofchannels;
		MusicSystem(int num){
			this.numofchannels=num;
		}
		void displayDetails() {
			System.out.println("Model for the car: "+Car.model);
			System.out.println("The colour of the car:"+Car.this.colour);
			System.out.println("Number of channels in MusicSystem:"+this.numofchannels);
			
		}
		
		//Class inside the method
		void playSomeMusic() {
			System.out.println("Playing some music");
			
			class Channel{
				int frequency;
				void getCurrentPlayingSong() {
					System.out.println("Displaying current playing song");
				}
			}
			Channel channel = new Channel();
			channel.getCurrentPlayingSong();
		}
	}
	
		
	
}