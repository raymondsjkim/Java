import java.util.Scanner;
public class Coins {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double bias1, bias2;
		int coinOneCount = 0;
		int coinTwoCount = 0;
		int coinThreeCount = 0;
		BiasedCoin coin1 = new BiasedCoin();
		BiasedCoin coin2, coin3;
		System.out.print("Enter bias 1 for coin 2: ");
		bias1 = scan.nextDouble();
		System.out.print("Enter bias 2 for coin 3: ");
		bias2 = scan.nextDouble();
		coin2 = new BiasedCoin(bias1);
		coin3 = new BiasedCoin(bias2);
		for(int i = 0; i <= 100; i++) {
			coin1.flip();
			coin2.flip();
			coin3.flip();
			if(coin1.isHeads()) {
				coinOneCount++;
			}
			if(coin2.isHeads()) {
				coinTwoCount++;
			}
			if(coin3.isHeads()) {
				coinThreeCount++;
			}
		}
		System.out.println();
		System.out.println("Coin1 with no bias HEAD count is " + coinOneCount);
		System.out.println("Coin2 with a bias of " + bias1 +  " HEAD count is " + coinTwoCount);
		System.out.println("Coin3 with a bias of " + bias2 +  " HEAD count is " + coinThreeCount);
	}
}
