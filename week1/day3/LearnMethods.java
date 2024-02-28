package week1.day3;

public class LearnMethods {

	public void m3() {
		System.out.println("This is m3 method");
	}
	

	public static void main(String[] args) {
		//Syntax: ClassName objectName = new ClassName();
		LearnMethods obj = new LearnMethods();
		obj.m1(); // calling m1() by using object of the class.
		obj.m3();
		

	}

	// Accessmodifier returntype methodname(input arguments){}
	
	public void m1() {
		System.out.println("This is m1 method");
		m2();// other than main method able to call another method without using object.
		System.out.println("------------------");
	}
	
	public void m2() {
		System.out.println("This is m2 method");
		
	}
	
	
	
}


