package week3.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		String mentor[] = {"Princila","Vidhya","Ragu"}; 
		System.out.println(mentor);
		//Interface generic(type) objectName = new ImplementationClass generic(type) ();
		
		List<String> mentors = new ArrayList <String>();
		
		mentors.add("Princila");
		mentors.add("Vidhya");
		mentors.add("Ragu");
		mentors.add(1, "Hari");
		mentors.add(4,"Vineeth");
		
		System.out.println(mentors);
		
		System.out.println(mentors.contains("Princila"));
		
		mentors.remove(1);
		System.out.println(mentors);
		
		mentors.remove("Vineeth");
		System.out.println("After removing Vineeth :  " + mentors);
		
		mentors.remove("Gokul");
		System.out.println(mentors);
		
		mentors.add("Vinoth");
		mentors.add(2,"Vinoth");
		System.out.println(mentors);
		
		mentors.remove("Vinoth");
//		mentors.remove(4);
		System.out.println("After removing vinoth -----> " +mentors);
		
		System.out.println("Index of 1 --> " + mentors.get(1));
		
		
		List<String> coaches = new LinkedList<String>();
		
		coaches.add("Babu");
		coaches.add("Hari");
		coaches.add("Shan");
		System.out.println("coaches --> " +coaches);
		
		mentors.addAll(coaches);
		mentors.addAll(0, coaches);
		System.out.println(mentors);
		
		System.out.println("No of mentors is : "+ mentors.size());
		
		mentors.removeAll(coaches);
		System.out.println(mentors);
//		mentors.clear();
		Collections.sort(mentors);
		System.out.println(mentors);
		System.out.println(mentors.size());
		
		Object[] array = coaches.toArray();//{"Babu", "Hari", "Shan"}
		
		
		

	}

}
