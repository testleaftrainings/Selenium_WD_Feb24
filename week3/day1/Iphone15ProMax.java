package week3.day1;

public class Iphone15ProMax extends Apple {

	public static void main(String[] args) {
		Iphone15ProMax ipm = new Iphone15ProMax();
		ipm.backCamera();
		ipm.forntCamera();
		ipm.chargingPort();
		ipm.wirelessCharging();
		ipm.sendMail();
		ipm.makeCall();
		ipm.sendMsg();
	}

	@Override
	public void backCamera() {
		System.out.println("12MP + 12MP + 48MP");
	}

	@Override
	public void forntCamera() {
		System.out.println("12MP");
	}

	@Override
	public void wirelessCharging() {
		System.out.println("Yes it support");		
	}
	
	
	public void chargingPort() {
		System.out.println("Type C port for charging");
	}

}
