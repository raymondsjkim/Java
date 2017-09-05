public class Bye {
	public static void main(String[] args) {
		
		// Constant variables
		final int MAX_LINE = 40;
		final String CONST_STR = "YO";
		System.out.println(MAX_LINE);
		System.out.println(CONST_STR);
		
		// 0 even, 1 odd
		int num = 11;
		int val = num % 2;
		System.out.println(val);
		
		// increment by 1 (either one works but choose one)
		num++; // 12
		++num; // 13
		System.out.println(num);
		
		// same as count = count + num;
		int count = 1;
		count += num;
		System.out.println(count);
		
		// expressions
		System.out.println(5 + 3 * 4 / 5);
		System.out.println(5.0 / 2.0 + 3.0);
		System.out.println(5 + 3 % 6);
		System.out.println((12 - 5) / 2);
		
		double dec_num = 5 / 2.0;
		System.out.println("The decimal(double) number is " + dec_num);
		
		// Assignment Conversion
		int dollars = 20;
		double money = dollars;
		System.out.println("20 dollars changed to " + money + " dollars");
		
		// Promotion Conversion
		int this_count = 12;
		double sum = 490.27;
		double this_result = sum / this_count;
		System.out.println(this_result);
		
		
		// Casting Conversion
		int total = 50;
		float result = (float) total / 6;
		System.out.println(result);
		
	}
}
