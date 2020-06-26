package ejerciciosTema3Tablas;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		int tabla[] = new int[2];
		for(i=1, tabla[0] = -1; i!=0; i=sc.nextInt()) {
			if(i>0) {
				tabla[0] = tabla[0] + 1;
			} else if(i<0) {
				tabla[1] = tabla[1] + 1;
			}
		}
		System.out.print(tabla[0] + " " + tabla[1]);		
		sc.close();
	}

}
