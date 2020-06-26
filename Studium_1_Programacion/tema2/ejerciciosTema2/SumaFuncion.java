package ejerciciosTema2;

import java.util.Scanner;

public class SumaFuncion
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número a:");
		int a = sc.nextInt();
		System.out.println("Dame el número b:");
		int b = sc.nextInt();
		System.out.println("La suma de los dos numeros es: "+ suma(a, b));
		sc.close();
	}
	
	public static Integer suma(Integer a, Integer b) {
		return a+b;
	}

}
