/*  
  	Program: Ideal Weight.
    Author: Raymond Kim
    Class: CSCI 145
    Date: 9/5/2017
    Description: This program calculates the ideal weight for both male and female when 
    			 they enter in their height in feet and in inches.
	Exception(s): N/A
*/
import java.util.Scanner;

public class IdealWeight {
	public static void main(String[] args) {
		System.out.println("Enter in you height in feet and inches to calculate your ideal weight.");
		System.out.println();
		int male_weight = 106;
		int female_weight = 100;
		Scanner scan = new Scanner(System.in); // Create a scanner object.
		/* Prompt the user to enter in values for height and inches */
		System.out.print("Please enter your height in feet: ");
		int height = scan.nextInt();
		System.out.print("Please enter in the inches: ");
		int inches = scan.nextInt();
		System.out.println();
		/* Convert feet to total inches */
		int total_inches = inches + (height * 12);
		int five_feet = 60; // 60 inches equals 5ft.
		inches = total_inches - five_feet; // update the value of the variable inches
		/* Calculate and print the ideal weights for both male and female. */
		int ideal_male = male_weight + (6 * inches);
		int ideal_female = female_weight + (5 * inches);
		System.out.println("The ideal weight for a male: " + ideal_male + "lbs.");
		System.out.println("The ideal weight for a female: " + ideal_female + "lbs.");
	}
}
