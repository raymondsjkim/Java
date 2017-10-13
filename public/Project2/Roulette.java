
// Class Roullete for CSCI 145 Project 2 Fall 17
// Modified by:

import java.util.*;

//************************************************************************
//   Class Roulette contains the main driver for a roulette betting game.
//************************************************************************
class Roulette
{
    //=====================================================================
    //  Contains the main processing loop for the roulette game.
    //=====================================================================
    public static void main (String[] args)
    {
      	Scanner scan = new Scanner(System.in);
      	Player player1 = new Player ("Jane", 100);   // $100 to start for Jane
      	boolean done = false;

      	System.out.println ("Author: your Raymond Kim");
      	Wheel.welcomeMessage();

      	while (!done)
      	{
         	System.out.println ("Money available for " + player1.getName()
                 	+ ": " + player1.getMoney());
         	
         	player1.makeBet(scan);
         	System.out.println();
         	Wheel.spin(); // call spin
         	System.out.println();
         	done = !player1.playAgain(scan);
         	System.out.println();
      	}

      	System.out.println ("Game over!  Thanks for playing.");
      	scan.close();
   }
}
