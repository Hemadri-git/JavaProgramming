package com.programs.basic;

import java.util.Scanner;

public class WholeSaleDiscount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Net Bill Amount (in Rupees): ");
        double netBill = scanner.nextDouble();

        double discountPercent;

        if (netBill < 5000) {
            discountPercent = 5;
        } else if (netBill >= 5000 && netBill < 10000) {
            discountPercent = 10;
        } else {
            discountPercent = 15;
        }

        double discountAmount = (netBill * discountPercent) / 100;

        double amountPayable = netBill - discountAmount;

        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Amount Payable: Rs. " + amountPayable);

        scanner.close();
	}

}
