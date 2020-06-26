package ejerciciosTema3Taller;

import java.util.Scanner;

public class OrdenarSeleccion {

	public static void main(String[] args) {

		Integer tabla[] = new Integer[10];
		Integer i, j, indice_menor, aux;
		
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
			indice_menor = i;
			for(j=i+1; j<9; j++) {
				// modificar mayor o menor para modificar el orden
				if(tabla[j] < tabla[indice_menor]) {
					indice_menor = j;
				}
			}
			aux = tabla[i];
			tabla[i] = tabla[indice_menor];
			tabla[indice_menor] = aux;
		}
		
		System.out.println("Lista ordenada");
		for(i=0; i<9; i++) {
			System.out.println(tabla[i]);
		}
		sc.close();
	}
}