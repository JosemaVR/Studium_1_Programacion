package ejerciciosTema2;

import java.util.Scanner;

public class Polinomio2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la base");
		int base = sc.nextInt();
		System.out.println("Dame el exp");
		int exp = sc.nextInt();
		System.out.println(potencia(base, exp));
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
