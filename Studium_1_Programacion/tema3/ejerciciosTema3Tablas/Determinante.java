package ejerciciosTema3Tablas;

import java.util.Scanner;

public class Determinante {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Integer i, j;
		Double determinante;
		Double matriz[][] = new Double[3][3];
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.println("Posicion (" + i + ", " + j + ")");
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		determinante = matriz[0][0]*matriz[1][1]*matriz[2][2] 
				+ matriz[1][0]*matriz[2][1]*matriz[0][2] 
				+ matriz[2][0]*matriz[0][1]*matriz[1][2] 
				- matriz[0][2]*matriz[1][1]*matriz[2][0] 
				- matriz[0][1]*matriz[1][0]*matriz[2][2] 
				- matriz[0][0]*matriz[1][2]*matriz[2][1];
		
		System.out.println(determinante);
				
		sc.close();
	}

}
