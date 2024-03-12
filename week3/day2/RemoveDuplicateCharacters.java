package week3.day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		//Step 1 Declare a Companyname as varible as assign value as testleaf
		String companyName ="testleaf";
		String uniqueChar ="";
		//Step 2 - convert the String into toCharArray()
		char[] eachChar = companyName.toCharArray();
		
		//Step 3 - Declare a LinkedHashSet
		Set<Character> output = new LinkedHashSet<Character>();
		
		//Step 4 - Iterate char[] either using for loop or for each
		
		/*
		 * for (int i = 0; i < eachChar.length; i++) { output.add(eachChar[i]); }
		 */
		
		for (Character character : output) {
			output.add(character);
		}
		
		//Step 5 - print the output(Set)
		System.out.println(output);
		
		for (Character character : output) {
			uniqueChar = uniqueChar + ""+character;
		}
		
		System.out.println(uniqueChar);
		
	}

}
