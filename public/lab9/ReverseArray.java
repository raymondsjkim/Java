import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		int max;
		int[] list;
		Scanner scan = new Scanner(System.in);
		// prompt user for an integer
		System.out.print("Enter in array length: ");
		max = scan.nextInt();
		list = new int[max]; // declare array
		// ask the user to enter that many values	
		// store the values in an array and print it
		System.out.print("Enter values: ");
	    	for(int i = 0; i < list.length; i++) {
	    		list[i] = scan.nextInt();
	    	}
	    	System.out.println();
	    	System.out.print("Original values: ");
	    	for(int item : list) {
	    		System.out.print(item + " ");
	    	}
	    	System.out.println();
		// reverse the array and print
	    	for(int i = 0; i < list.length / 2; i++)
	    	{
	    	    int temp = list[i]; // first half indexes of list
	    	    // make last index of list the first
	    	    list[i] = list[list.length - i - 1];
	    	    // make first index if list the last
	    	    list[list.length - i - 1] = temp;
	    	}
	    	System.out.print("Reversed values: ");
	    	for(int item : list) {
	    		System.out.print(item + " ");
	    	}
	}
}
