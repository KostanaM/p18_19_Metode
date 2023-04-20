package kostana.maksic;

//Napisati metodu za izračunavanje kvadrata celog broja. U glavnom programu pozvati ovu metodu sa parametrom 10.

public class Zadatak1b {

	static int kvadratBroja(int x) {
		return x * x;
	}

	public static void main(String[] args) {
		int rezultat = Zadatak1b.kvadratBroja(10);
		System.out.println("Kvadrat celog broja 10 je " + rezultat);
	}

}
