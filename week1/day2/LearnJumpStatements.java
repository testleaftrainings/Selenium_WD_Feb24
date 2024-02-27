package week1.day2;

import java.util.Iterator;

public class LearnJumpStatements {

	public static void main(String[] args) {
		//1,2,3,4,6,8,9,10
		
		//1,2,3,4
		for (int i = 1; i <=10; i++) {
			if((i==5)||(i==7)) {
				continue;// continue keyword is used to skip the current iteration
			}
			if(i==6) {
				break; // break keyword will stop the entire iteration
			}
			System.out.println(i);
		}

	}

}
