import java.util.Scanner;

public class inputArray
{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	
    	final int MAX = 10;
    	int[] grades = new int[MAX];
    	
    	System.out.println(grades.length);
    	
      // fill in the array
    	for(int i = 0; i < grades.length; i++) {
    		System.out.print("Enter grade: ");
    		grades[i] = scan.nextInt();
    	}
      // print out values in the array
    	for(int grade : grades) {
    		System.out.print(grade + " ");
    	}
    }
}
