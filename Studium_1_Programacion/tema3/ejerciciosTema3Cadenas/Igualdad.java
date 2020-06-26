package ejerciciosTema3Cadenas;

import java.util.Scanner;

public class Igualdad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la primera cadena:");
		String c1 = sc.nextLine();
		System.out.println("Dame la segunda cadena");
		String c2 = sc.nextLine();
		if(c1.equals(c2)) {
			System.out.println(c1 + " = " + c2);
		} else {
			System.out.println("No son iguales");
		}
		sc.close();
	}

}
