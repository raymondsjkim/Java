/*
*
*
*		Read chapter 3 and pp3.
*
*
*/

import java.util.Random;

public class ch3_notes {

	public static void main(String[] args) {
		String s1;
		String s2;
		int randomNumber;
		
		s1 = "abc"; // stores the address location
		s2 = s1; // s2 is now the value of the address location of s1
		s1 = "xyz"; // output is now "xyz"
		s2 = s2 + "123"; // output is now "abc123" changed value of s2
		System.out.println(s1);
		System.out.println(s2);
		
		// length object
		System.out.println(s2.length());
		// equals to object
		System.out.println(s1.equals(s2));
		// compare to object
		System.out.println(s1.compareTo(s2));
		
		// Create a new random object named rand
		Random rand = new Random();
		randomNumber = rand.nextInt(21) - 5;
		System.out.println(randomNumber);
		
		// Math class (static method)
		double x;
		double y = 4;
		x = Math.sqrt(y);
		System.out.println(x);

	}

}
