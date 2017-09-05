/*  Program: Area and circumference of a circle.
    Author: Raymond Kim
    Class: CSCI 145
    Date: 9/5/2017
    Description: This program calculates the circumference and area of a circle when the user enters a value for the radius.

    I certify that the code below is my own work.

	Exception(s): N/A

*/

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		
		final double PI = 3.14159;
		int radius;
		
		/* User enters the first value for the radius */
		System.out.print("Please enter a value for the radius: ");
		radius = scan.nextInt();
	
		double area1 = PI * radius * radius;
		double circumference1 = 2 * PI * radius;
		System.out.println("The area of a circle with radius " + radius +
		" is " + area1);	
		System.out.println("The circumference of a circle with radius " + radius +
		" is " + circumference1);
		
		System.out.println();
		
		/* User enters the second value for the radius */
		System.out.print("Please enter another value for the radius: ");
		radius = scan.nextInt();
	
		double area2 = PI * radius * radius;
		double circumference2 = 2 * PI * radius;
		System.out.println("The area of a circle with radius " + radius +
		" is " + area2);	
		System.out.println("The circumference of a circle with radius " + radius +
		" is " + circumference2);
		
		System.out.println();
		
		/* Calculates the factor by which the area and circumferences grew. */
		double area_change = area2 / area1;
		double circum_change = circumference2 / circumference1;
		System.out.println("The factor by which the area grew is: " + area_change);
		System.out.println("The factor by which the circumference grew is: " 
		+ circum_change);		
	}
}
