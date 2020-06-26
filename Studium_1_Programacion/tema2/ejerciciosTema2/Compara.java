package ejerciciosTema2;

import java.util.Scanner;

public class Compara
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número a:");
		int a = sc.nextInt();
		System.out.println("Dame el número b:");
		int b = sc.nextInt();
		if(a==b) {
			System.out.println("Los números son iguales");
		} else if(a>b) {
			System.out.println(a + " es mayor que " + b);
		} else {
			System.out.println(b + " es mayor que " + a);
		}
		sc.close();		
	}

}
