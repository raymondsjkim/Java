import java.util.Scanner;
public class MoneyConversion {
	public static void main(String[] args) {
        double amount;
        int one, five, ten, twenty, penny, nickel, dime, quarter;
        Scanner scan= new Scanner(System.in);
        System.out.print("What is the amount? ");
        amount = scan.nextDouble(); // User input 57.63
        twenty = (int) amount / 20;
        amount = amount % 20; // amount 17.63
        ten = (int) amount / 10;
        amount = amount % 10; // amount is now 7.63
        five = (int) amount / 5;
        amount = amount % 5; // amount is now 2.63
        one = (int) amount / 1;
        amount = amount % 1;// amount is now 0.63
        quarter = (int) (amount / 0.25);
        amount = amount % 0.25; // amount is now 0.13
        dime = (int) (amount / 0.10);
        amount = amount % 0.10; // amount is now 0.03
        nickel = (int) (amount / 0.5);
        amount = amount % 0.5; // amount is still 0.03
        penny = (int) (amount / 0.01);
        amount = amount % 0.01; // amount is still 0.01
        // Print output
        System.out.println ();
        System.out.println (twenty + " twenty-dollar bill(s)");
        System.out.println (ten + " ten-dollar bill(s)");
        System.out.println (five + " five-dollar bill(s)");
        System.out.println (one + " one-dollar bill(s)");
        System.out.println (quarter + " quarter(s)");
        System.out.println (dime +  " dime(s)");
        System.out.println (nickel + " nickel(s)");
        System.out.println (penny + " pennie(s)");
	}
}
