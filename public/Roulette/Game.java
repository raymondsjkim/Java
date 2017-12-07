import java.util.ArrayList;
import java.util.Scanner;
//************************************************************************
//	Class Game represents a game a player can play.
//************************************************************************
public class Game
{
    public ArrayList<Player> p;
    private int count, minBet, maxBet;
    private String model;
    private Chips chips;
    //=====================================================================
    //  Game constructor
    //=====================================================================
    public Game(String id, int minimumBet, int maximumBet, Chips chips)
    {
        model = id;
        minBet = minimumBet;
        maxBet = maximumBet;
        this.chips = chips;
        p = new ArrayList<Player>();
        count = 0;
    }
    //=====================================================================
    //  Add a player to the list
    //=====================================================================
    public void addPlayer(Player player)
    {
	    	if (count < 5) 
	    	{
	    		p.add(player);
	    		count++;
	    		System.out.println();
	    		System.out.print("Player List: ");
	    		for (int i = 0; i < count; i++)
	    		{
	    			System.out.print(p.get(i).getName(i) + "   ");
	    		}
	    	}
	    	else
	    	{
	    		System.out.println("Game is full");
	    	}
    }
    //=====================================================================
    //  Return the current player
    //=====================================================================
    public Player getPlayer(int player)
    {
    		return p.get(player);
    }
    //=====================================================================
    //  Remove the player from the list
    //=====================================================================
    public void removePlayer(int player)
    {
    		p.remove(player);
    		if (p.isEmpty()) 
    		{
        		count = 0;
    		}
    }
    //=====================================================================
    //  Return T/F if list is empty
    //=====================================================================
    public boolean empty()
    {
    		return p.isEmpty();
    }
    //=====================================================================
    //  Return size of the list
    //=====================================================================
    public int numPlayers()
    {
    		return p.size();
    }
    //=====================================================================
    //  Return the count
    //=====================================================================
    public int getCount()
    {
    		return count;
    }
    //=====================================================================
    //  Return chips
    //=====================================================================
    	public Chips getChips()
    {
    		return chips;
    }
    //=====================================================================
    //  Return the cash to chip exchange
    //=====================================================================
    public String chipsEx(int cash) 
    {
    		return chips.chipExchange(cash);
    }
    //=====================================================================
    //  Return game id
    //=====================================================================
    public String getGameID()
    {
    		return model;
    }
    //=====================================================================
    //  Return minimum bet
    //=====================================================================
    public int getMinBet()
    {
    		return minBet;
    }
    //=====================================================================
    //  Return maximum bet
    //=====================================================================
    public int getMaxBet()
    {
    		return maxBet;
    }
    //===================================================================
    //  To string
    //===================================================================
    public String toString() {
    		return model + " " + minBet + " " + maxBet + "\n\n" + chips;
    }
}
