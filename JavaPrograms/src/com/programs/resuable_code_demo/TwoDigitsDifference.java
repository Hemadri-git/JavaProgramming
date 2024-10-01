package com.programs.resuable_code_demo;

public class TwoDigitsDifference {
	
	public static int getDiffOfDigits(int number) {

		int num1 = number % 10;
		int num2 = number / 10;
		int difference = num2 - num1;
		return difference;

		
	}

}
