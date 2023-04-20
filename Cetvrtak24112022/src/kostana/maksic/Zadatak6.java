package kostana.maksic;

import java.util.Scanner;

public class Zadatak6 {

	static int faktorijel(int n) {
		if (n == 0)
			return 1;
		else
			return faktorijel(n - 1) * n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite m: ");
		int m = sc.nextInt();
		System.out.println("Unesite n: ");
		int n = sc.nextInt();
		int r;

		if (m > n)
			r = faktorijel(m - n);
		else if (m == n)
			r = faktorijel(m);
		else
			r = faktorijel(n - m);
		System.out.println(r);
		sc.close();
	}

}
