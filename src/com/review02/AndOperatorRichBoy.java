package com.review02;

import java.util.Scanner;

public class AndOperatorRichBoy {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Are you a boy or girl?");
		String boyGirl = input.next();
		//System.out.println("You entered " + boyGirl);

		System.out.println("Are you rich? true/false");
		boolean rich = input.nextBoolean();

		System.out.println("You are a " + boyGirl + " and you are rich: " + rich);

		if(boyGirl.equals("boy") && rich) {  //rich boy
			System.out.println("Buy a ferrari");
			
		}else if(boyGirl.equals("boy") && !rich) { 		// only poor boy
			System.out.println("Play spor");
		
		}else if(boyGirl.equals("girl") && rich) {  //rich girl
			System.out.println("Buy louis voitton");
				
		}else if(boyGirl.equals("girl") && !rich) { //poor girl
			System.out.println("Read a book");
		}else {
			System.out.println("you entered a wrong choice");
			
		}
	}
}
