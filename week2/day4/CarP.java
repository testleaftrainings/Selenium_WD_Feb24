package week2.day4;

public class CarP extends VehicleGP {
	// variable --> properties
	String carColor = "Red";
	int noOfWheels = 5;
	int noOfDoors = 5;
	boolean isWorking = true;
	
	
	// Method --> Behaviour
	public void applyBrake() {
		System.out.println("Apply brake from car");
	}
	
	public void soundHorn() {
		System.out.println("Sound horn from car");
	}
	
	public void changeGear() {
		System.out.println("Change gear from car");
	}
	
	public void changeSpeed() {
		System.out.println("Change speed from car");
	}
	
	public static void main(String[] args) {
		CarP polo = new CarP();
		polo.applyBrake();
		polo.changeGear();
//		polo.openSunroof();
//		polo.changeOil();
		
	}
	

}
