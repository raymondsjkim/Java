// ************************************************************
// TestWalk.java
//
// Program to test methods in the RandomWalk class.
// ************************************************************
import java.util.Scanner;
public class TestWalk
{
public static void main (String[] args)
	{
		int maxSteps; // maximum number of steps in a walk
		int maxCoord; // the maximum x and y coordinate
		int x, y; // starting x and y coordinates for a walk
		Scanner scan = new Scanner(System.in);
		RandomWalk walk1, walk2;
		System.out.println ("\nRandom Walk Test Program");
		System.out.println ();
		System.out.print ("Enter the boundary for the square: ");
		maxCoord = scan.nextInt();
		System.out.print ("Enter the maximum number of steps: ");
		maxSteps = scan.nextInt();
		System.out.print ("Enter the starting x and y coordinates with " +
		"a space between: ");
		x = scan.nextInt();
		y = scan.nextInt();
		
		// Create two walk objects
		walk1 = new RandomWalk(10,5);
		walk2 = new RandomWalk(maxSteps, maxCoord, x, y);
		System.out.println ();
		// have each walk object take 5 steps
		System.out.println("Walk1\t\t\t\tWalk2");
		for(int i = 1; i <= 5; i++) {
			walk1.takeStep();
			walk2.takeStep();
			System.out.println(walk1 + "\t" + walk2);
		}
		
	}
}
