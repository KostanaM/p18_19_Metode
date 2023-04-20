package kostana.maksic;

import java.util.Scanner;

//Napisati metodu kojom se utvrđuje da li je godina prestupna ili nije. U glavnom programu uneti godinu i ispitati da li je prestupna ili nije. Na primer, 1972. godina je prestupna.

public class Zadatak16b {
	static void prestupna(int g) {
		if (g % 4 == 0 && g % 100 != 0 || g % 400 == 0)
			System.out.println("Godina " + g + " je prestupna");
		else
			System.out.println("Godina " + g + " nije prestupna");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite godinu");
		int g = sc.nextInt();

		prestupna(g);
		sc.close();
	}

}
