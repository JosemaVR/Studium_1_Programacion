package ejerciciosTema2;

import java.util.Scanner;

public class Potencia
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el n�mero a:");
		int base = sc.nextInt();
		System.out.println("Dame el n�mero b:");
		int exp = sc.nextInt();
		System.out.println("El n�mero " + base + " elevado a " + exp + " es " + potencia(base, exp));
		sc.close();
	}

	public static Integer potencia(Integer base, Integer exp) {
		int i;
		int res = 1;
		for(i=1; i<=exp; i++) {
			res = res*base;
		}
		return res;	
	}
}
