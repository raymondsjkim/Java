import java.util.Scanner;

public class Comparisons {

	public static void main(String[] args) {
		
		String one, two, three;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter one: ");
		one = scan.nextLine();
		System.out.print("Enter two: ");
		two = scan.nextLine();
		System.out.print("Enter three: ");
		three = scan.nextLine();
		
		Compare3 comp = new Compare3(one, two, three);
		
		
		System.out.print(comp);
		
		
	}

}
