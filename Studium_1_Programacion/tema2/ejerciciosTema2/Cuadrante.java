package ejerciciosTema2;

import java.util.Scanner;

public class Cuadrante
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número x:");
		int x = sc.nextInt();
		System.out.println("Dame el número y:");
		int y = sc.nextInt();
		if(x>=0) {
			if(y>=0) {
				System.out.println("El punto (" + x + "," + y + ") esta en el primer cuadrante.");
			} else {
				System.out.println("El punto (" + x + "," + y + ") esta en el cuarto cuadrante.");
			}
		} else {
			if(y>0) {
				System.out.println("El punto (" + x + "," + y + ") esta en el segundo cuadrante.");
			} else {
				System.out.println("El punto (" + x + "," + y + ") esta en el tercer cuadrante.");
			}
		}
		sc.close();
	}

}
