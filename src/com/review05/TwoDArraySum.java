package com.review05;

public class TwoDArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] num = {
						{7,1,6,12},
						{9,6,2,8},
						{3,0,8,5}
					};
		
		int rows = num.length;
		
		for(int row = 0; row < rows; row++) {
			 System.out.println(" I am at row index " + row);
			
			 int length = num[row].length;
			 for(int col = 0; col < length; col++) {
				 int element = num[row][col];
				 	System.out.println(element + " ");
			 }
			 System.out.println();
			 
		}
		
	}

}
