package ejerciciosTema2;

import java.util.Scanner;

public class TiposTriangulos
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el lado 1:");
		int a = sc.nextInt();
		System.out.println("Dame el lado 2:");
		int b = sc.nextInt();
		System.out.println("Dame el lado 3:");
		int c = sc.nextInt();
		
		if(a==b && c==a) {
			System.out.println("Equilatero");
		} else if(a==b || b==c || a==c) {
			System.out.println("Isoceles");
		} else {
			System.out.println("Escaleno");
		}
		
		sc.close();
	}

}
