package ejerciciosTema3Tablas;

import java.util.Scanner;

public class DosDimensiones {

	public static void main(String[] args) {

		int tabla[][] = new int[3][4];
		int i, j;
		Scanner teclado = new Scanner(System.in);
		for(i=0;i<3;i++) { 
			for(j=0;j<4;j++) { 
				System.out.println("Ingrese el valor de la posición: ("+i+","+j+")"); 
				tabla[i][j] = teclado.nextInt(); 
			} 
		}
		for(i=0;i<3;i++) { 
			for(j=0;j<4;j++) { 
				System.out.println("Tabla["+i+"]["+j+"]="+tabla[i][j]); 
			} 
		} 
		teclado.close();
	}

}
