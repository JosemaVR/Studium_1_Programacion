package ejerciciosTema2;

import java.util.Scanner;

public class Polinomio
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame x");
		int x = sc.nextInt();
		System.out.println(3*Potencia.potencia(x,5)-5*Potencia.potencia(x,3)+2*x-7);
		sc.close();
	}

}
