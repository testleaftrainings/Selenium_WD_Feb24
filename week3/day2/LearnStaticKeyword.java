package week3.day2;

public class LearnStaticKeyword {
	// Gobal varibale
		int num = 1;
	// class varibale or instance varibale or static variable
	public static int  x = 5;
	
	
	
	public static void main(String[] args) {
		LearnStaticKeyword lsk = new LearnStaticKeyword();
		System.out.println("****Starting point of the main method***");
		System.out.println(lsk.num);// To call non static varible i
		System.out.println(lsk.x);
		System.out.println("***ending point of the main method****");
	}
	
	
	
	
	public void nonStaticMethod() {
		System.out.println("This is non-static varibale "+ num);
		System.out.println("This is static varibale "+ x);
		
	}
	
	public void normalMethod() {
		nonStaticMethod();
		staticMethod();
	}
	
	public static void staticMethod() {
//		System.out.println("This is non-static varibale "+ num); // non-static variable is not possible to call directly inside the static method
		System.out.println("This is static varibale "+ x);
//		normalMethod(); // non-static methods are not allowed to call directly inside the static method.
	}
	
	
	{
		System.out.println("-----Starting point of the normal block-----");
		System.out.println("This is normal block or non-static block");
		System.out.println(num);// normal/non-static varibale
		System.out.println(x);// static variable
		nonStaticMethod();
		normalMethod();
		staticMethod();
		System.out.println("----Ending point of the normal block-----");
	}
	
	
	
	static {
		System.out.println("=====Starting point of the static block======");
		System.out.println("This is static block");
		
		System.out.println("This is normal block or non-static block");
//		System.out.println(num);// normal/non-static varibale
		System.out.println(x);// static variable
//		nonStaticMethod();
//		normalMethod();
		staticMethod();
		System.out.println("=====Ending point of the static block======");
		
	}

	
	

}
