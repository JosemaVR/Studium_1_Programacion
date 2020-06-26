package ejerciciosTema3Tablas;

import java.util.Scanner;

public class LetraPorPosicion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Character cadena[][] = new Character[3][3];
		Integer i, j;

		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.println("Dame una cadena:");
				cadena[i][j] = sc.next().toLowerCase().charAt(0);
			}
		}
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.println(cadena[i][j] + " es la letra nº " + ((int) cadena[i][j]-96));
			}
		}
		
		sc.close();
	}

}
