package ejerciciosTema3Tablas;

import java.util.Scanner;

public class SumaFilasColumnas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Integer i, j;
		Integer sumaFilas[] = new Integer[3];
		Integer sumaColumnas[] = new Integer[3];
		Integer matriz[][] = new Integer[3][3];
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.println("Posicion (" + i + ", " + j + ")");
				matriz[i][j] = sc.nextInt();
			}
		}
		for(i=0; i<3; i++) {
			sumaFilas[i] = 0;
			sumaColumnas[i] = 0;
		}
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				sumaFilas[i] = sumaFilas[i] + matriz[i][j];
			}
		}
		
		for(i=0; i<3; i++) {
			System.out.println("Fila " + (i+1) + " = " + sumaFilas[i]);
		}
		
		for(j=0; j<3; j++) {
			for(i=0; i<3; i++) {
				sumaColumnas[j] = sumaColumnas[j] + matriz[i][j];
			}
		}
		
		for(i=0; i<3; i++) {
			System.out.println("Columna " + (i+1) + " = " + sumaColumnas[i]);
		}
		
		sc.close();
	}

}
