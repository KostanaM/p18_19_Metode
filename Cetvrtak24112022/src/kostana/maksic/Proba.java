package kostana.maksic;

import java.util.Scanner;

public class Proba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite red");
		int red = sc.nextInt();
		System.out.println("Unesite kolonu");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];

		System.out.println("Unesite matricu a");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "]=");
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
