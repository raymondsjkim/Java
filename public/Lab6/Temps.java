import java.util.Scanner;
public class Temps
{
	// --------------------------------------------------
	// Reads in a sequence of temperatures and finds the
	// maximum and minimum read in.
	// --------------------------------------------------
	public static void main (String[] args)
	{
		final int HOURS_PER_DAY = 5;
		int temp; // a temperature reading
		int maxTemp = -1000;	//maximum temperature
		int minTemp = 1000;	//minimum temperature
		int timeOfMax = 0;	//time of maximum temperature
		int timeOfMin = 0;	//time of minimum temperature
		Scanner scan = new Scanner(System.in);
		// print program heading
		System.out.println ();
		System.out.println ("Temperature Readings for 24 Hour Period");
		System.out.println ();
		for (int hour = 0; hour < HOURS_PER_DAY; hour++)
		{
			System.out.print ("Enter the temperature reading at " + hour + " hours: ");
			temp = scan.nextInt();
			if (temp > maxTemp)
			{
				maxTemp = temp;
				timeOfMax = hour;
			}
			if(temp < minTemp) {
				minTemp = temp;
				timeOfMin = hour;
			}
		}
		System.out.println ();
		// Print the results
		System.out.println("The maximum temperature of " + maxTemp + " happened at hour " + timeOfMax);
		System.out.println("The minimum temperature of " + minTemp + " happened at hour " + timeOfMin);
	}
}
