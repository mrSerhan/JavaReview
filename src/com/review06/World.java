package com.review06;

public class World {

	public static void main(String[] args) {
		
		Baby baby1 = new Baby();
		baby1.cry();
		System.out.println(baby1.cry1());
		
		//assign values
		baby1.firstName = "John";
		baby1.lastName = "Smith";
		baby1.gender = 'M';
		baby1.weight = 7;
		baby1.hairColor = "Yellow";
		
		// reassign value
		baby1.weight = 8;
		
		System.out.println("baby1 firstname is "+baby1.firstName);
		String babyLastName = baby1.lastName; //babyLastName is local variable
		System.out.println("baby LastName "+ babyLastName);
		
		baby1.cry();
		baby1.talk(3);
		System.out.println();
		System.out.println(("\n --- Done with baby1 ---"));
		
		Baby baby2 = new Baby();
		System.out.println(baby2.cry1());
		baby2.firstName = "Selin";
		baby2.lastName = "Atasoy";
		baby2.gender = 'F';
		baby2.hairColor = "Black";
		baby2.weight = 6;
		System.out.println();
		System.out.println("Full name of baby2 is "+baby2.firstName+" "+baby2.lastName);
		System.out.println("---------------");
		
		baby1.displayBabyInfo();
		System.out.println("--------------");
		baby2.displayBabyInfo();
	
	}

}
