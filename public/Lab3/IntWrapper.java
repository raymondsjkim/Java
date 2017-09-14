import java.util.Scanner;
public class IntWrapper {

	public static void main(String[] args) {
		int read_int, num1, num2;
		Scanner scan = new Scanner(System.in);
		// Prompt for and read in an integer to convert
		System.out.print("Enter in a integer to convert to Binary, Octal, and Hexadecimal: ");
		read_int = scan.nextInt();
		System.out.println();
		// Prompt the user to enter two decimal integers, one per line for calculation
		System.out.print("Enter in number for x: ");
		num1 = scan.nextInt();
		System.out.print("Enter in number for y: ");
		num2 = scan.nextInt();
		// Declare and instantiate the integer objects
		Integer num = new Integer(read_int);
		Integer num1Obj = new Integer(num1);
		Integer num2Obj = new Integer(num2);
		// Convert to binary, octal, and hexadecimal
        String binary = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num);
        String hexadecimal = Integer.toHexString(num);
        System.out.println();
        // print the binary, octal and hexadecimal 
        System.out.println("Binary value: " + binary);
        System.out.println("Octal value: " + octal);
        System.out.println("Hexadecimal value: " + hexadecimal);
        System.out.println();
        // Print the maximum and minimum possible Java integer values
        System.out.println("Max possible Java integer value: " + Integer.MAX_VALUE); 
        System.out.println("Min possible Java integer value: " + Integer.MIN_VALUE); 
        System.out.println();
//        System.out.println(num2Obj.getClass().getName());
        System.out.println("The total of x and y is: " + (num1Obj + num2Obj));

		System.exit(0);
	}

}
