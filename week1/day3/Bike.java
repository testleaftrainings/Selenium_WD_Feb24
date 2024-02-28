package week1.day3;

public class Bike {

	public void applyBrake() {
		System.out.println("This is apply brake from bike class");
	}
	
	public static void main(String[] args) {
		// create an object for car class inside the bike class
		
		Car countryman = new Car();
		countryman.applyBrake();
		countryman.driveCar();
		countryman.modelName = "Gsr 1000rr";
		
		Car mini = new Car();
		
		Bike bmw = new Bike();
		bmw.applyBrake();

	}

}
