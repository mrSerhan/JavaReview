package com.review03;

public class SumEvenForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumEven=0;
		int sumOdd=0;
		
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
			sumEven+=i;	
				
			}else {
				sumOdd+=i;
			}
			
		}
		System.out.println("total even "+sumEven);
		System.out.println("total odd  "+sumOdd);
	}

}
