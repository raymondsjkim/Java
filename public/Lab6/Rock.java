// ************************************************************
// Rock.java
//
// Play Rock, Paper, Scissors with the user
//
// ************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
	 public static void main(String[] args)
	{
		String personPlay; //User's play -- "R", "P", or "S"
		String computerPlay = ""; //Computer's play -- "R", "P", or "S"
		int computerInt; //Randomly generated number used to determine
		//computer's play
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		//Get player's play -- note that this is stored as a string
		//Make player's play uppercase for ease of comparison
		System.out.print("Play(R, P, or S): ");
		personPlay = scan.next().toUpperCase();
		System.out.println("My play: " + personPlay);
		//Generate computer's play (0,1,2)
		computerInt = generator.nextInt(3) + 0;
		//Translate computer's randomly generated play to string
		switch (computerInt)
		{
	        case 0:
	            computerPlay = "R";
	            break;
	        case 1:
	        	computerPlay = "P";
	            break;
	        case 2:
	        	computerPlay = "S";
	            break;
	        default:
	            System.out.println("Error.");	
		}
		//Print computer's play
		System.out.println("Computer play: " + computerPlay);
		 
		//See who won. Use nested ifs instead of &&.
		if (personPlay.equals(computerPlay))
			System.out.println("It's a tie!");
		else if (personPlay.equals("R"))
			if (computerPlay.equals("S"))
				System.out.println("Rock crushes scissors. You win!!");
			else
				//... Fill in rest of code
			
	}
}
