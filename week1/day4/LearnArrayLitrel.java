package week1.day4;

public class LearnArrayLitrel {

	public static void main(String[] args) {

		//Syntax : datatype[] variableName = {values by using , separation};
		//Decalared a similar datatypes value into the same vriable by using Array
		String[] names = {"Gokul", "Dilip", "Vinoth","Ragu","Vineeth", "Princila"};
		
		// How i can able to accesss? --> by using index position.
			// Array index will be starts from zero.
		
		// variables[index position]
		System.out.println(names[3]);
		System.out.println(names[5]);
		//To get a length of the Array --> variableName.length   , Here length is a property of an Array.
		int length = names.length;
		System.out.println("Length of the Array is :" +length);
		
		for (int i = 0; i <length; i++) {
			System.out.println(names[i]);
		}
		
		// index position as 6 ?
		System.out.println(names[10]);
		
		
	}

}
