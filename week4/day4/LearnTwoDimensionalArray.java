package week4.day4;

import java.util.Iterator;

public class LearnTwoDimensionalArray {

	public static void main(String[] args) {
		int[] num = new int[2];
//		by using index will assign value , it starts zero(0)
		num[0] = 7;
		num[1] = 10;

		/*3 x 4
		 * Testleaf Gokul Sekar 99 // 00, 
		 * 
		 * Qeagle Babu M 98
		 * 
		 * Testleaf hari r 97
		 * 
		 */
		
		String[][] data = new String[3][4];// 1st dimension as row size and 2nd dimension as column size
		
		data[0][0] = "Testleaf";
		data[0][1] = "gokul";
		data[0][2] = "Sekar";
		data[0][3] = "99";
		
		
		data[1][0] = "qeagle";
		data[1][1] = "babu";
		data[1][2] = "m";
		data[1][3] = "98";
		
		data[2][0] = "Testleaf";
		data[2][1] = "hari";
		data[2][2] = "r";
		data[2][3] = "97";
		
		System.out.println(data.length);
		
 		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(data[i][j]);
			}
		}
		
	}

}
