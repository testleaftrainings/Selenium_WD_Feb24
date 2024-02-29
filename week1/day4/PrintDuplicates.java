package week1.day4;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		 int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		 System.out.println("------------------Method 1 using nested for loop--------------------------");
		 // Method - 1
		 
		 for (int i = 0; i < num.length; i++) {
			
			 for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
			}
		}
		
		 
		 System.out.println("----------------Method 2 using single for loop------------------");
		 //Method - 2
		 System.out.println("-------------before sorting-------------------");
		 for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		 
		 
		 Arrays.sort(num);// 2,2,3,5,5,7,7,9
		 System.out.println("--------------------after sorting-------------------");
		 for (int i = 0; i < num.length; i++) {
				System.out.println(num[i]);
			}
		 System.out.println("------------------------------------------");
		 for (int i = 0; i < num.length-1; i++) {
			
			 if(num[i]==num[i+1]) {
				 System.out.println(num[i]);
			 }
			 
		}

	}

}
