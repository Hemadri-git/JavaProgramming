package com.programs.basic;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = 5;
		
		if(number%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		sc.close();
	}

}
