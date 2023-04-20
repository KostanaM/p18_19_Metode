package kostana.maksic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak15b {

	static double y(int n, double x, double[] a) {
		double s = 0;

		for (int i = 1; i <= n; i++) {
			double p = 1;
			for (int j = 1; j <= n; j++)
				if (i != j)
					p *= x - a[j];
			s += p;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");

		System.out.print("Unesite n: ");
		int n = sc.nextInt();
		System.out.println("Unesite a: ");
		double a[] = new double[100];
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextDouble();
		}
		System.out.println("\tN = " + n + "\tX" + "\tY");
		for (double x = 0.0; x <= 1.0; x += 0.1) {
			System.out.println("\t\t" + df.format(x) + "\t\t" + df.format(y(n, x, a)));

		}
		sc.close();
	}

}
