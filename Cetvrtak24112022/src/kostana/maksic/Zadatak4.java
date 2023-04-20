package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak4 {

	static double f(double x) {
		double s = 0;
		for (int k = 0; k <= 20; k++)
			s += Math.cos(k * x) + (x * x - 3 * k * x) / (Math.sin(x) + Math.cos(x));

		return s;
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");

		for (double x = 0.0; x <= 2.0; x += 0.2) {
			System.out.println(df.format(x) + "\t" + df.format(f(x)));
		}

	}

}
