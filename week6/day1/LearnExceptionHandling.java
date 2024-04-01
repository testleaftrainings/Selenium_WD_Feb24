package week6.day1;

public class LearnExceptionHandling {

	
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5} ;
		try {
			System.out.println(num[2]);
			
		} catch (Exception e) {
			System.out.println(num[0]);
		}
		
		
		try {
			System.out.println(num[5]);
			System.out.println(num[3]/0);
			System.out.println("This is try block");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound exception  occurs");
		} catch (Exception e) {
			System.out.println("This is last Exception");
		}
		
		
		try {
			System.out.println("This is try block");
			try {
				System.out.println("This is nested try block");
				
				System.out.println(1/0); /// ArithmetricException
				System.out.println(num[5]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out if bound");
			}catch (Exception e) {
				System.out.println("Catch block for nested try");
			}
			
			System.out.println("This is try block after nested try");
			
		}catch (Exception e) {
			System.out.println("Last catch block");
		}
		
	}
	
}
