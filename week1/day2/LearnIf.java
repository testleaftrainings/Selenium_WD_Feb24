package week1.day2;

public class LearnIf {

	public static void main(String[] args) {
		
		// Syntax if(condition){}
		int x = 27;
		System.out.println(x>0);
		
		
		
		if(x>0) { //-27>0 --> false  27>0 --> true
			System.out.println("The number is positive");
		}else {
			System.out.println("The number is negative");
		}
		
		
		// if i score more than 90 - i get playstation
		// if i score more than 80 - i  get ice cream
		// if i score more than 50 - i get chocolate
		// if i get less than 50 or 50 - i get nothing
		System.out.println("---------------------------------------------");
		int score = 85;
		//   && --> and operator used to check both condition
		//   || --> or operator used to check ethier anyone of condition is satisfied
		if(score>=91) {
			System.out.println("Play station");
		}else if((score>50)||(score<=80)) {
			System.out.println("Chocolate");
		}else if((score>80)&&(score<=90)) {
			System.out.println("Ice cream");
		}else {
			System.out.println("nothing");
		}
		
	}

}
