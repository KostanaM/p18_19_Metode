package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak3 {

	static double f(double x) {

		return Math.pow(x, 4) - 10 * Math.pow(x, 3) + 35 * Math.pow(x, 2) - 50 * x + 24;

	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##.##");
		for (double x = 0.0; x <= 0.9; x += 0.1) {
			System.out.println(df.format(x) + "\t" + df.format(f(x)));
		}

	}

}
