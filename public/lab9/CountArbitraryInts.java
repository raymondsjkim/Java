import java.util.Scanner;
public class CountArbitraryInts {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] values = new int[51];
		System.out.print("Enter in values (0 to execute): ");
		int num = scan.nextInt();
		System.out.println();
		//  Count occurrence of same value
		while(num != 0 && num >= 1 && num <= 50) {
			values[num]++;
			num = scan.nextInt();
		}
		// print values that are greater than 0 to 50
		for(int i = 0; i <= 50; i++) {
			if(values[i] > 0) {
				System.out.println(i + " occurred " + values[i] + " time(s)");
			}
		}
	}
}
