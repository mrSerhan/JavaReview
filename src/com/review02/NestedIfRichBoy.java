package com.review02;

import java.util.Scanner;

public class NestedIfRichBoy {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Are you a boy or girl?");
		String boyGirl = input.next();
		System.out.println("You entered " + boyGirl);

		System.out.println("Are you rich?");
		boolean rich = input.nextBoolean();

		System.out.println("You are a " + boyGirl + " and you are rich: " + rich);

		if (boyGirl.equals("boy")) {		// boy			
			System.out.println("Yaaayyy");

			if (rich) {		// rich boy
				System.out.println("Buy a ferrari");

			} else {	// poor boy
				System.out.println("Play sports");
			}

		} else if (boyGirl.equals("girl")) { // girl
			System.out.println("Yay");

			if (rich) { 	// rich girl
				System.out.println("Buy Luois Vuitton");
			} else {		//poor girl
				System.out.println("Read book");
			}

		} else { 	// neither boy or girl
			System.out.println("You entered  a wrong choice");
		}

	}

}
