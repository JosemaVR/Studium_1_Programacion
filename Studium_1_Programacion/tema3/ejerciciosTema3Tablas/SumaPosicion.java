package ejerciciosTema3Tablas;

import java.util.Scanner;

public class SumaPosicion {

	public static void main(String[] args) {

		int x = 10;
		int y = 10;
		int tabla[][] = new int[x][y];
		int i, j;
		Scanner teclado = new Scanner(System.in);
		for(i=0;i<x;i++) { 
			for(j=0;j<y;j++) { 
				tabla[i][j] = i+j; 
			} 
		}
		for(i=0;i<x;i++) { 
			for(j=0;j<y;j++) { 
				System.out.println("Tabla["+i+"]["+j+"]="+tabla[i][j]); 
			} 
		} 
		teclado.close();
	}
}
