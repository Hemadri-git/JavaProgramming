package com.programs.resuable_code_demo;

public class AreaOfCircle {
	
	 public static String getAreaOfCircle(double radius)
	  {		 
		  if(radius <=0)
		  {
			  return ""+(-1);
		  }
		  else
		  {
			  final double PI = 3.14;
			  double areaOfCircle = PI * radius * radius;
			  return ""+areaOfCircle;
		  }
		  
	  }
	
	

}
