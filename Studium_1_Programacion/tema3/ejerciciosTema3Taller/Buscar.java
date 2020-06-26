package ejerciciosTema3Taller;

import java.util.Scanner;

public class Buscar {

	public static void main(String[] args) {

		Integer tabla[] = new Integer[10];
		Integer i, k;
		Boolean encontrado = false;
		Scanner sc = new Scanner(System.in);
		for(i=0; i<=9; i++) {
			System.out.println("Dame un número");
			tabla[i] = sc.nextInt();
		}
		
		for(i=0; i<=9; i++) {
			System.out.println(tabla[i]);
		}
		
		System.out.println("Dame el número a buscar");
		k = sc.nextInt();
		for(i=0; i<=9; i++) {
			if(k==tabla[i]) {
				encontrado = true;
				System.out.println("Posicion " + (i+1) + " es " + encontrado + " para " + k);
			} 
		}
		sc.close();
	}
}