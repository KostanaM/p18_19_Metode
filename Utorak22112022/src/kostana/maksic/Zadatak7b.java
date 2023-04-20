package kostana.maksic;
//Sastaviti algoritam i napisati metodu pod imenom sila za izračunavanje sile privlačenja između dve materijalne tačke      i      na rastojanju r, datu formulom

//Izračunati silu F za mase i rastojanje date na ulazu                                                         . 
import java.util.Scanner;

public class Zadatak7b {
	final static double Gama = 6.67 * Math.pow(10, -11);

	static double sila(double m1, double m2, double r) {
		return Gama * m1 * m2 / (r * r);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double m1, m2, r;
		System.out.println("Unesite tačku m1:  ");
		m1 = sc.nextDouble();
		System.out.println("Unesite tačku m2:  ");
		m2 = sc.nextDouble();
		System.out.println("Unesite rastojanje:  ");
		r = sc.nextDouble();

		System.out.println("Sila privlačenja između tačaka " + m1 + " i " + m2 + " na rastojanju " + r + " iznosi "
				+ sila(m1, m2, r));
		sc.close();
	}

}
