package week1.day3;

public class Calculator {

	int c =0;
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println("Inital c value is --> " + cal.c);
		int sum = cal.add(10, 20);// ctrl+2, l -> to assign local variable, for mac--> command + 2, l
		System.out.println("Sum --> "+sum);
		System.out.println("C value for 10, 20 ---> " +cal.c);
		cal.add(50, 50);
		System.out.println("C value for 50,50 ---> " + cal.c);
		System.out.println(cal.add(70, 60));
		System.out.println("C value for 70,60 --> " + cal.c);
		String sub = cal.sub(10, 20);
		System.out.println(sub);
	}

	public int add(int a, int b) {
	 c = a+b;
		System.out.println("Inside the method --> " + c);
		return c;
	}
	
	public String sub(int x , int  y) {
		int z = y-x;
		System.out.println(z);
		return "Executed Successfully";
	}
	
	
	
	
}
