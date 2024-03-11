package week3.day1;

public interface RBI {

	
	//AccessModifier returnType methodName (input arguments)
	
	//100 % Abstract because all the methods are unimplemented methods
	void KYC();// unimplement method
	
	public void depositLimit();
	
	public void withdrawlLimit();
	
	default void upiPayments() {
		System.out.println("Enable upi payments for mobile banking");
	}
	
	
	
	
	
}
