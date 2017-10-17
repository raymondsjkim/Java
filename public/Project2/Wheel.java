// Class Wheel for CSCI 145 Project 2 Fall 17
// Modified by: Raymond Kim

import java.util.Random;

//************************************************************************
//   Class Wheel represents a roulette wheel and its operations.  Its
//   data and methods are static because there is only one wheel.
//************************************************************************
class Wheel
{
    // public name constants -- accessible to others
    public final static int BLACK     =  0;			// even numbers
    public final static int RED       =  1;			// odd numbers
    public final static int GREEN     =  2;			// 00 OR 0
    public final static int NUMBER    =  3;			// number bet
    public final static int MIN_NUM   =  1;			// smallest number to bet
    public final static int MAX_NUM   = 10;			// largest number to bet
    
    // private name constants -- internal use only
    private final static int MAX_POSITIONS = 12;	// number of positions on wheel
    private final static int NUMBER_PAYOFF = 10;	// payoff for number bet
    private final static int COLOR_PAYOFF  = 2;		// payoff for color bet

    // private variables -- internal use only
    private static int ballPosition;				// 00, 0, 1 .. 10
    private static int color;						// GREEN, RED, OR BLACK

    //=====================================================================
    //  Presents welcome message
    //=====================================================================
    public static void welcomeMessage()
    {
      	System.out.println("Welcome to a simple version of roulette game.");
      	System.out.println("You can place a bet on black, red, or a number.");
      	System.out.println("A color bet is paid " + COLOR_PAYOFF + " the bet amount.");
      	System.out.println("A number bet is paid " + NUMBER_PAYOFF + " the bet amount.");
      	System.out.println("You can bet on a number from " + MIN_NUM + " to " + MAX_NUM + ".");
      	System.out.println("Gamble responsibly.  Have fun and good luck!\n");
    }


    //=====================================================================
    //  Presents betting options
    //=====================================================================
    public static void betOptions()
    {
      	System.out.println("Betting Options:");
      	System.out.println("    1. Bet on black (even numbers)");
      	System.out.println("    2. Bet on red (odd numbers)");
      	System.out.println("    3. Bet on a number between " + MIN_NUM +
      			" and " + MAX_NUM);
      	System.out.println();
    }
    //=====================================================================
    //  Spin position
    //=====================================================================
    public static void spin() {
    		Random rand = new Random();
    		int ballPosition = rand.nextInt(MAX_POSITIONS) + 1; // random number between 1 and 12
    		
    		if(ballPosition == 11 || ballPosition == 12) {
	    		color = GREEN;
	    	} else if((ballPosition % 2) == 0) {
	    		color = BLACK;
	    	} else if ((ballPosition % 2) == 1) {
	    		color = RED;
	    	}
    		System.out.println("The color is " + ((color < 1) ? "Black" : "Red") + " and the ball position is at " + ballPosition);
    }
    public static int payOff(int amtBet, int typeBet, int numBet) {
    		if(color == GREEN) {
    			return 0;
    		} else if(typeBet == 1 && color == BLACK) {
    			return amtBet * COLOR_PAYOFF;
    		} else if(typeBet == 2 && color == RED) {
    			return amtBet * COLOR_PAYOFF;
    		} else if(typeBet == 3 && numBet == ballPosition) {
    			return amtBet * NUMBER_PAYOFF;
    		} else {
    			return 0;
    		}
    }
}
