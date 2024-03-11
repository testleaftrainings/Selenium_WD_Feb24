package week3.day1;

public class SBI implements RBI{

	public static void main(String[] args) {
	
		SBI sbi = new SBI();
		sbi.KYC();
		sbi.withdrawlLimit();
		sbi.depositLimit();
		sbi.upiPayments();
		
	}
	
	//implemented method
	public void KYC() {
		System.out.println("KYC is mandatory to open a account");		
	}

	public void depositLimit() {
			System.out.println("Deposit amount is more than 49,999 pan card is required");	
	}

	public void withdrawlLimit() {
		System.out.println("Withdrawal limit is 1,00,000 per day");
	}

}
