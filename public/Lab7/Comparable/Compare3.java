
public class Compare3 {
	static String oNe, tWo, tHree;
	public Compare3 (String x, String y, String z) {
		oNe = x;
		tWo = y;
		tHree = z;
	}
	public String getOne() {
		return oNe;
	}
	public String getTwo() {
		return tWo;
	}
	public String getThree() {
		return tHree;
	}
	
	public static String largest() {
		
	}
	
	public String toString() {
		String phrase = oNe + " " + tWo + " " + tHree;
		return phrase;
	}
}
