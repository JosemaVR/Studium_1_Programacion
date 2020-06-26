package ejerciciosTema3Cadenas;

import java.util.Scanner;

public class Subcadena {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una frase:");
		String cadena = sc.nextLine();
		System.out.println("Dame una posición:");
		Integer posicion = sc.nextInt();
		System.out.println("Dame la longitud:");
		Integer longitud = sc.nextInt();
		System.out.println("Reorganizando");
		System.out.println(subcadena(cadena, posicion, longitud));

		sc.close();
	}

	public static String subcadena(String cadena, Integer posicion, Integer longitud) {
		String subcadena = "";
		Integer i;
		for(i=posicion; i<(longitud+posicion); i++) {
			if(cadena.length()>i) {
				subcadena = subcadena + cadena.charAt(i-1);
			} else {
				subcadena = subcadena + cadena.charAt(i-cadena.length()-1);
			}
				
		}
		return subcadena;
	}
}
