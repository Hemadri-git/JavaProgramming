package com.programs.resuable_code_demo;

import java.text.*;

public class AreaOfCircleTest {

	public static void main(String[] args) {

		String areaOfCircle = AreaOfCircle.getAreaOfCircle(2);

		double area = Double.parseDouble(areaOfCircle);

		DecimalFormat df = new DecimalFormat("00.000");
		System.out.println("Area of Circle is :" + df.format(area));
	}

}
