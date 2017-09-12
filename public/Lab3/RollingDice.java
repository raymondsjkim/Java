/*  
  	Program: Rolling Dice
    Author: Raymond Kim
    Class: CSCI 145
    Date: 9/12/2017
    Description: This program generates random to simulate two dice rolls and sums them up.
	Exception(s): N/A
*/
import java.util.Random;
public class RollingDice {
    public static void main(String[] args)
    {
    	int die1, die2, total;
    	Random generator = new Random(); // create random object

    	// generate random number between 1-6 for each die
    	die1 = generator.nextInt(6) + 1;
    	die2 = generator.nextInt(6) + 1;
    	// calculate the sum of both die for the total
    	total = die1 + die2;
    	// print the statements
    	System.out.println("First dice roll is: " + die1);
    	System.out.println("Second dice roll is: " + die2);
    	System.out.println("The total roll is: " + total);
    }
}
