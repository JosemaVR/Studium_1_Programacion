package ejerciciosTema3Tablas;

import java.util.Scanner;

public class Antisimetrica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer i, j;
		Boolean esAntisimetrica = true;
		Double matriz[][] = new Double[3][3];
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.println("Posicion (" + i + ", " + j + ")");
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				if(matriz[i][j] != -matriz[j][i]) {
					esAntisimetrica = false;
				}
			}
		}
		
		if(esAntisimetrica == true) {
			System.out.println("Es antisimetrica");
		} else {
			System.out.println("NO es antisimetrica");
		}
		sc.close();
	}

}
