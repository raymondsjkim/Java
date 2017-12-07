import java.util.*;
import java.util.ArrayList;
import java.util.Random;
//************************************************************************
//   Class Player represents one roulette player.
//************************************************************************
public class Player
{
    private int bet;
    protected int money;
    private int betType, playerType, id, betCount;
    private int number, status, winnings;
    public String lastName, firstName;
    private ArrayList<Player> players = new ArrayList<Player>();
    private Chips chips;
    //=====================================================================
    //  The Player constructor sets up name, initial money, and chips.
    //=====================================================================
    public Player (int type, int initialMoney)
    {
    		playerType = type;
        money = initialMoney;
        chips = new Chips();
        
    }
    //=====================================================================
    //  Return the ID
    //=====================================================================
    public int getID()
    {
        return id;
    } 
    //=====================================================================
    //  The Player type 0, 1, or 2
    //=====================================================================
    public int getPlayerType()
    {
        return playerType;
    } 
    //=====================================================================
    //  Returns this player's name.
    //=====================================================================
    public String getName(int i)
    {
        return "Player " + Integer.toString(i + 1);
    } 
    //=====================================================================
    //  Returns this player's current available money.
    //=====================================================================
    public int getMoney()
    {
        return money;
    }
    //=====================================================================
    //  Return chips
    //=====================================================================
    public Chips getChips()
    {
    		return chips;
    }
    //=====================================================================
    //  Add player
    //=====================================================================
	public void addPlayer(Player player)
	{
		players.add(player);
	}
    //=====================================================================
    //  Remove player
    //=====================================================================
	public void removePlayer(int index)
	{
		players.remove(index);
	}
    //===================================================================
    //  Make a bet for game 100A1
    //===================================================================
	public void makeBet(Scanner scan)
    {
      	bet = scan.nextInt();
      	if (bet >= 1 && bet <= 20) {
      		money = money - bet;
      		Wheel.betOptions();
      		System.out.print("What is your bet type? ");
      		betType = scan.nextInt();
      		if (betType >= 1 && betType <= 3) 
      		{      			
      			if(betType == Wheel.NUMBER) 
      			{
      				boolean x = true;        			
      				System.out.print("Choose a number between 1 and 10? ");
          			number = scan.nextInt();         			
          			while(x) 
          			{            			
          				if(number >= Wheel.MIN_NUM && number <= Wheel.MAX_NUM) 
          				{
              				x = false;
              			}  else 
              			{
                  			System.out.print("Choose a number between 1 and 36? ");
                  			number = scan.nextInt();
              			}    				          		
          			}     
          		}
      		} 
      		else {
      			System.out.println("Invalid input: Please play again.");
      		} 
      		betCount++;
      	} 
      	else {
      		System.out.println("ERROR: you do not have sufficient funds.");
      	}
    } 
    //===================================================================
    //  Make a bet for game 100A2
    //===================================================================
	public void makeBet(int bets, Scanner scan)
    {
      	bet = bets;
      	if (bet >= 1 && bet <= 100) 
      	{
      		money = money - bet;
      		Wheel.betOptions();
      		System.out.print("What is your bet type? ");
      		betType = scan.nextInt();
      		if (betType >= 1 && betType <= 3) 
      		{      			
      			if(betType == Wheel.NUMBER) 
      			{
      				boolean x = true;        			
      				System.out.print("Choose a number between 1 and 36? ");
          			number = scan.nextInt();         			
          			while(x) {            			
          				if(number >= Wheel.MIN_NUM && number <= Wheel.MAX_NUM) 
          				{
              				x = false;
              			}  else 
              			{
                  			System.out.print("Choose a number between 1 and 36? ");
                  			number = scan.nextInt();
              			}    				          		
          			}     
          		}
      		} 
      		else 
      		{
      			System.out.println("Invalid input: Please play again.");
      		} 
      		betCount++;
      	} 
      	else 
      	{
      		System.out.println("ERROR: you do not have sufficient funds.");
      	}
    } 
    //===================================================================
    //  Calculate and display winnings/losing and current balance
    //===================================================================
	public void payment()
	{
		winnings = Wheel.payoff(bet, betType, number);
		money = money + winnings; // add winnings to money amount
		System.out.println("Won $" + winnings + ". Balance: $" + money);
		if (Wheel.payoff(bet, betType, number) == 0)
		{
			status = status - bet;
		}
		else if (Wheel.payoff(bet, betType, number) > 0)
		{
			status = status + bet;
		}
	}
    //===================================================================
    //  Return T/F if user wants to play again
    //===================================================================
	public boolean playAgain(Scanner scan)
	{
		String answer;
		answer = scan.next();
		if ((answer.equals("y") || answer.equals("Y")) && money >= 0)
		{
			return true;
		}
		return answer.equals("y") || answer.equals("Y");
	}
    //===================================================================
    //  Return bet count
    //===================================================================
	public int getBetCount()
	{
		return betCount;
	}
    //===================================================================
    //  To string
    //===================================================================
    public String toString() 
    {
    		return playerType + " " + money;
    }
}
