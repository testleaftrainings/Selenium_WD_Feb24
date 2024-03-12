package week3.day2;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
	
		//Sort the values based hashing algorthim (Random order)
		Set<Integer> number = new HashSet<Integer>();
		
		number.add(10);
		number.add(25);
		number.add(34);
		number.add(41);
		number.add(57);
		number.add(10);
		number.add(25);
		number.add(34);
		number.add(41);
		number.add(57);
		System.out.println(number);
		
		// Sort the values based on Ascii order
		Set<String> names = new TreeSet<String>();
		names.add("Vinoth");
		names.add("Princila");
		names.add("Ragu");
		names.add("Vineeth");
		names.add("Gokul");
		names.add("Vinoth");
		names.add("Princila");
		names.add("Ragu");
		names.add("Vineeth");
		names.add("Gokul");
		System.out.println(names);
		
		
		//It will not sort the values it will keep the same insertion order
		Set<Character> logo = new LinkedHashSet<Character>();
		logo.add('v');
		logo.add('h');
		logo.add('m');
		logo.add('r');
		logo.add('v');
		logo.add('h');
		logo.add('m');
		logo.add('r');
		
		
		System.out.println(logo);
		
		//There is no get() in Set
			// option 1 - convert the set into list
		List<Character> logoList = new LinkedList<Character>(logo);
		logoList.addAll(logo);
		System.out.println(logoList);
		
		System.out.println("Index of zero in logoList is "+logoList.get(0));
		
		
		//for each --> type for and ctrl + spacebar and choose fourth option
		//syntax for(WrapperClass localVariableName : variable which is iterate based on the Wrapper Class)
		for (Integer num : number) {
			System.out.println(num);
		}
		
		
		int [] num = {1,2,3,4,5};
		for (int i : num) {
			number.add(i);
		}
		
		System.out.println(number);

	}

}
