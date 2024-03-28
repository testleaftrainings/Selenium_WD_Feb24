package week5.day4;

public class ChildClass  extends LearnConstructor{
	/*If we create a parameter Constructor and 
	 * we create object for class by calling default constructor , 
	 * In this case complier will not create a default constructor*/
	
	public ChildClass() {
		super(7);
	}
	
	public ChildClass(int x, int y) {
		super("InternetExplorer"); //public LearnConstructor(String browserName){}
		System.out.println("X+Y is "+ (x+y));
	}
	
	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();
	}

}
