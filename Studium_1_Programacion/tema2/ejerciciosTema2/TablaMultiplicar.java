package ejerciciosTema2;

import java.util.Scanner;

public class TablaMultiplicar
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número:");
		int a = sc.nextInt();
		System.out.println("La tabla de multiplicar del " + a + " es:");
		int i = 0;
		for(i=0; i<=10; i++) {
			System.out.println(a + "x" + i + " = " + (a*i));
		}
		sc.close();
	}

}
