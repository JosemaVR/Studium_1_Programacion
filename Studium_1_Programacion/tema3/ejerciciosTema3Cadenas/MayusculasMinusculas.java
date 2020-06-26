package ejerciciosTema3Cadenas;

import java.util.Scanner;

public class MayusculasMinusculas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Deme una cadena:");
		String c = sc.nextLine();
		System.out.println(c);		
		System.out.println(c.toUpperCase());		
		System.out.println(c.toLowerCase());
		sc.close();
	}

}
