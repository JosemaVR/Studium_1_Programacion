package ejerciciosTema3Cadenas;

import java.util.Scanner;

public class Subcadena2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una frase:");
		String cadena = sc.nextLine();
		System.out.println("Dame una posición:");
		Integer posicion = sc.nextInt();
		System.out.println("Reorganizando");
		System.out.println(subcadena(cadena, posicion));

		sc.close();
	}

	public static String subcadena(String cadena, Integer posicion) {
		String subcadena = "";
		Integer i;
		for(i=0; i<posicion; i++) {
			subcadena = subcadena + cadena.charAt(cadena.length()-posicion+i);	
		}
		return subcadena;
	}
}
