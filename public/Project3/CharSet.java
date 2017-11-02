import java.util.Arrays;
public class CharSet {
	int[] a;
	
	public CharSet() {
		a = new int[128];
	}
	public CharSet(char c) {
		
	}
	public CharSet(String s) {

	}
	
	

	public String toString() {
		return Arrays.toString(a);
	}

}
