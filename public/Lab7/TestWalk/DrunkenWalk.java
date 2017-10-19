import java.util.Scanner;

public class DrunkenWalk {
	public static void main (String[] args)
	{
	      int stepsMax, boundary, numDrunks;
	      int fall = 0;
	      RandomWalk drunk;
	      Scanner scan = new Scanner(System.in);
	      System.out.println("\nDrunks Walk  Program");
	      System.out.println();
	      System.out.print("Enter the boundary for the square: ");
	      boundary = scan.nextInt();
	      System.out.print("Enter the maximum number of steps: ");
	      stepsMax = scan.nextInt();
	      System.out.print("Enter the number of drunks: ");
	      numDrunks = scan.nextInt();
	      System.out.println();
	 
	      for(int i = 1; i <= numDrunks; i++) {
	    	  	drunk = new RandomWalk(stepsMax,boundary);
	    	  	drunk.walk();
	    	  	System.out.println(drunk);
	        	if(!drunk.inBounds()){
	        		fall++;
	        	}
	      }
	      System.out.println("The times of the drunk falling off is " + fall);
	}
}
