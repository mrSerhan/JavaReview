package com.review03;

public class SumEvenWhile {

	public static void main(String[] args) {
		// add even number
		// also add odd number
		//between 1 && 50
		// you can use while or do while
		// you can use mod operator or if else
		
		int sumEven=0;
		int sumOdd=0;
		int count=0;
		while(count<=50) {
			
			if(count%2==0) {
				sumEven+=count;
				
			}else {
				sumOdd+=count;
				
			}
			count++;
			
		}
		System.out.println("even numbers sum = "+sumEven);
		System.out.println("odd number sum = " +sumOdd);

		
		System.out.println("-------------SECOND WAY-------------");
	
		count =1;
		sumOdd=0;
		do {
			sumOdd+=count;
			count+=2;
			
		}while(count<=50);
			System.out.println("odd number sum = "+sumOdd);
	
	
	
	
	}

}
