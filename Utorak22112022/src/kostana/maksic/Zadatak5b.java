package kostana.maksic;
//Napisati metodu za rekurzivno izračunavanje faktorijela broja.

public class Zadatak5b {

	static int faktorijel(int n) {
		if (n == 0)
			return 1;
		else
			return faktorijel(n-1)*n;
	}

	public static void main(String[] args) {
		System.out.println("Faktorijel broja 5 je "+faktorijel(5));

	}

}
