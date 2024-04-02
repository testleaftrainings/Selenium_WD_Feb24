package week6.day2;

public class LearnEncapsulation {
	
	private int creditCardPin;// only me can able to access my card pin
	
	// Achive by getter and setter
	
	public int getCardPin() {
		return creditCardPin;
	}
	
	public void setCardPin(int pin) {
		creditCardPin = pin;
	}

	
	public static void main(String[] args) {
		LearnEncapsulation le = new LearnEncapsulation();
		// set pin to the card
		le.setCardPin(1234);
		System.out.println(le.getCardPin());
		System.out.println(le.creditCardPin);
	}
	
	
	
	
}
