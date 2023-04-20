package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak10 {
	static void prikaziMatricu(int a[][], int v, int k) {
		for (int i = 1; i <= v; i++) {
			for (int j = 1; j <= k; j++)
				System.out.print(" " + a[i][j]);

			System.out.println();
		}
	}

	static void transponovanje(int a[][], int b[][], int v, int k) {
		for (int i = 1; i <= v; i++)
			for (int j = 1; j <= k; j++)
				b[j][i] = a[i][j];
	}

	public static void main(String[] args) throws Exception {
		int[][] a = new int[10][10];
		int[][] b = new int[10][10];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite dimenziju vrste n matrice: ");
		int v = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite dimenziju kolone m matrice: ");
		int k = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite elemente matrice: ");
		for (int i = 1; i <= v; i++)
			for (int j = 1; j <= k; j++) {
				System.out.print("matrica[" + i + "]" + "[" + j + "]: ");
				a[i][j] = Integer.parseInt(ulaz.readLine());
			}

		System.out.println("Štampanje matrice pre zamene elemenata");
		prikaziMatricu(a, v, k);

		System.out.println("Štampanje matrice nakon zamene elemenata");
		transponovanje(a, b, v, k);
		prikaziMatricu(b, k, v);
	}
}
