package ejerciciosTema2;

import java.util.Scanner;

public class SaltoN
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el salto");
		int salto = sc.nextInt();
		int i;
		if (salto>0 && salto<=1000) {
			for(i=0; i<=1000; i= i+salto) {
				System.out.println(i);
			}
		} else {
			System.out.println("El salto no puede ser menor que 0 ni mayor que 1000.");
		}
			
		sc.close();
	}

}
