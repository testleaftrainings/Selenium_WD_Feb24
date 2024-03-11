package week3.day1;

public class MyBank extends AxisBank{

	public static void main(String[] args) {
		MyBank mb = new MyBank();
		mb.KYC();
		mb.depositLimit();
		mb.withdrawlLimit();
		mb.upiPayments();
	}

	public void KYC() {
		System.out.println("KYC is required to apply credit cards");
	}

}
