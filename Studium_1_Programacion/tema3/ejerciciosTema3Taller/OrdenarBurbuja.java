package ejerciciosTema3Taller;

import java.util.Scanner;

public class OrdenarBurbuja {

	public static void main(String[] args) {

		Integer tabla[] = new Integer[10];
		Integer i, j, aux;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<9; i++) {
			System.out.println("Dame un numero");
			tabla[i] = sc.nextInt();
		}
		
		System.out.println("Tabla Sin Ordenar");
		for(i=0; i<9; i++) {
			System.out.println(tabla[i]);
		}
		
		for(i=0; i<8; i++) {
			for(j=0; j<(8-i); j++) {
				if(tabla[j] > tabla[j+1]) {
					aux = tabla[j];
					tabla[j] = tabla[j+1];
					tabla[j+1] = aux;
				}
			}
		}

		System.out.println("Tabla Ordenada");
		for(i=0; i<9; i++) {
			System.out.println(tabla[i]);
		}
		
		sc.close();
	}
}