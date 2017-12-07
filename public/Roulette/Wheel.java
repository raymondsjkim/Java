import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//************************************************************************
//	Class Wheel represents the playing of the game
//************************************************************************
class Wheel
{
	static ArrayList<Game> currentGames = new ArrayList<Game>(); 
	static ArrayList<Player> currentPlayers = new ArrayList<Player>(); 
	static Scanner scan = new Scanner(System.in);
	public static Player p1; 
	public static VIP p2;
	public static SuperVIP p3;
	public static int numOfGames;
	public static int gameTracker;
	public static int mainOption, gameOption;
	private static int roundNum = 0;
	public static String gameSelect;
    private static int ballPosition;					// 00, 0, 1 .. 10
    private static int color;						// GREEN, RED, OR BLACK
    public final static int BLACK     =  0;			// even numbers
    public final static int RED       =  1;			// odd numbers
    public final static int GREEN     =  2;			// 00 OR 0
    public final static int NUMBER    =  3;			// number bet
    public final static int MIN_NUM   =  1;			// smallest number to bet
    public final static int MAX_NUM   = 36;			// largest number to bet
    private final static int MAX_POSITIONS = 38;	 	// number of positions on wheel
    private final static int NUMBER_PAYOFF = 10;		// payoff for number bet
    private final static int COLOR_PAYOFF  = 2;		// payoff for color bet
    //=====================================================================
    //  Load games and players into the game.
    //	Display available games.
    //=====================================================================
    public static void welcomeMessage() throws IOException 
    {
      	GameFile.load(currentGames, currentPlayers);
      	numOfGames = currentGames.size();
      	System.out.println();
		System.out.println("Initialize games. Please wait...");
		System.out.println("All games are ready.");
		for (int i = 0; i < numOfGames; i++) 
		{
			System.out.println(currentGames.get(i).getGameID());
		}
    }
    //=====================================================================
    //	Display menu options to select a game, add 
    // 	player to the list, or quit game.
    //=====================================================================
    public static void MainMenu() 
    {
    		System.out.println();
		System.out.println("Main Menu");
		System.out.println("1. Select a game");
		System.out.println("2. Add a new player to the list");
		System.out.println("3. Quit\n");
		// read in main menu input
		System.out.print("Option --> ");
		mainOption = scan.nextInt();

		while(mainOption != 1 && mainOption != 2 && mainOption != 3) 
		{
			System.out.println("Invalid choice please re-enter");
			System.out.print("Option --> ");
			mainOption = scan.nextInt();
		}
		// Display game menu 
		if(mainOption == 1) 
		{
			int valid = 0;
			while (valid == 0) 
			{
				System.out.print("Select a game --> ");
				gameSelect = scan.next();
				for (int i = 0; i < numOfGames; i++)
				{
					// if game 100A1 or 100A2
					if (currentGames.get(i).getGameID().equals(gameSelect))
					{
						GameMenu(i);
					}
					else if ((i == numOfGames - 1) && valid == 0) {
						System.out.println("Invalid input, please retry");
					}
				}
			}
		}
		// Add new player to the list current player list
		else if (mainOption == 2) 
		{
			System.out.print("\n1.Normal Player\n2.VIP\n3.Super VIP\n\nSelect one -- > ");
			int type;
			type=scan.nextInt();
			if(type==1) 
			{
				System.out.println("Please enter starting money");
				p1 = new Player(0, scan.nextInt());
				currentPlayers.add(p1);
				System.out.println("The player has been added to the line");
			}
			else if(type==2) 
			{
				System.out.println("Please enter starting money, id, first and last name");
				p2 = new VIP(1, scan.nextInt(), scan.nextInt(), scan.next(), scan.next());
				currentPlayers.add(p2);
				System.out.println("The player has been added to the line");
			}
			else if(type==3) 
			{
				System.out.println("Please enter starting money, id, first and last name");
				p3 = new SuperVIP(2, scan.nextInt(), scan.nextInt(), scan.next(), scan.next());
				currentPlayers.add(p3);
				System.out.println("The player has been added to the line");
			}
			// Go back to main menu
			Wheel.MainMenu();
		}
		else {
			// quit
			System.out.println("Thank you come again");
		}
    }
    //=====================================================================
    //	Adds a player the the game and starts the game
    //=====================================================================
    public static void GameMenu(int game) 
    {
    	System.out.println();
		System.out.println("Game Menu");
		System.out.println("1. Add a player to the game");
		System.out.println("2. Play one round");
		System.out.println("3. Return to main menu\n");

		System.out.print("Option --> ");
		gameOption = scan.nextInt();

		if(gameOption == 1) 
		{
			currentGames.get(game).addPlayer(currentPlayers.remove(0)); // add player
			System.out.println();
			GameMenu(game);
		}
		else if (gameOption == 2) 
		{
			System.out.println();
			regGame(game); // play game
		}
		else 
		{
			roundNum = 0;
			MainMenu(); // go back to Main Menu
		}
    }
    //=====================================================================
    //	Players make bet, calculates chip exchange, and
    // 	players can make new bets.
    //=====================================================================
    public static void regGame(int game) 
    {
	    	if (currentGames.get(game).empty())
	    	{
	    		System.out.println();
	    		System.out.println("Please add players to the game first");
	    		GameMenu(game);
	    	}
	    	System.out.println("Game: " + currentGames.get(game).getGameID());
	    	System.out.println("Initial Balance: " + currentGames.get(game).getChips().value());
	    	System.out.println(currentGames.get(game).getChips());
	    
			for (int i = 0; i < currentGames.get(game).numPlayers(); i++)
			{
				if (currentGames.get(game).getPlayer(i).getBetCount() == 0)
				{
					Chips table, person;
					int cash;
					System.out.println();
					System.out.println(currentGames.get(game).getPlayer(i).getName(i) + ": exchanges " + 
							currentGames.get(game).getPlayer(i).getMoney() + " " + currentGames.get(game).chipsEx(currentGames.get(game).getPlayer(i).getMoney()));
					person = currentGames.get(game).getPlayer(i).getChips();
					table = currentGames.get(game).getChips();
					cash = currentGames.get(game).getPlayer(i).getMoney();
					person.buy(table, cash);
				}
			}

		if (roundNum > 0)
		{
			int count = 0;
			for (int i = 0; i < currentGames.get(game).numPlayers(); i++)
			{
				if (currentGames.get(game).getPlayer(i).getBetCount() > 0) 
				{
					System.out.println(currentGames.get(game).getPlayer(i).getName(count) + " play again [y/n]?");
				}
				
				if(currentGames.get(game).getPlayer(i).getBetCount() > 0 && !(currentGames.get(game).getPlayer(i).playAgain(scan)))
				{
					System.out.println(currentGames.get(game).getPlayer(i).getName(count) + " has left the game");
					currentGames.get(game).removePlayer(i); // remove player
					i--;
				}
				count++;
			}
			if (currentGames.get(game).empty()) 
			{
				GameMenu(game);
			}
			boolean stillBets = false;
			for (int i = 0; i < currentGames.get(game).numPlayers(); i++)
			{
				if (currentGames.get(game).getPlayer(i).getBetCount() < 3) 
				{
					stillBets = true;
				}
				else 
				{
					System.out.println("No new bets can be made");
				}
			}
			String newBet = "y";
		    while (newBet.equalsIgnoreCase("y") && stillBets)
		    {
			    	int numBet = 0;
			    	for (int i = 0; i < currentGames.get(game).numPlayers(); i++)
			    	{
			    		if (currentGames.get(game).getPlayer(i).getBetCount() < 3 && currentGames.get(game).getPlayer(i).getBetCount() > 0) 
			    		{
				    		System.out.println();
				    		System.out.println(currentGames.get(game).getPlayer(i).getName(i) + " would you like to make a new bet [y/n]?");
				    		newBet = scan.next();
				    		if(newBet.equalsIgnoreCase("y") && currentGames.get(game).getPlayer(i).getBetCount() < 3)
				    		{
				    			System.out.print(currentGames.get(game).getPlayer(i).getName(i) + " make a bet between $" +
				    					currentGames.get(game).getMinBet() + " and $" + currentGames.get(game).getMaxBet() + ": ");
		
				    			currentGames.get(game).getPlayer(i).makeBet(scan); 
				    			numBet++;
				    		}
				    		else if (currentGames.get(game).getPlayer(i).getBetCount() == 3 && newBet.equalsIgnoreCase("y"))
				    		{
				    			System.out.println("Player has reached maximum bets");
				    		}
				    		else
				    		{
				    			System.out.println("No new bet made");
				    		}
			    		}
			    		else 
			    		{
			    			newBet = "n";
			    		}
			    		if (i + 1 == currentGames.get(game).numPlayers())
			    		{
			    			newBet = "n";
			    		}
			    	}
			    	
			    	if (numBet == 0) 
			    	{
			    		System.out.println("No new bets made, game will begin");
			    	}
			}
		}
	    for (int i = 0; i < currentGames.get(game).numPlayers(); i++)
    		{
		    	if (currentGames.get(game).getPlayer(i).getBetCount() == 0)
		    	{
		    		System.out.println();
			    	System.out.print(currentGames.get(game).getPlayer(i).getName(i) + " make a bet between $" + currentGames.get(game).getMinBet() +
			    			" and $" + currentGames.get(game).getMaxBet() + ": ");
		
			    	boolean betMade = false;
		
			    	while (!betMade)
			    	{
			    		int bet = scan.nextInt();
			    		if (bet >= currentGames.get(game).getMinBet() && bet <= currentGames.get(game).getMaxBet())
				    	{
			    			currentGames.get(game).getPlayer(i).makeBet(bet, scan);
			    			//currentGames.get(game).getPlayer(i).payment();				//////// display winnings/losings/currentBalance
				    		betMade = true;
				    	}
			    		else
			    			System.out.println("Invalid bet, please enter new bet");
			    	}
		    	}
    		}
	    System.out.println();
		spin(); // Spin the wheel and ballPosition
		System.out.println();
		for (int i = 0; i < currentGames.get(game).numPlayers(); i++)
		{
			    	System.out.println();
			    	System.out.println(currentGames.get(game).getPlayer(i).getName(i));
			    	currentGames.get(game).getPlayer(i).payment();
		}
		roundNum++;
		GameMenu(game);
    }
    //=====================================================================
    //	Display betting options
    //=====================================================================
    public static void betOptions()
    {
    	System.out.println();
      	System.out.println("Betting Options:");
      	System.out.println("    1. Bet on black (even numbers)");
      	System.out.println("    2. Bet on red (odd numbers)");
      	System.out.println("    3. Bet on a number between " + MIN_NUM +
      			" and " + MAX_NUM);
    }
    //=====================================================================
    //	Spin the wheel and return a random number between 1 and 38
    //=====================================================================
    public static void spin() {
    		Random rand = new Random();
    		int ballPosition = rand.nextInt(MAX_POSITIONS) + 1;
    		if(ballPosition == 11 || ballPosition == 12) {
	    		color = GREEN;
	    	} else if((ballPosition % 2) == 0) {
	    		color = BLACK;
	    	} else if ((ballPosition % 2) == 1) {
	    		color = RED;
	    	}
    		System.out.println("The color is " + ((color < 1) ? "Black" : "Red") + " and the ball position is at " + ballPosition);
    }
    //=====================================================================
    //	Winning pay off amount
    //=====================================================================
    public static int payoff(int amtBet, int typeBet, int numBet) {
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
