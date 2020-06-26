package ejerciciosTema3Cadenas;

import java.util.Scanner;

public class Concatena {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la primera cadena:");
		String c1 = sc.nextLine();
		System.out.println("Dame la segunda cadena");
		String c2 = sc.nextLine();
		String c3 = c1 + " " + c2;
		System.out.println(c3);
		sc.close();		
	}

}
