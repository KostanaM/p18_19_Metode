package kostana.maksic;

import java.util.Scanner;

public class Zadatak1 {

	static double rastojanje(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x[] = new double[100];
		double y[] = new double[100];
		System.out.println("Unesite n: ");
		int n = sc.nextInt();
		System.out.println("Unesite kordinate: ");

		for (int i = 1; i <= n; i++) {
			System.out.println(i + ".tačka: ");
			System.out.print("x= ");
			x[i] = sc.nextDouble();
			System.out.print("y= ");
			y[i] = sc.nextDouble();

		}
		System.out.println("\tR.BR.\tX\tY\tRastojanje");
		for (int i = 1; i <= n; i++) {
			System.out.println("\t" + i + "\t" + x[i] + "\t" + y[i] + "\t" + rastojanje(0, 0, x[i], y[i]));
		}
		sc.close();
	}
}
