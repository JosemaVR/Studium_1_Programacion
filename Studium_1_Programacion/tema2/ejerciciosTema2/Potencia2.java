package ejerciciosTema2;

import java.util.Scanner;

public class Potencia2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la base:");
		int base = sc.nextInt();
		System.out.println("Dame el exponente:");
		int exp = sc.nextInt();
		System.out.println(potencia(base, exp));
		sc.close();
	}

	public static String potencia(Integer base, Integer exp) {
		int i = 1;
		int res = 1;
		for(i=1; i<=exp; i++) {
			res = res * base;
		}
		return base + " elevado a " + exp + " es " + res;
	}
}
