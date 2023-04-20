package kostana.maksic;

import java.util.Scanner;

public class Zadatak17b {

	static void vrstaVezeKondenzatora(double C1, double C2, int vrstaVeze) {
		double Ce;
		switch (vrstaVeze) {
		case 1:
			Ce = C1 * C2 / (C1 + C2);
			System.out.print("Kapacitet veze je " + Ce);
			break;
		case 2:
			Ce = C1 + C2;
			System.out.print("Kapacitet veze je " + Ce);
			break;
		default:
			System.out.print("Greška");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite 1 za rednu a 2 za paralelnu vezu: ");
		int n = sc.nextInt();
		System.out.print("Unesite C1: ");
		double C1 = sc.nextDouble();
		System.out.print("Unesite C2: ");
		double C2 = sc.nextDouble();
		vrstaVezeKondenzatora(C1, C2, n);
		sc.close();
	}

}
