package week2.day4;

public class Calculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(5, 10);
		cal.add(5, 10, 15);
		cal.add(10.05f, 5);
	}

	public void add(int a, int b) {
		int c= a+b;
		System.out.println("The addition of numbers "+a +" and " +b +" is "+c);
	}
	
	public void add(int x, float y) {
		float c = x+y;
		System.out.println("The addition of int and float is " + c);
	}
	
	public void add(float a, int b) {
		System.out.println("The addition of float and int is  "+(a+b));
	}
	
	
	public void add(byte x, short y) {
		System.out.println("The addition of byte and short is "+(x+y));
	}
	
	
	public void add(int a, int b , int c) {
		int d =a+b+c;
		System.out.println("The addition of numbers "+a +" and " +b +" and "+c+" is " +d);
	}
	
	
}
