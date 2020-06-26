package ejerciciosTema3Cadenas;

import java.util.Scanner;

public class Nombres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Deme un nombre:");
		String c1 = sc.next();
		System.out.println("Deme un nombre:");
		String c2 = sc.next();
		System.out.println("Deme un nombre:");
		String c3 = sc.next();
		System.out.println("Deme un nombre:");
		String c4 = sc.next();
		System.out.println("Deme un nombre:");
		String c5 = sc.next();
		System.out.println(String.format("Las cadenas son '%s', '%s', '%s', '%s' y '%s'", c1, c2, c3, c4, c5));
		sc.close();
	}

}
