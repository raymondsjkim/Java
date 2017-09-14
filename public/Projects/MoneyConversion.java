import java.util.Scanner;
public class MoneyConversion {
	public static void main(String[] args) {
        double amount;
        int one, five, ten;
        int penny, nickel, dime, quarter;
        Scanner scan= new Scanner(System.in);
       
        System.out.print("What is the amount? ");
        amount = scan.nextDouble();
        
        ten = (int) amount / 10;
        amount = amount % 10;
        System.out.println ("Left over amount when 10 is taken out " + amount);
       
        five = (int) amount / 5;
        amount = amount % 5;
        System.out.println ("Left over amount when 5 is taken out " + amount);
       
        one = (int) amount / 1;
        amount = amount % 1;
        System.out.println ("Left over amount when 1 is taken out " + amount);
       
        quarter = (int) (amount / 0.25);
        amount = amount % 25;
        System.out.println ("Left over amount when .25 is taken out " + amount);
        
        dime = (int) (amount / 0.10);
        amount = amount % 10;
        System.out.println ("Left over amount when .10 is taken out " + amount);
       
        nickel = (int) (amount / 0.5);
        amount = amount % 5;
        System.out.println ("Left over amount when .5 is taken out " + amount);
       
        penny = (int) (amount / 0.01);
        amount = amount % 1;
        System.out.println ("Left over amount when .01 is taken out " + amount);
        
        System.out.println ();
        
        System.out.println (ten + " ten dollar bills");
        System.out.println (five + " five dollar bills");
        System.out.println (one + " one dollar bills");
        System.out.println (quarter + " quarters");
        System.out.println (dime +  " dimes");
        System.out.println (nickel + " nickels");
        System.out.println (penny + " pennies");
	}
}
