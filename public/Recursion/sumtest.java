public class sumtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 1, 2, 3, 4, 5 };
		int sum = sumOfArray(a, a.length-1);
		
		System.out.println(sum);

	}
	public static int sumOfArray(int[] a, int n) {
	    if (n == 0)
	        return a[n];
	    else
	        return a[n] + sumOfArray(a, n-1);
	}
}
