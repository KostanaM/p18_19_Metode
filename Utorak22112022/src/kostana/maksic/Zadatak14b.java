package kostana.maksic;

public class Zadatak14b {

	static int D(int a1, int a2, int b1, int b2) {
		return a1 * b2 - a2 * b1;
	}

	public static void main(String[] args) {
		int[][] a = { { 1, -3, 2 }, { 4, 1, -8 }, { -7, 8, 6 } };
		int determinanta = a[0][0] * D(a[1][1], a[1][2], a[2][1], a[2][2])
				- a[0][1] * D(a[1][0], a[1][2], a[2][0], a[2][2]) + a[0][2] * D(a[1][0], a[1][1], a[2][0], a[2][1]);
		System.out.println("Determinata je " + determinanta);

	}

}
