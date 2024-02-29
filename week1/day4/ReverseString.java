package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Testleaf";//faeltseT
		String reverse =""; //empty String
		char[] charArray = name.toCharArray();
		for (int i =charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
			reverse= reverse+(charArray[i]); // "" + f, "f"+a,"fa"+e, "fae"+l
		}
		
		System.out.println("\n"+reverse);
	}

}
