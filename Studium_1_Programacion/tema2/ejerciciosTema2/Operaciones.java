package ejerciciosTema2;

import java.util.Scanner;

public class Operaciones
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número a:");
		int a = sc.nextInt();
		System.out.println("Dame el número b:");
		int b = sc.nextInt();

		System.out.println("La suma de " + a + " y " + b + " es " + (a+b));
		System.out.println("La resta de " + a + " y " + b + " es " + (a-b));
		System.out.println("El producto de " + a + " y " + b + " es " + (a*b));
		if (a%b==0) {
			System.out.println("La división de " + a + " y " + b + " es " + (a/b));
		} else {
			System.out.println(b + " no divide a " + a);
		}
		
		sc.close();
	}

}
