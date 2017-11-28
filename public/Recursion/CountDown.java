public class CountDown {

	public static void main(String[] args) {		
		countDown(3);
	}
	public static void countDown(int n) {
	    if (n == 0)
	        return;
	    else
	    	System.out.print(n + " ");
	        countDown(n-1);
	}
}
