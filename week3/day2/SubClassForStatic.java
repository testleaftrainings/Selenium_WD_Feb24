package week3.day2;

public class SubClassForStatic extends LearnStaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void staticMethod() {
//		System.out.println("This is non-static varibale "+ num); // non-static variable is not possible to call directly inside the static method
		System.out.println("This is static varibale "+ x);
//		normalMethod(); // non-static methods are not allowed to call directly inside the static method.
	}
	
	public void nonStaticMethod() {
		System.out.println("This is non-static varibale "+ num);
		System.out.println("This is static varibale "+ x);
		
	}
	
}
