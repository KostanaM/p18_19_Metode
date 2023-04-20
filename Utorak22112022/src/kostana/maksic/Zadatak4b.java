package kostana.maksic;
//Napisati metode za izračunavanje zbira dva cela i dva realna broja. U glavnom programu izvršiti poziv metode za sabiranje dva cela broja 3 i 4 i dva realna broja 2.3 i 4.5.

public class Zadatak4b {

	public static int ceoBroj(int x, int y) {
		return x + y;
	}

	public static double realanBroj(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		double a = 2.3;
		double b = 4.5;
		System.out.println("Zbir dva cela broja 3 i 4 iznosi " + ceoBroj(x, y));
		System.out.println("Zbir dva realna broja 2.3 i 4.5 iznosi " + realanBroj(a, b));
	}

}
