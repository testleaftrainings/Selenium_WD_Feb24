package week3.day2;

public class LearnThisKeyword {
	
	String companyName = "Qeagle";
	String empId ="TL0049";
	String a = "100";
	double b = (int)100;// 100.00756
	
	public void employee(String companyName) {
		System.out.println(companyName);
		System.out.println(this.companyName);
		
		
		// varibale = value
		this.companyName = companyName;
	}
	
	public  void empID() {
		employee("Google");
		this.employee("Facebook");
		System.out.println(companyName);
		System.out.println(empId);
	}
	

	public static void main(String[] args) {
		LearnThisKeyword ltk = new LearnThisKeyword();
		ltk.employee("Testleaf");
		System.out.println(ltk.companyName);
	}

}
