/*  
  	Program: Experimenting with the Integer Class
    Author: Raymond Kim
    Class: CSCI 145
    Date: 9/12/2017
    Description: This program returns the Binary, Octal, and Hexadecimal numbers from an integer using wrapper classes. 
    It returns the max and min Java integer values. It also takes in to string values, converts them to integers using 
    parseInt(), and sums the two values.
	Exception(s): N/A
*/
import java.util.Scanner;
public class IntWrapper {
	public static void main(String[] args) {
		int read_int, num1Int, num2Int;
		String num1, num2;
		Scanner scan = new Scanner(System.in);
		// Prompt for and read in an integer to convert
		System.out.print("Enter in a integer to convert to Binary, Octal, and Hexadecimal: ");
		read_int = scan.nextInt();
		System.out.println();
		// Prompt the user to enter two decimal integers, one per line for calculation
		System.out.print("Enter in number for x: ");
		num1 = scan.next();
		System.out.print("Enter in number for y: ");
		num2 = scan.next();
		// Declare and instantiate the integer object
		Integer num = new Integer(read_int);
		// Convert to binary, octal, and hexadecimal
        String binary = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num);
        String hexadecimal = Integer.toHexString(num);
        // Parse strings to integers
        num1Int = Integer.parseInt(num1);
        num2Int = Integer.parseInt(num2);
        System.out.println();
        // print the binary, octal and hexadecimal 
        System.out.println("Binary value: " + binary);
        System.out.println("Octal value: " + octal);
        System.out.println("Hexadecimal value: " + hexadecimal);
        System.out.println();
        // Print the maximum and minimum possible Java integer values
        System.out.println("Max. possible Java integer value: " + Integer.MAX_VALUE); 
        System.out.println("Min. possible Java integer value: " + Integer.MIN_VALUE); 
        System.out.println();
        // Print the total of x and y when they are strings and when they are parsed into integers
        System.out.println("This is adds the strings x and y: " + (num1 + num2));
        System.out.println("This is adds the integers x and y: " + (num1Int + num2Int));
	}
}
