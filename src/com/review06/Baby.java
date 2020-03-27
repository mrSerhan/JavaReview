package com.review06;

public class Baby {

	String firstName;
	String lastName;
	char gender;
	int weight;
	String hairColor;
	
	public void walk() {
		System.out.println("Crawling...");
	}
	
	public void cry() {
		System.out.println("Cry every minute...");
	}
	
	public String cry1() {
		return "Cry every minute";
	}
	
	public void talk() {
		System.out.println("Bla Bla Bla...");
	}
	
	public void talk(int times) {
		for (int i = 1; i <= times; i++) {
			System.out.print("Bla...");			
		}		
	}
	
	public void displayBabyInfo() {
		System.out.println("Full name of baby is "+firstName+" "+lastName);
		System.out.println(("Gender is "+gender));
		System.out.println("Hair color is "+hairColor);
	}
	
	
	
	
	
}
