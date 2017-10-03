import java.util.Scanner;
public class Election
{
	public static void main (String[] args)
	{
		int votesForPolly; // number of votes for Polly in each precinct
		int votesForErnest; // number of votes for Ernest in each precinct
		int totalPolly = 1; // running total of votes for Polly
		int totalErnest = 1; // running total of votes for Ernest
		String response = ""; // answer (y or n) to the "more precincts" question
		Scanner scan = new Scanner(System.in);
		System.out.println ();
		System.out.println ("Election Day Vote Counting Program");
		System.out.println ();
		
		// Initializations
        int precinctsForPolly = 0;
        int precinctsForErnest = 0;
        int precinctsTied = 0;
		// Loop to "process" the votes in each precinct
        do 
        {
            System.out.print("Enter votes for Polly: ");
            votesForPolly = scan.nextInt();
            System.out.print("Enter votes for Ernest: ");
            votesForErnest = scan.nextInt();
            
            totalPolly += votesForPolly;
            totalErnest += votesForErnest;
            
            if ( votesForPolly > votesForErnest )
                precinctsForPolly++;
            else if ( votesForErnest > votesForPolly )
                precinctsForErnest++;
            else
                precinctsTied++;
            
            System.out.print("More precincts to report? [y/n]: ");
            response = scan.next();
        }
        while ( response.equalsIgnoreCase("Y") );
        
      // Print out the results
        System.out.println();
        System.out.println("Candidate\tTotal\tPercent\tPrecincts");
        System.out.println("=========\t=====\t=======\t=========");
        System.out.println("Polly\t\t" + totalPolly + "\t" + (100*totalPolly/(totalPolly+totalErnest)) + "%\t" + precinctsForPolly );
        System.out.println("Ernest\t\t" + totalErnest + "\t" + (100*totalErnest/(totalPolly+totalErnest)) + "%\t" + precinctsForErnest);
        System.out.println();
        System.out.println("Precincts Tied: " + precinctsTied );		
	}
} 
