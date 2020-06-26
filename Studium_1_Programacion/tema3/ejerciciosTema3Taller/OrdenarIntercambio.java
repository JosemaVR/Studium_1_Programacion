package ejerciciosTema3Taller;

import java.util.Scanner;

public class OrdenarIntercambio {

	public static void main(String[] args) {

		Integer array[] = new Integer[10];
		Integer i, j, aux;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<9; i++) {
			System.out.println("Dame un número");
			array[i] = sc.nextInt();
		}
		
		System.out.println("La tabla sin ordenar");
		for(i=0; i<9; i++) {
			System.out.println(array[i]);
		}
		
		for(i=0; i<8; i++) {
			for (j=i+1; j<9; j++) {
				// modificar mayor o menor para alterar el orden
				if(array[i] < array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		
		System.out.println("La tabla ordenada:");
		for(j=0; j<9; j++) {
			System.out.println(array[j]);
		}
		sc.close();
	}

}
