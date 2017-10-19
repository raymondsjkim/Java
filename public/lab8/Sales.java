// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;
public class Sales
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int salespeople;
		
		int sum, value;
		int topPerson = 0;
		int lowPerson = 0; 
		System.out.print("Enter number of sales people: ");
		salespeople = scan.nextInt();
		int[] sales = new int[salespeople]; // array of 5 salespeople
	
		// fill in the array
		for (int i = 0; i < sales.length; i++)
		{
			System.out.print("Enter sales for salesperson " + (i+1) + ": ");
			sales[i] = scan.nextInt();
		}
		int maxSale = sales[0]; // max value in array
		int minSale = sales[0]; // min value in array
		
		System.out.println("\nSalesperson Sales");
		System.out.println(" ------------------ ");
		sum = 0;
		// print array and calculate sum, max, min
		for (int i = 0; i < sales.length; i++)
		{
			System.out.println(" " + (i+1) + " " + sales[i]);
			sum += sales[i];
			// max
			if(sales[i] > maxSale) {
				maxSale = sales[i];
				topPerson = i;
			}
			// min
			if(sales[i] < minSale) {
				minSale = sales[i];
				lowPerson = i;
			}
		}
		System.out.println("\nTotal sales: " + sum);
		
		// print average
		System.out.println("Average sales: " + (sum / sales.length));
		// print highest
		System.out.println("Salesperson " + topPerson + " had the highest sale with $" + maxSale);
		// print lowest
		System.out.println("Salesperson " + lowPerson + " had the lowest sale with $" + minSale);
		
		System.out.println();
		
		System.out.print("Enter a value: ");
		value = scan.nextInt();
		System.out.println();
		System.out.println("Sales people who exceeded the entered value:");
		// people that exceeded the value entered
		for (int i = 0; i < sales.length; i++)
		{
			if(value < sales[i]) {
				System.out.println(" " + (i+1) + " " + sales[i]);
			}
		}
	}
}
