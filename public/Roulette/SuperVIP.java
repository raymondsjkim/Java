//************************************************************************
//   Class SuperVIP represents one super vip roulette player.
//************************************************************************
public class SuperVIP extends VIP
{
    String firstName, lastName;
    //=====================================================================
    //  The SuperVIP constructor sets up type, money, id, first and last
    //	names.
    //=====================================================================
    public SuperVIP(int type, int moneys, int identification, String fName, String lName)
    {
        super(type, moneys, identification, fName, lName);
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
    //===================================================================
    //  To string
    //===================================================================
    public String toString() {
		return this.getPlayerType() + " " + this.getMoney() + " " + this.getID() + " " + firstName + " " + lastName;
    }
}
