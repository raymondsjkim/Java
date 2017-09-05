import java.util.Scanner;

public class Interactive {

	public static void main(String[] args) {

	      int miles;
	      double gallons, mpg;
	      String model;

	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the model: ");
	      // takes in a String	
	      model = scan.next();
	      
	      System.out.print("Enter the number of miles: ");
	      // takes in a int		
	      miles = scan.nextInt();

	      System.out.print("Enter the gallons of fuel used: ");
	      // takes in a double		
	      gallons = scan.nextDouble();

	      mpg = miles / gallons;

	      System.out.println("Model: " + model);
	      System.out.println("Miles Per Gallon: " + mpg);

	      scan.close();
	}

}
