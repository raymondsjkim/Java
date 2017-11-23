
public class Commission extends Hourly {
	double sales, commission;
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		commission = commRate;
	}
	
	public void addSales(double totalSales) {
		sales = sales + totalSales;
	}
	
	public double pay() {
        double payment = super.pay() + sales * commission;
        sales = 0;
        return payment;
	}
	public String toString() {
		String result = super.toString();
	    result += "\nTotal Sales: " + sales; 
	    return result;
	}

}
