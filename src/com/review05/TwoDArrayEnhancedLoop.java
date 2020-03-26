package com.review05;

public class TwoDArrayEnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] num = { {7,1,6,12},
						{9,6,2,8},
						{3,0,8,5}
						};
		
		int sum = 0;
		// iterating rows of a 2D array
		
		for (int [] row : num) {
			for (int elements : row) {
				System.out.println(elements+ " ");
				sum = sum+elements;
			}
			System.out.println();
		}
		System.out.println("sum of elements = "+sum);
		
	}

}
