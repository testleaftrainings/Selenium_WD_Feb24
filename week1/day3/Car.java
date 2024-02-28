package week1.day3;

public class Car {
	// Global variable - outside the method and inside the class
	int noOfWheels = 4 ;
	String colour = "Green";
	boolean isWorking;
	int noOfmirrors;
	String modelName;
	
	public void playMusic() {
		System.out.println(noOfWheels);
		System.out.println("Hey Siri Play Music");
	}
	
	public void driveCar() {
		noOfWheels = 5;
		//Local variable 
		int speed = 120;
		System.out.println("Drive a car at 60KM/H");
	}
	
	
	public void soundHorn() {
		System.out.println("Sound horn");
	}
	
	public void applyBrake() {
		System.out.println("Apply brakes");
	}
	
	
	
	public static void main(String[] args) {
		// Classname objectname = new Classname();
	/*	Car countryman = new Car();
		countryman.colour = "Green";
		countryman.noOfWheels = 4;
		countryman.noOfmirrors = 3;
		countryman.isWorking = true;
		countryman.modelName = "D3";
		System.out.println("Countryman wheels " + countryman.noOfWheels );
		countryman.playMusic();
		countryman.driveCar();
		System.out.println(countryman.colour);*/
		System.out.println("-----------------------------------------");
		Car mini = new Car();
		Car cooper = new Car();
		System.out.println("Cooper color "+cooper.colour);
		System.out.println("Cooper wheels " + cooper.noOfWheels);
		cooper.driveCar();
		System.out.println("Cooper wheels " + cooper.noOfWheels);
		
		
		System.out.println(mini.noOfWheels);
		
		
	}

}
