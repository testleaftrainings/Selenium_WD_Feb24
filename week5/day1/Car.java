package week5.day1;

public class Car extends Vehicle{

	final String colour ="Black";
	String modelName = "X3";
	
	public void getCarDetails() {
		
//		Car c = new Car();
//		colour = "blue";
		System.out.println("Colour from car class "+ colour);
		System.out.println("Model name from car class "+ modelName);
		System.out.println("Brand name from vehicle class " + super.brandName);
		System.out.println("Modle name from vehicle class "+ super.modelName);
	}
	
	public  void getCarInfo(){
		getCarDetails();
		super.getCarDetails();
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.getCarInfo();
		
	}
	
}
