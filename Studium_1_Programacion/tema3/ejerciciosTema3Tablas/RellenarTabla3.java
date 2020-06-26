package ejerciciosTema3Tablas;

import java.util.Scanner;

public class RellenarTabla3 {

	public static void main(String[] args) {

		int tabla[] = new int[3];
		int i;
		Scanner sc = new Scanner(System.in);
		for(i=0; i<=2; i++) {
			tabla[i] = sc.nextInt();
		}
		for(i=2; i>=0; i--) {
			System.out.println(tabla[i]);
		}
		sc.close();

	}

}
