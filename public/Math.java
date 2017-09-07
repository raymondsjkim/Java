
public class Math 
{
	public static void main(String[] args)
	{

		int a = 3, b = 10, c = 7;
		double w = 12.9, y = 3.2; 
		System.out.println(a + b * c); // 73
		System.out.println(a - b - c); // -14
		System.out.println(a / b); // 0
		System.out.println(b / a); // 3
		System.out.println(a - b / c); // 2
		System.out.println(w / y); // 4.03125
		System.out.println(y / w); // 0.24806201550387597
		System.out.println(a + w / b); // 4.29
		System.out.println(a % b / y); // 0.9375
		System.out.println(b % a); // 1
		System.out.println(w % y); // 0.09999999999999964
	}
} 
