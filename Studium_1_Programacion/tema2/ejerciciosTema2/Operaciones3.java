package ejerciciosTema2;

import java.util.Scanner;

public class Operaciones3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el n�mero a:");
		int a = sc.nextInt();
		System.out.println("Dame el n�mero b:");
		int b = sc.nextInt();
		System.out.println("Dame el n�mero c:");
		int c = sc.nextInt();
		
		System.out.println(suma(c,suma(a,b)));
		System.out.println(producto(c, producto(a,b)));
		System.out.println(media(a,b,c));

		sc.close();
	}

	public static Integer suma(Integer a, Integer b) {
		return a+b;
	}
	
	public static Integer producto(Integer a, Integer b) {
		return a*b;
	}
	
	public static Double media(Integer a, Integer b, Integer c) {
		return (double) ((suma(c, suma(a,b)))/3);
	}

}
