package week1.day4;

public class LearnArrayInstantiation {

	public static void main(String[] args) {
		
		// syntax datatype[] variableName = new dataType[size]
		
		int[] num = new int[10];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		num[5] = 6;
		num[6] = 7;
		num[7] = 8;
		num[8] = 9;
		num[9] =10;
//		num[10]= 11; not possible 
		
		num[0] = 10;
		num[1] = 12;
		num[2] = 13;
		num[3] = 14;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}
