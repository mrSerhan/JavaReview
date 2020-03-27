package com.review06;

public class ArrayManipulation {

	public int largestNumber(int[] array) {
		
		int largest = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > largest) {
				largest = array[i];
			}
		}		
		return largest;
	}

	int smallestNumber(int[] array) {
		int smallest = array[0];
		for (int num : array) {
			if(num < smallest) {
				smallest = num;		
				}
			}
		return smallest;
	}
	
	// even if it is private it can be called from inside the class
	private static double findAverage(int[] array) {
		
		double sum = 0;
		for (int num : array) {
			sum+=num;
		}
		
		return sum/array.length;
	}
	
	
	
	
	public static void main (String[] args) {

		int [] array = {5,2,9,6,1,8};
		ArrayManipulation manip = new ArrayManipulation();
		
		int largest = manip.largestNumber(array);
		System.out.println("Largest is "+largest);
		System.out.println("Smallest is "+manip.smallestNumber(array));
		
		System.out.println(findAverage(array));
		
		//HW 
		// create a method that returns sum of an array
	}
	
}