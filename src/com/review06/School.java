package com.review06;

public class School {

	public static void main(String[] args) {
		
		MathOperations math = new MathOperations();
		int result = math.add(4, 5);
		System.out.println("result is "+result);
		System.out.println(math.add(4, 5));
		
		result = math.multiply(3, 4);
		System.out.println("Multiplication result is "+result);
		
		//can not access this method, bec it is protected
		//math.smth
		//-------------------------------------------------
		//HW create divide method
		//create substruct method
	}

}
