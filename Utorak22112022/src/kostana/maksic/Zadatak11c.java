package kostana.maksic;

import java.util.Scanner;

//Sastaviti algoritam i napisati program za rekurzivno izračunavanje Fibonačijevih brojeva prema formuli

public class Zadatak11c {

	static int F(int i) {
		if (i > 1)
			return F(i - 1) + F(i - 2);
		else if (i == 1)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite n= ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)
			System.out.print(F(i - 1));
		sc.close();
	}

}
