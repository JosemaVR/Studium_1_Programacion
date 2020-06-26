package ejerciciosTema3Tablas;

import java.util.Scanner;

public class Cuadrados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número:");
		int k = sc.nextInt();
		int i;
		int tabla[] = new int[10];
		for(i=0; i<10; i++) {
			tabla[i] = (k+i+1)*(k+i+1);
		}
		for(i=0; i<10; i++) {
			System.out.print(tabla[i] + " ");
		}
		sc.close();
	}
}