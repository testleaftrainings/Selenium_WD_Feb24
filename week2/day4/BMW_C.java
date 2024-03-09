package week2.day4;

public class BMW_C extends CarP{// to inherit a another class use extends keyword

	int noOfAirBags = 8;
	
	
	public void reverseCamera() {
		System.out.println("Reverse camera from bmw");
	}
	
	
	
	
	public static void main(String[] args) {
		BMW_C x5 = new BMW_C();
		x5.reverseCamera();
		//CarP car = new CarP();
		x5.changeGear();
		x5.changeSpeed();
		
		
		
		
	}
	
}
