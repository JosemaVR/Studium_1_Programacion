package ejerciciosTema2;

import java.util.Scanner;

public class Suma
{

	public static void main(String[] args)
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el numero 1:");
		a = sc.nextInt();
		System.out.println("Dame el numero 2:");
		b = sc.nextInt();
		System.out.println("La suma es: " + (a+b));	
		sc.close();
	}

}
