package ejerciciosTema2;

import java.util.Scanner;

public class Ordena3Numeros
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
		if(a>=b && b>=c) {
			System.out.println(a + ">" + b + ">" + c);
		} else if (a>=c && c>=b) {
			System.out.println(a + ">" + c + ">" + b);
		} else if (b>=a && a>=c) {
			System.out.println(b + ">" + a + ">" + c);
		} else if (b>=c && c>=a) {
			System.out.println(b + ">" + c + ">" + a);
		} else if (c>=a && a>=b) {
			System.out.println(c + ">" + a + ">" + b);
		} else {
			System.out.println(c + ">" + b + ">" + a);
		}
		sc.close();
	}

}
