package week3.day1;

public abstract class AxisBank implements RBI{
	
	/*
	 * Totally i have 4 methods 1 method is unimplemented method and 3 methods are implemented methods
	 * So, This AxisBank is 25% Abstract
	 * This is the reason are saying Abstract is 0 - 100 %
	 * */

	public void depositLimit() {
		System.out.println("Deposit limit is 1,00,000 per day");		
	}

	public void withdrawlLimit() {
		System.out.println("Withdrawal limit is 69,999 per day");
	}
	
	
	public void debitCardLimit() {
		System.out.println("Debit card limit is 20,000 per day");
	}
	
	
}
