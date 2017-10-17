
import java.util.Scanner;
public class Comparisons {
	public static void main(String[] args) {
	       	String val1;
	        String val2;
	        String val3;
	        int s1, s2, s3;
	        Scanner scan= new Scanner(System.in);
	        // Prompt user
	        System.out.print("Please enter the first string:");
	        val1 = scan.nextLine();
	        System.out.print("Please enter the second string:");
	        val2 = scan.nextLine();
	        System.out.print("Please enter the third string:");
	        val3 = scan.nextLine();
	        // Call and print the largest

	        
	        // Prompt user
	        System.out.print("Please enter the first integer:");
	        s1 = scan.nextInt();
	        System.out.print("Please enter the second integer:");
	        s2 = scan.nextInt();
	        System.out.print("Please enter the third integer:");
	        s3 = scan.nextInt();
	        
	        System.out.println();
	        
	        System.out.println("The largest string is: " + Compare3.largest(val1,val2,val3));
	        System.out.println("The largest integer is: " + Compare3.largest(s1,s2,s3));
	        

	}
}
