package kostana.maksic;

//Sastaviti algoritam i napisati program za tabeliranje vrednosti funkcije. Napomena: Za izračunavanje funkcija f i g koristiti metode.
import java.text.DecimalFormat;

public class Zadatak6c {

	static double f(double x) {
		return 2 * x - Math.log(x);
	}

	static double g(double x) {
		return Math.tan(x / 2) + Math.abs(x);
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,##0.00");
		System.out.println("\tX" + "\tY");
		double x, y;
		for (x = 0.1; x <= 0.9; x += 0.1) {
			y = f(2 * g(f(x)));

			System.out.println("\t" + df.format(x) + "\t" + df.format(y));

		}
	}

}
