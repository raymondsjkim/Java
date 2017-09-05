/*  Program: Area and circumference of a circle.
    Author: Raymond Kim
    Class: CSCI 145
    Date: 9/5/2017
    Description: 

    I certify that the code below is my own work.

	Exception(s): N/A

*/

public class Circle {

	public static void main(String[] args) {

		final double PI = 3.14159;
		int radius = 10;
		double area1 = PI * radius * radius;
		double circumference1 = 2 * PI * radius;

		System.out.println("The area of a circle with radius " + radius +
		" is " + area1);
		System.out.println("The circumference of a circle with radius " + radius +
		" is " + circumference1);
		
		System.out.println();
		
		radius = 20;
		double area2 = PI * radius * radius;
		double circumference2 = 2 * PI * radius;
		System.out.println("The area of a circle with radius " + radius +
		" is " + area2);	
		System.out.println("The circumference of a circle with radius " + radius +
		" is " + circumference2);
		
		System.out.println();
		
		double area_change = area2 / area1;
		System.out.println("The factor by which the area grew is: " + area_change);
		
		double circum_change = circumference2 / circumference1;
		System.out.println("The factor by which the circumference grew is: " 
		+ circum_change);
		
		
	}

}
