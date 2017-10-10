
public class Stars {

	public static void main(String[] args) {
		final int MAX = 10;
		
		// part a
//		for (int i = MAX; i >= 1; i--) {
//			for (int star = i; star > 0; star--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		// part b
		// x is rows
		for (int x = 0; x < MAX; x++) {
			for (int spaces = 0; spaces < 10 - x; spaces++) {
				System.out.print(" ");
			}
			for (int stars = 1; stars < x; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
