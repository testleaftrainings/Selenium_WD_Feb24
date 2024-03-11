package week3.day1;

public class Iphone13 extends Apple {

	public static void main(String[] args) {
		Iphone13 ip13 = new Iphone13();
		ip13.makeCall();
		ip13.sendMsg();
		ip13.sendMsg();
		ip13.backCamera();
		ip13.forntCamera();
		ip13.playMusic();
		ip13.chargingPort();
	}

	@Override
	public void backCamera() {
		System.out.println("Back Camera pixel is 12MP + 12MP");
	}

	@Override
	public void forntCamera() {
		System.out.println("fornt camera pixels is 12MP");
		
	}

	@Override
	public void wirelessCharging() {
		System.out.println("It support wireless Charging");		
	}

}
