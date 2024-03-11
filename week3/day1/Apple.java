package week3.day1;

public abstract class Apple  implements MobileFeatures, SmartphoneFeatures{

	@Override
	public void playMusic() {
		System.out.println("Hey siri play some music");
	}

	@Override
	public void takeSnap() {
		System.out.println("Take a snap ");
	}

	@Override
	public void sendMail() {
		System.out.println("send a mail to my manager");
	}

	@Override
	public void voiceAssistance() {
		System.out.println("Hey siri what's the weather like today");
	}

	@Override
	public void makeCall() {
		System.out.println("Make call to my friend");
	}

	@Override
	public void sendMsg() {
		System.out.println("Send a messages");
	}
	
	public void chargingPort() {
		System.out.println("Lighting ports");
	}
	
	public abstract void backCamera();
	
	public abstract void forntCamera();
	
	public abstract void wirelessCharging();

}
