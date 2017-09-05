import java.util.Scanner;

public class LabGrade
{
	public static void main (String[] args)
	{
		// Declare constants
		double in_weight = 0.6; // in-class weight is 60%
		double out_weight = 0.4; // out-of-class weight is 40%
		// Declare variables
		int preLabPts; //number of points earned on the pre-lab assignment
		int preLabMax; //maximum number of points possible for pre-lab
		int labPts; //number of points earned on the lab
		int labMax; //maximum number of points possible for lab
		int postLabPts; //number of points earned on the post-lab assignment
		int postLabMax; //maximum number of points possible for the post-lab
		double outClassAvg; //average on the out of class (pre and post) work
		double inClassAvg; //average on the in-class work
		double labGrade; //final lab grade
		Scanner scan = new Scanner(System.in);
		// Get the input
		System.out.println("\nWelcome to the Lab Grade Calculator\n");
		System.out.print("Enter the number of points you earned on the pre-lab: ");
		preLabPts = scan.nextInt(); // 17
		System.out.print("What was the maximum number of points you could have earned? ");
		preLabMax = scan.nextInt(); // 20
		System.out.print("Enter the number of points you earned on the lab: ");
		labPts = scan.nextInt(); // 23
		System.out.print("What was the maximum number of points for the lab? ");
		labMax = scan.nextInt(); // 25
		System.out.print("Enter the number of points you earned on the post-lab: ");
		postLabPts = scan.nextInt(); // 12
		System.out.print("What was the maximum number of points for the post-lab? ");
		postLabMax = scan.nextInt(); // 15
		System.out.println();
		// Calculate the average for the out of class work
		outClassAvg = 100 * (preLabPts + postLabPts) / (preLabMax + postLabMax);
		// Calculate the average for the in-class work
		inClassAvg = 100 * labPts / labMax;
		// Calculate the weighted average taking 40% of the out-of-class average
		// plus 60% of the in-class
		labGrade = out_weight * outClassAvg + in_weight * inClassAvg;
		// Print the results
		System.out.println("Your average on out-of-class work is " + outClassAvg + "%");
		System.out.println("Your average on in-class work is " + inClassAvg + "%");
		System.out.println("Your lab grade is " + labGrade + "%");
		System.out.println();
	}
}
