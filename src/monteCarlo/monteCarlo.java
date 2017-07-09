package monteCarlo;

import java.text.DecimalFormat;

public class monteCarlo {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.####");
		Pie p = new Pie();
		System.out.println("Pie estimate is " + df.format(p.calculatePie(100000)));

	}

}
