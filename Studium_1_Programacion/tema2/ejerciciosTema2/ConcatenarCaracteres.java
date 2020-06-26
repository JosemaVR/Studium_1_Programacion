package ejerciciosTema2;

import java.util.Scanner;

public class ConcatenarCaracteres
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la primera letra:");
		char a = sc.next().charAt(0);
		System.out.println("Dame la segunda letra:");
		char b = sc.next().charAt(0);
		System.out.println(a + "" + b);
		sc.close();
	}

}
