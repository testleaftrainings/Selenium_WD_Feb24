package week6.day1;

public class LearnTryFinally {

	public static void main(String[] args) {
		
		try{
			System.out.println("This is try block");
		}finally {
			System.out.println("This is finally block");//Finally block always execute
		}
		
		
		try {
			System.out.println(1/0);
		}catch (Exception e) {
			System.out.println("This is catch block");
		}finally {
			System.out.println("Disconnect the db");
		}
	}
}
