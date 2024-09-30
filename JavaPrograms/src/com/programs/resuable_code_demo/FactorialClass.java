package com.programs.resuable_code_demo;

public class FactorialClass {
	
	public static void check(int n) {
		int number = n;
		int fact = 1;
		for(number = n; number>0 ; number-- ) {
			fact = fact * number;
		}
		System.out.println("Factorial of given number is : " + fact);
	}

}
