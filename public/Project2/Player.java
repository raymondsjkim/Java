// Class Player for CSCI 145 Project 2 Fall 17
// Modified by: Raymond Kim

import java.util.*;

//************************************************************************
//   Class Player represents one roulette player.
//************************************************************************
class Player
{
	private static final int RELOAD_AMOUNT = 100;
    private int bet, money, betType, number, winnings, betNet;
    private String name;

    //=====================================================================
    //  The Player constructor sets up  name and initial available money.
    //=====================================================================
    public Player (String playerName, int initialMoney)
    {
		name = playerName;
      	money = initialMoney;
   	} // constructor Player


    //=====================================================================
    //  Returns this player's name.
    //=====================================================================
    public String getName()
    {
      	return name;
    }  // method getName


    //=====================================================================
    //  Returns this player's current available money.
    //=====================================================================
    public int getMoney()
    {
      	return money;
    }  // method getMoney


    //=====================================================================
    //  Prompts the user and reads betting information.
    //=====================================================================
    public void makeBet(Scanner scan)
    {
      	System.out.print("How much to bet: ");
      	bet = scan.nextInt();
      	if (bet >= 1 && bet <= 100) {
      		money = money - bet;
      		Wheel.betOptions();
      		System.out.print("What is your bet type? ");
      		betType = scan.nextInt();
      		if (betType >= 1 && betType <= 3) {      			
      			if(betType == Wheel.NUMBER) {
      				boolean x = true;        			
      				System.out.print("Choose a number between 1 and 10? ");
          			number = scan.nextInt();         			
          			while(x) {            			
          				if(number >= Wheel.MIN_NUM && number <= Wheel.MAX_NUM) {
              				x = false;
              			}  else {
                  			System.out.print("Choose a number between 1 and 10? ");
                  			number = scan.nextInt();
              			}    				          		
          			}     
          		}
      		} else {
      			System.out.println("Invalid input: Please play again.");
      		} 
      	} else {
      		System.out.println("ERROR: you do not have sufficient funds.");
      	}
    } // method makeBet
    //=====================================================================
    //  Determines if the player wants to play again.
    //=====================================================================
    public boolean playAgain(Scanner scan)
    {
    		String answer;
      	System.out.print ("Play again [y/n]? ");
      	answer = scan.next();
      	return (answer.equals("y") || answer.equals("Y"));
    }  // method playAgain
    //=====================================================================
    //  Determines the winnings and reloads amount if balance is 0
    //=====================================================================
    public void payment() {
    		winnings = Wheel.payOff(bet, betType, number);
    		money = money + winnings; // add winnings to money amount
    		System.out.println(" won $" + winnings + ". Balance: $" + money);
    		if(money <= 0) {
    			money = RELOAD_AMOUNT;
    		}
        if(winnings > 0) {
                betNet = betNet + (winnings-bet);
        } else {
                betNet = betNet - bet;
        }
    }
    //=====================================================================
    //  Display total winning or losing amount after play is done with game.
    //=====================================================================
    public String displayStatus() {
        if(betNet>=0)
        {
        		return getName() + "'s total winning is $" + betNet;
        }
        else
        {
        		return getName() + "'s total losing is -$" + (-(betNet));
        }
    }
}
