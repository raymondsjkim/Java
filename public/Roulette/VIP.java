//************************************************************************
//   Class VIP represents one vip roulette player.
//************************************************************************
public class VIP extends Player
{
    private int id;
    private String firstName, lastName;
    //=====================================================================
    //  The SuperVIP constructor sets up type, money, id, first and last
    //	names.
    //=====================================================================
    public VIP(int type, int moneys, int identification, String fName, String lName)
    {
    		super(type, moneys);
        id = identification;
        firstName = fName;
        lastName = lName;
    }
    //=====================================================================
    //  Return player name
    //=====================================================================
    public String getName(int placeholder)
    {
        return firstName + " " + lastName;
    } 
    //=====================================================================
    //  To string
    //=====================================================================
    public String toString() 
    {
		return "1" + " " + this.getMoney() + " " + this.getID() + " " + firstName + " " + lastName;
    }
}
