package ejerciciosTema3Taller;

import java.util.Scanner;

public class OrdenarHundimiento {

	public static void main(String[] args) {

		Integer tabla[] = new Integer[10];
		Integer i, j, aux;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<=9; i++) {
			System.out.println("Dame un numero");
			tabla[i] = sc.nextInt();
		}
		
		System.out.println("Tabla Sin Ordenar");
		for(i=0; i<=9; i++) {
			System.out.println(tabla[i]);
		}
		
		for(i=1; i<=9; i++) {
			for(j=9; j>=i; j--) {
				if(tabla[j-1] > tabla[j]) {
					aux = tabla[j];
					tabla[j] = tabla[j-1];
					tabla[j-1] = aux;
				}
			}
		}

		System.out.println("Tabla Ordenada");
		for(i=0; i<=9; i++) {
			System.out.println(tabla[i]);
		}
		
		sc.close();
	}

}
