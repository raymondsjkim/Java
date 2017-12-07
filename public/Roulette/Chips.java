//************************************************************************
//   Class Chips represents chips that plays can exchange and use.
//************************************************************************
public class Chips 
{
	protected int chip1, chip5, chip25, chip100;
    //=====================================================================
    //  Constructors for players
    //=====================================================================
	public Chips(int hundreds, int twentyFives, int fives, int ones)
	{
		chip100 = hundreds;
		chip25 = twentyFives;
		chip5 = fives;
		chip1 = ones;
	}
	public Chips() 
	{
		chip100 = 0;
		chip25 = 0;
		chip5 = 0;
		chip1 = 0;
	}
    //=====================================================================
    //  Return the initial balance
    //=====================================================================
	public int value()
	{
		return chip100 * 100 + chip25 * 25 + chip5 * 5 + chip1 * 1;
	}
    //=====================================================================
    //  Return the based on player money chip exchange
    //=====================================================================
	public String chipExchange(int amt) 
	{
		String exchange;
        switch (amt) 
        {
            case 100:  exchange = "for 2 $25-chips, 5 $5-chips, 25 $1-chips";
                     break;
            case 200:  exchange = "for 4 $25-chips, 10 $5-chips, 50 $1-chips";
                     break;
            case 300:  exchange = "for 6 $25-chips, 15 $5-chips, 75 $1-chips";
                     break;
            case 500:  exchange = "for 8 $25-chips, 30 $5-chips, 150 $1-chips";
            			break;
            case 1000:  exchange = "for 10 $25-chips, 75 $5-chips, 375 $1-chips";
            			break;
            case 2000:  exchange = "for 12 $25-chips, 170 $5-chips, 850 $1-chips";
            			break;
            default: exchange = "ERROR: Unknown amount.";
                     break;
        }
        return exchange;
	}
    //=====================================================================
    //  Player buy-in and re-buy
    //=====================================================================
	public void buy(Chips tableChips, int numHundreds)
	{
		numHundreds = numHundreds / 100;
		for (int i = 0; i < numHundreds; i++)
		{
				chip25 += 2;
				chip5 += 5;
				chip1 += 25;
				tableChips.chip25 -= 2;
				tableChips.chip5 -= 5;
				tableChips.chip1 -= 25;
		}
	}
    //===================================================================
    //  To string
    //===================================================================
	public String toString()
	{
		String result = "   $100 chips: \t" + chip100 + "\n";
		result += "   $25 chips: \t" + chip25 + "\n";
		result += "   $5 chips: \t" + chip5 + "\n";
		result += "   $1 chips: \t" + chip1 + "\n";
		return result;
	}
}
