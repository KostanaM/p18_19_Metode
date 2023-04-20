package kostana.maksic;

import java.util.Scanner;

//Sastaviti algoritam i napisati metodu kojom se za zadate vrednosti x, y i z izračunava vrednost f po formuli

public class Zadatak12b {
	static int f(int x, int y, int z) {
		int f = (y < z) ? y : z;
		if (x > f)
			f = x;
		return f;
	}

	public static void main(String[] args) {
		System.out.println("Unesite vrednost za x, y i z:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println("Vrednost za f je " + f(x, y, z));
		sc.close();
	}

}
