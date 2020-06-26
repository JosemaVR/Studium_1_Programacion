package ejerciciosTema2;

import java.util.Scanner;

public class Multiplo5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número x:");
		int x = sc.nextInt();
		System.out.println("Dame el número y:");
		int y = sc.nextInt();
		int i;
		if(x<=(y-5)) {
			for(i=x; i<=(x+4); i++) {
				System.out.println(i*5);
			}
		} else {
			System.out.println(x + " no es menor que " + y + " en al menos 5 números");
		}
		sc.close();
	}

}
