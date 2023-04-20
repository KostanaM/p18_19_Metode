package kostana.maksic;

import java.util.Scanner;

//Napisati funkciju kojom se ispituje da li se pravougaonik dužina stranica a i b može ceo smestiti u pravougaonik dužina stranica c i d uz uslov da su im stranice paralelne. U glavnom programu uneti pravougaonik sa stranicama a i b i n pravougaonika sa stranicama c i d.

public class Zadatak13b {

	static boolean uslov(int a, int b, int c, int d) {
		return ((a < c) && (b < d)) || ((a < d) && (b < c));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, n;
		int c[] = new int[100];
		int d[] = new int[100];
		System.out.print("Unesite stranicu a: ");
		a = sc.nextInt();
		System.out.print("Unesite stranicu b: ");
		b = sc.nextInt();
		System.out.print("Koliko želite uneti pravougaonika?");
		n = sc.nextInt();
		System.out.print("Unesite dimenzije pravougaonika");
		for (int i = 1; i <= n; i++) {
			System.out.print("c[" + i + "] =");
			c[i] = sc.nextInt();
			System.out.print("d[" + i + "] =");
			d[i] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			if (uslov(a, b, c[i], d[i]))
				System.out.println("Pravougaonik sa stranicama a = " + a + " i b = " + b
						+ " nalazi se u pravougaoniku stranica c = " + c[i] + " i d = " + d[i]);
			else
				System.out.println("Pravougaonik sa stranicama a = " + a + " i b = " + b
						+ " ne nalazi se u pravougaoniku stranica c = " + c[i] + " i d = " + d[i]);
		}
		sc.close();
	}

}
