package ejerciciosTema2;

import java.util.Scanner;

public class Intercambio
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el primer n�mero:");
		int a = sc.nextInt();
		System.out.println("Dame el segundo n�mero:");
		int b = sc.nextInt();
		System.out.println(a + " - " + b);
		int comodin = a;
		a = b;
		b = comodin;
		System.out.println(a + " - " + b);		
		sc.close();
	}

}
