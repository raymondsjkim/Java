
// Class Roullete for CSCI 145 Project 2 Fall 17
// Modified by:

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
      	boolean done = false;
      	boolean b1 = true;
      	boolean b2 = true;
      	
      	System.out.println ("Author: your Raymond Kim");
      	Wheel.welcomeMessage();

      	while (!done)
      	{
//      		if(b1) {
//      			
//      		}
         	System.out.println ("Money available for " + player1.getName()
                 	+ ": " + player1.getMoney());
         
         	System.out.println();
         	
         	player1.makeBet(scan); // call makeBet method
         	
         	System.out.println();
         	Wheel.spin(); // call spin
         	
         	
         	player1.payment();
         	System.out.println();
         	done = !player1.playAgain(scan);
         	System.out.println();
      	}
      	
      	System.out.println(player1.displayStatus());
      	System.out.println();
      	System.out.println ("Game over!  Thanks for playing.");
      	scan.close();
   }
}
