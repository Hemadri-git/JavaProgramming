package com.programs.resuable_code_demo;

import java.util.Scanner;

public class TwoDigitsSumTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits to get sum: ");
		int num  = sc.nextInt();
		
		int twoDigitsSum = TwoDigitsSum.getTwoDigitsSum(num);
		System.out.print("Sum of digits is : " + twoDigitsSum);
		sc.close();
		
	}

}
