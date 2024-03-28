package week5.day4;

public class LearnConstructor {
	String browserName ="Chrome";
	/*LearnConstructor(){
		//Default constructor Created by compiler
	}*/

	//AccessModifier ClassName(){}
	public  LearnConstructor(){
		System.out.println("Default constructor or No arguments Constructor");
	}
	
	public LearnConstructor(int x) {
		System.out.println("This is single argument constructor and the x value is "+x);
	}
	
	public LearnConstructor(String browserName) {
		
		System.out.println(this.browserName);
		System.out.println("This is another single argument constructor and the browser name is "+browserName);
	}
	
	
	public static void main(String[] args) {
		
		LearnConstructor lc = new LearnConstructor("Safari");	
		System.out.println("This is from main method");

	}

}
