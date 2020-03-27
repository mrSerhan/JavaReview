package com.review06;

public class FamilyDemo {

	public static void main(String[] args) {
		
		JamesMember member1 = new JamesMember();
		
		member1.firstName = "Lebron";
		member1.lastName = "James";
		member1.age = 34;
		
		JamesMember member2 = new JamesMember();
		member2.firstName = "Savannah";
		member2.lastName = "James";
		member2.age = 28;
		
		member1.memberFullName();
		member2.memberFullName();
	
	}

}
