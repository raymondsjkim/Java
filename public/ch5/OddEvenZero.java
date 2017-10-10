import java.util.Scanner;

public class OddEvenZero {
	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num;
        int evenCount = 0, oddCount = 0, zeroCount = 0;

        System.out.print("Enter an integer: ");
        num = scan.nextInt();

        	while (num > 0) {

        	    if ((num % 10)==0) {
        	       zeroCount++;
        	    }
        	    else if (num % 2 ==0) {
        	       evenCount++;
        	    }
        	    else { 
        	       oddCount++;
        	    }
        	    num = num / 10;
        	}
        	
        	System.out.printf("Even: %d Odd: %d Zero: %d", evenCount, oddCount, zeroCount);
	}
}
