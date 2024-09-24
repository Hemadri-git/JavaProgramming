package com.programs.basic;

public class MultiplyFloats {

	public static void main(String[] args) {

		if (args.length < 2) {
            System.out.println("Please provide two floating-point numbers as command line arguments.");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        double result = num1 * num2;

        System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + result);
    }
	

}
