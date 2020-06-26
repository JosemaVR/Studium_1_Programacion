package practica1;

import java.util.Scanner;

public class TablaCadenas {

	public static void main(String[] args) {
		// Apertura de la introducción por telcado
		Scanner sc = new Scanner(System.in);
		// Creamos una tabla vacía de 1 dimensión con un tamaño de 10 cadenas
		String cadena[] = new String[10];
		Integer i;
		// Recorremos la tabla rellenándola con las cadenas que introduzcamos
		for(i=0; i<=9; i++) {
			System.out.println("Dame la cadena nº" +(i+1)+ ":");
			cadena[i] = sc.nextLine();
		}
		// Recorremos la tabla mostrando cada una de las cadenas introducidas
		System.out.println("\n Tabla de cadenas:");
		for(i=0; i<=9; i++) {
			System.out.println(cadena[i]);
		}
		// Cierre de la introducción por teclado
		sc.close();
	}
}