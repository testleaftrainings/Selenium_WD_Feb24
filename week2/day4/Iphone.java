package week2.day4;

public class Iphone extends Phone{

	public void makeCall(long phno) {
		System.out.println("Make a call through facetime");
	}
	
	
	public static void main(String[] args) {
		Iphone ip = new Iphone();
		ip.makeCall();
		ip.sendMsg();
		ip.torchOn();
	}
}
