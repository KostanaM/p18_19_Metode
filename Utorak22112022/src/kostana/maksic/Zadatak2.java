package kostana.maksic;

//Napisati metodu za štampanje i izračunavanje srednje vrednosti niza od n elemenata. U glavnom programu odštampati vrednost niza i izračunati srednju vrednost.
import java.util.Scanner;

public class Zadatak2 {
	static void stampajNiz(int n, double niz[]) {
		System.out.println("Uneti elementi niza su: ");
		for (int i = 0; i < n; i++)
			System.out.println(niz[i] + " ");
	}

	static double srednjaVrednost(int n, double niz[]) {
		double s = 0;
		for (int i = 0; i < n; i++)
			s += niz[i];
		return s / n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double niz[] = new double[10];
		System.out.println("Unesite broj elemenata niza: ");
		int n = sc.nextInt();
		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < n; i++) {
			System.out.print("niz[" + i + "]=");
			niz[i] = sc.nextDouble();
		}
		stampajNiz(n, niz);
		System.out.println("Srednja vrednost niza je " + srednjaVrednost(n, niz));
		sc.close();
	}
}
