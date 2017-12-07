import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
//************************************************************************
//	Class GameFile loads the files into the game.
//************************************************************************
public class GameFile {
	public static String gameVersion; // game version
    //=====================================================================
    //  Add each players to an ArrayList of Player objects
	//	Add each games to an ArrayList of Game objects
    //=====================================================================
	public static void load(ArrayList<Game> availGames, ArrayList<Player> availPlayers) throws IOException 
	{
		String gameFile = "/Users/raymond_kim/Desktop/project4/Roulette/src/games.txt";
		String playerFile = "/Users/raymond_kim/Desktop/project4/Roulette/src/players.txt";
		try
		 {
			Scanner fileScan = new Scanner(new File(gameFile));
			Chips tableChips;
			String line;
			Player player;
			VIP vip;
			SuperVIP superVip;
			// read in values to availGames
			gameVersion = fileScan.next();
			int numOfGames = Integer.parseInt(fileScan.next());
			for (int i = 0; i < numOfGames; i++) 
			{
				availGames.add(new Game(gameVersion + Integer.toString(i + 1), Integer.parseInt(fileScan.next()),Integer.parseInt(fileScan.next()), tableChips = new Chips(Integer.parseInt(fileScan.next()),
						Integer.parseInt(fileScan.next()),Integer.parseInt(fileScan.next()),Integer.parseInt(fileScan.next()))));
			}
			 // read in values to availPlayers
			fileScan = new Scanner(new File(playerFile));
			Scanner lineScan;
			while (fileScan.hasNext())
			{
				line = fileScan.nextLine();
				lineScan = new Scanner(line);
				int playerType = Integer.parseInt(lineScan.next());
				if (playerType == 0)
				{
					availPlayers.add(player = new Player(playerType, Integer.parseInt(lineScan.next())));
				}
				else if (playerType == 1)
				{
					availPlayers.add(vip = new VIP(playerType, Integer.parseInt(lineScan.next()), Integer.parseInt(lineScan.next()), lineScan.next(), lineScan.next()));
				}
				else if (playerType == 2)
				{
					availPlayers.add(superVip = new SuperVIP(playerType, Integer.parseInt(lineScan.next()), Integer.parseInt(lineScan.next()), lineScan.next(), lineScan.next()));
				}
			}
			fileScan.close(); // close scanner
		 } catch (FileNotFoundException exception) {
			 System.out.println ("The file " + playerFile + " and " + gameFile + " was not found.");
		 } 		
	}
    //=====================================================================
    //	Return game version
    //=====================================================================
	public static String getVersion()
	{
		return gameVersion;
	}
}
