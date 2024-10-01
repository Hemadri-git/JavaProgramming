package com.programs.resuable_code_demo;

public class TwoDigitsSum {

	public static int getTwoDigitsSum(int num) {
            int digits = 0;
            while(num!=0) {
            	digits = digits + num % 10;
            	num = num/10;
            }
            return digits;

	}
}
