
/*  Program: Placing Exception Handlers
    Author: Raymond Kim
    Class: CSCI 145
    Date: 11/28/2017
    Description: This program uses the try statement
    to catch the NumberFormatException but does not
    do anything with it.
	Exception(s): N/A
*/
import java.util.Scanner;
public class ParseInts
{
	public static void main(String[] args)
	{
		int val, sum=0;
		Scanner scan = new Scanner(System.in);
		String line;
		System.out.println("Enter a line of text");
		Scanner scanLine = new Scanner(scan.nextLine());
		while (scanLine.hasNext()) {
			try {
				val = Integer.parseInt(scanLine.next());
				sum += val;
			} catch(NumberFormatException e) {
				// empty body
			}
		}
		System.out.println("The sum of the integers on this line is " + sum);
	}
}
