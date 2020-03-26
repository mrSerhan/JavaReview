package com.review03;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		int num=0;
		int total=0;
		
		
		
		
		
		for(num=0;num!=-1;) {
			System.out.println("enter a number");
			num=scan.nextInt();
			
			
			if(num!=-1) {
				total+=num;
			}
		}
		System.out.println("total = "+total);
	}

}
