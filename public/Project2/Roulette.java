
// Class Roullete for CSCI 145 Project 2 Fall 17
// Modified by:	Raymond Kim
import java.util.*;
//************************************************************************
//   Class Roulette contains the main driver for a roulette betting game.
//************************************************************************
class Roulette
{
    private static final Wheel Wheel = null;
	//=====================================================================
    //  Contains the main processing loop for the roulette game.
    //=====================================================================
    public static void main (String[] args)
    {
      	Scanner scan = new Scanner(System.in);
      	Player player1 = new Player ("Jane", 100);   // $100 to start for Jane
      	Player player2 = new Player ("Ray", 100);
      	boolean b1 = false;
      	boolean done = false;
      	System.out.println ("Author: your Raymond Kim");
      	Wheel.welcomeMessage();
      	while (!done)
      	{
         	System.out.println ("Money available for " + player1.getName()
             + ": " + player1.getMoney());
         	player1.makeBet(scan); // call makeBet for player1
         	System.out.println();
         	System.out.println ("Money available for " + player2.getName()
         	+ ": " + player2.getMoney());
         	player2.makeBet(scan); // call makeBet for player2
         	System.out.println();
         	Wheel.spin(); // call spin
         	System.out.println();
         	// print out payment and amount
         	System.out.print(player1.getName());
         	player1.payment();
         	System.out.print(player2.getName());
         	player2.payment();
         	System.out.println();
         	done = !player2.playAgain(scan);
         	System.out.println();
      	}
      	// print out winnings and losses and game over message
      	System.out.println(player1.displayStatus());
      	System.out.println(player2.displayStatus());
      	System.out.println();
      	System.out.println ("Game over!  Thanks for playing.");
      	scan.close();
   }
}
