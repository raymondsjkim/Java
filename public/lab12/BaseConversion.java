import java.util.Scanner;

public class BaseConversion
{

public static void main (String[] args)
{
   int base10Num;
   int base;
     
   Scanner scan = new Scanner (System.in);
     
   System.out.println ();
   System.out.println ("Base Conversion Program");
   System.out.print ("Enter an integer: ");
   base10Num = scan.nextInt();
   System.out.print ("Enter the base: ");
   base = scan.nextInt();
     
   // Call convert and print the answer
   System.out.println(base10Num + " in base " + base + " is " +
   convert(base10Num,base));
   scan.close();
}

// --------------------------------------------------
// Converts a base 10 number to another base.
// --------------------------------------------------
public static String convert (int num, int b)
{
   int quotient; // the quotient when num is divided by base b
   int remainder;
   quotient = num / b;
   remainder = num % b;
   if(quotient==0)
   {
       return Integer.toString(remainder);
   }
   else
   {
       // recursive step: number is base b representation of
       // the quotient concatenated with the remainder
       return (convert(quotient, b) + Integer.toString(remainder));
   }

}
}
