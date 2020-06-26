package ejerciciosTema3Taller;

import java.util.Scanner;

public class OrdenarInsercion {

	public static void main(String[] args) {

		Integer tabla[] = new Integer[10];
		Integer i, j, aux;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<9; i++) {
			System.out.println("Dame un número");
			tabla[i] = sc.nextInt();
		}
		
		System.out.println("Lista desordenada");
		for(i=0; i<9; i++) {
			System.out.println(tabla[i]);
		}
		
		for(i=0; i<8; i++) {
			for(j = i, aux = tabla[i]; (j > 0) && (aux < tabla[j-1]); j--) {
				tabla[j] = tabla[j-1];
			}
			tabla[j] = aux;
		}
		
		System.out.println("Lista ordenada");
		for(i=0; i<9; i++) {
			System.out.println(tabla[i]);
		}
		sc.close();
	}
}