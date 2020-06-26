package ejerciciosTema2;

import java.util.Scanner;

public class Expresion
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número a:");
		int a = sc.nextInt();
		System.out.println("Dame el número b:");
		int b = sc.nextInt();
		System.out.println("Dame el número c:");
		int c = sc.nextInt();
		System.out.println(expresion(a, b, c));
		sc.close();
	}
	
	public static Double expresion(Integer a, Integer b, Integer c) {
		Double b1 = (double) b;
		Double a1 = (double) a;
		Double c1 = (double) c;
		return ((b1*b1)-(4*a1*c1))/(2*a1);
	}

}
