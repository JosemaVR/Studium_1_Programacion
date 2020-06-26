package ejerciciosTema2;

import java.util.Scanner;

public class ParImpar
{

	public static void main(String[] args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el numero 1:");
		a = sc.nextInt();
		if (a%2 == 0) 
		{
			System.out.println(a + " es par");	
		} else {
			System.out.println(a + " es impar");
		}
		sc.close();
	}

}
