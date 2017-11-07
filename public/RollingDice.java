import java.text.DecimalFormat;
public class RollingDice {
	public static void main(String[] args) {
		DecimalFormat fmt = new DecimalFormat("0.00");
		Die d1 = new Die();
		Die d2 = new Die();
		int[] dice1 = new int[1000];		
		int[] dice2 = new int[1000];
		int[] count = new int[1000];
		int sum;
		for(int x = 0; x < dice1.length; x++) {
			dice1[x] = d1.roll();
			dice2[x] = d2.roll();
			sum = dice1[x] + dice2[x];
			count[sum]++; // counts the sum
		}
		for(int i = 0; i < count.length; i++) {
			if(count[i] > 0) {
				System.out.println("Dice roll " + i + " occurred " + count[i] + " times\tPercentage %" 
						+ (fmt.format(((double)count[i] / 1000) * 100)));
			}
		}
	}
}
