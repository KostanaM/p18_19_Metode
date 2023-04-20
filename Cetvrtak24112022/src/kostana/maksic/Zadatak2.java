package kostana.maksic;

import java.util.Scanner;

public class Zadatak2 {

	static double polinom(double a[], double x, int n) {
		double p = a[n];
		while (n != 0) {
			p = p * x + a[n - 1];
			n--;
		}
		return p;
	}

	public static void main(String[] args) {
		double a[] = { 0.75, 163.2, -3.17, 5.6, 5.6, -2.34, -1.21, 26.7, -3.66, 10.2, -11.6 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n manji od 11");
		int n = sc.nextInt();
		if (n <= 10) {
			System.out.println("X\tP(X)");
			for (double x = 10.0; x <= 20.0; x += 1.0)
				System.out.println(x + "\t" + polinom(a, x, n));
		} else
			System.out.println("Uneli ste veću vrednost od potrebne!");
		sc.close();
	}
}
