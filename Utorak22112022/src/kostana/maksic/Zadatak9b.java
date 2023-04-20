package kostana.maksic;

import java.util.Scanner;

//Za n proizvoljno zadatih argumenata x sastaviti algoritam i napisati program za izračunavanje vrednosti funkcije

public class Zadatak9b {

	static double t(double z) {
		if (z <= 0)
			return z + 2;
		else if (z > 1)
			return z;
		else
			return Math.exp(z);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x[] = new double[100];
		System.out.print("Unesite broj elemenata n: ");
		int n = sc.nextInt();
		System.out.println("Unesite elemente niza: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] =");
			x[i] = sc.nextDouble();

		}
		System.out.println("\tR.BR.\tX\tY");
		for (int i = 1; i <= n; i++) {
			double y = t(x[i] + 2) + 1.4 * t(x[i] * x[i] - 1);
			System.out.println("\t" + i + "\t" + x[i] + "\t" + y);

		}
		sc.close();
	}
}
