package ejerciciosTema2;

import java.util.Scanner;

public class Veces
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número:");
		int num = sc.nextInt();
		System.out.println("Dame el número de veces:");
		int veces = sc.nextInt();
		int i = 1;
		for(i=1; i<=veces; i++) {
			System.out.println(num);
		}
		sc.close();
	}

}
