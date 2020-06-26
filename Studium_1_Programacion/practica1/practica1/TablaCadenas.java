package practica1;

import java.util.Scanner;

public class TablaCadenas {

	public static void main(String[] args) {
		// Apertura de la introducci�n por telcado
		Scanner sc = new Scanner(System.in);
		// Creamos una tabla vac�a de 1 dimensi�n con un tama�o de 10 cadenas
		String cadena[] = new String[10];
		Integer i;
		// Recorremos la tabla rellen�ndola con las cadenas que introduzcamos
		for(i=0; i<=9; i++) {
			System.out.println("Dame la cadena n�" +(i+1)+ ":");
			cadena[i] = sc.nextLine();
		}
		// Recorremos la tabla mostrando cada una de las cadenas introducidas
		System.out.println("\n Tabla de cadenas:");
		for(i=0; i<=9; i++) {
			System.out.println(cadena[i]);
		}
		// Cierre de la introducci�n por teclado
		sc.close();
	}
}