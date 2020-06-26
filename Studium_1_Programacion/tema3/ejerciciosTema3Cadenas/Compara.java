package ejerciciosTema3Cadenas;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la primera cadena:");
		String c1 = sc.next();
		System.out.println("Dame la segunda cadena");
		String c2 = sc.next();
		if(c1.length() > c2.length()) {
			System.out.println("La primera cadena es mayor");
		} else if (c2.length() > c1.length()) {
			System.out.println("La segunda cadena es mayor");
		} else {
			System.out.println("Las cadnas miden lo mismo");
		}
		sc.close();
	}

}
