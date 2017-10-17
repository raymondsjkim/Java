
public class Compare3 {
	public static Comparable largest(Comparable c1,Comparable c2,Comparable c3){
        // greater than returns positive number
		// less than returns negative number
		// equals returns 0
		if (c1.compareTo(c2) >= 0){
            if (c1.compareTo(c3) >= 0){
                return c1;
            } else {
                return c3;
            }
        } else if (c2.compareTo(c3) >= 0) {
            return c2;
        } else {
            return c3;
        }
	}
	public static int largest(int s1, int s2, int s3) {
		return 5;
	}
}
