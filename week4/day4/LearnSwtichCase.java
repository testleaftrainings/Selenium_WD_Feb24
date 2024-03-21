package week4.day4;

public class LearnSwtichCase {

	public static void main(String[] args) {
		
		String day = "monday";
		
		switch(day) {
		
		case "monday":
			System.out.println("Monday is a working day ");
			break;
		
		case "tuesday":
			System.out.println("Tuesday is a working day");
			break;
			
		case "wednesday":
			System.out.println("Wednesday is a working day");
			break;
				
		case "Thursday":
			System.out.println("Thursday is a working day");
			break;
				
		case "friday" :
			System.out.println("Friday is a holiday");
			break;
				
		case "saturday":
			System.out.println("Saturday is a weekend");
			break;
			
		case "sunday":
			System.out.println("Sunday is a weekend");
			break;
			
		default:
			System.out.println("Invalid day");
			
		}
		
		
	}

}
