package kostana.maksic;

import java.text.DecimalFormat;

public class Zadatak5 {

	static double f(double x, double y) {
		if (x < y)
			return Math.exp(x) * Math.sin(2 * y);
		else if (x == y)
			return Math.cos(x);
		else
			return 1 - Math.sqrt(Math.abs(x * y));
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		for (double x = 0.1; x <= 0.5; x += 0.1) {
			for (double y = 0.01; y <= 0.03; y += 0.01)
				System.out.println(df.format(x) + "\t" + df.format(y) + "\t" + df.format(f(x, y)));

		}
	}

}
