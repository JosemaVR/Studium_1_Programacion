package ejerciciosTema3Cadenas;

import java.util.Scanner;

public class BuscarPosicion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Deme una cadena:");
		String c = sc.nextLine();
		System.out.println("Deme la letra a buscar:");
		char a = sc.next().charAt(0);
		if((c.indexOf(a)+1)==0) {
			System.out.println("No aparece la letra");		
		} else {
			System.out.println("Posicion " + (c.indexOf(a)+1));
		}
		sc.close();
	}
}