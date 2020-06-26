package ejerciciosTema3Tablas;

import java.util.Scanner;

public class PosicionMaximo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer tabla[] = new Integer[10];
		int x;
		for(x=0; x<10; x++) {
			System.out.println("Deme un número:");
			tabla[x] = sc.nextInt();
		}
		System.out.println(max(tabla));
		System.out.println(pos(tabla));
		sc.close();
	}

	private static Integer max(Integer[] tabla) {
		int x;
		int y = tabla[0];
		for(x=1; x<tabla.length; x++) {
			if(y<tabla[x]) {
				y = tabla[x];
			}
		}
		return y;
	}
	
	private static String pos(Integer[] tabla) {
		int x;
		String k = "";
		for(x=0; x<tabla.length; x++) {
			if(max(tabla)==tabla[x]) {
				k = k + " " + (x+1);
			}
		}
		return k;
	}
}
