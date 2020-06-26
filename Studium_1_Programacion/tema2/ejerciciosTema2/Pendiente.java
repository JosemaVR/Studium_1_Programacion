package ejerciciosTema2;

import java.util.Scanner;

public class Pendiente
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame x1:");
		int x1 = sc.nextInt();
		System.out.println("Dame y1:");
		int y1 = sc.nextInt();
		System.out.println("Dame x2:");
		int x2 = sc.nextInt();
		System.out.println("Dame y2:");
		int y2 = sc.nextInt();
		calcularPendiente(x1, y1, x2, y2);
		sc.close();
	}
	
	public static void calcularPendiente(Integer x1, Integer y1, Integer x2, Integer y2) {
		System.out.println("La pendiente entre (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ") es " + (double) (y2-y1)/(x2-x1));
	}

}
