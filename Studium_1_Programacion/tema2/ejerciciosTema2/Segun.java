package ejerciciosTema2;

import java.util.Scanner;

public class Segun
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número a:");
		int a = sc.nextInt();
		System.out.println("Dame el número a:");
		int b = sc.nextInt();
		if(a<b) {
			System.out.println("La suma de a y b es: " + (a+b));
		} else {
			System.out.println("El producto de a y b es: " + (a*b));
		}
		sc.close();
	}

}
