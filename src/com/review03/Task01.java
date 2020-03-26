package com.review03;

public class Task01 {

	public static void main(String[] args) {
		
		//print number from 15 to 35
		//but dont print numbers that are divisible by 2 and 3
		
		
		for(int i=15;i<=35;i++) {
			if(i%2==0 && i%3==0) {
				continue;
			}
			System.out.println(i);
			
			
		}
		
		
		

	}

}
