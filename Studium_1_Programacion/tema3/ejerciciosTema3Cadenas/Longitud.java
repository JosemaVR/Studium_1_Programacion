package ejerciciosTema3Cadenas;

import java.util.Scanner;

public class Longitud {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme una cadena:");
		String c = sc.nextLine();
		System.out.println(longitud(c));
		sc.close();
	}

	public static String longitud(String c) {
		Integer a = c.length();
		Integer b = c.replaceAll(" ", "").length();
		return a + ", " + b;
	}
}