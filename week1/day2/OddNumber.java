package week1.day2;

public class OddNumber {

	public static void main(String[] args) {
		//Print odd number from 1 to 20
		
		// Shortcut for for loop --> type for do ctrl + spacebar and choose the second option
		
		for (int i = 1; i <=20; i++) {
			// condition to check number is odd
			//1%2=0.5-->1, 3%2=0.5-->1
//			System.out.println(i%2);
			if(i%2==0) {
			System.out.println(i);
			}
		}

	}

}
