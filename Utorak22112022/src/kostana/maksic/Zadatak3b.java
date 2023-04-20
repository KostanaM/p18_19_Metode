package kostana.maksic;

//Napisati metodu za štampanje kvadratne matrice reda 2. U glavnom programu uneti matricu i odštampati je.

public class Zadatak3b {
	final static int red = 2;
	final static int kolona = 2;

	static void stampajMatricu(int matrica[][]) {
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++)
				System.out.print(matrica[i][j] + " ");

			System.out.println();
		}
	}

	public static void main(String[] args) {

		System.out.println("Matrica izgleda ovako: ");
		int a[][] = { { 1, 2 }, { 3, 4 } };
		stampajMatricu(a);

	}

}
