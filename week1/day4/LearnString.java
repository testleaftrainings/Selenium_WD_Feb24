package week1.day4;

public class LearnString {

	public static void main(String[] args) {
		//Syntax 1
		String name1 = "Testleaf";
		String name2 = "Testleaf";
		String name3 = new String("Testleaf");
		String name4 = new String("Testleaf");		
		String name5 = "testleaf";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		//In String == will compare a memory location , not a value.
		System.out.println(name1==name2);
		System.out.println(name2==name3);
		System.out.println(name3==name4);
		
		// Two compare two Strings we have use string methods equal
		System.out.println(name1.equals(name4)); //equal method will characters, not a memory address
		System.out.println(name1.equals(name5));// It will compare the exact value case sensitive
		System.out.println(name1.equalsIgnoreCase(name5));// EqualsIgnoreCase method used to compare two strings without case sentivite
		System.out.println(name1.contains("leaf"));
		System.out.println(name1.contains("test"));
		
		System.out.println("------------------------------------------------------");
		
		String x = "Hello World";
		char[] charArray = x.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		char charAt = x.charAt(6);
		System.out.println("charAt index 6 is "+charAt);
		System.out.println("Chatat index 7 is" + x.charAt(7));
		
		System.out.println("Length of the array is " +x.length());
		
		String updatedString = x.replace(" ", "_");
		System.out.println("New String is " + updatedString);
		System.out.println(x.replace("l", "L"));
		String[] split = x.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		System.out.println("LowerCase " +x.toLowerCase());
		System.out.println("Uppercase " +x.toUpperCase());
		
	}

}

