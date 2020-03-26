package com.review04;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		// use scanner to ask for the size of array
		// then 

		Scanner scan = new Scanner(System.in);
		System.out.println("How many element do you want to store body");
		int size = scan.nextInt();
		System.out.println(size);
		
		// I am creating an array with size = whatever he/she gave us
		int [] nums = new int[size];
		
		// this for loop insert numbers into array
		for(int i = 0; i<size; i++){
			System.out.println("give me a number to store in the array");
			nums [i] = scan.nextInt();		
		}
		
		System.out.println("Lets see what you gave me");
		// this enhanced for loop reads numbers from the array
		for (int n : nums)
			System.out.println(n);
	}

}
