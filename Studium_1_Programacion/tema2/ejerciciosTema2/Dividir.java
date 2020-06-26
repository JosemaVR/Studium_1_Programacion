package ejerciciosTema2;

import java.util.Scanner;

public class Dividir
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el numerador:");
		int a = sc.nextInt();
		System.out.println("Dame el denominador:");
		int b = sc.nextInt();
		System.out.println("Resultado:");
		System.out.println(dividir(a, b));
		sc.close();
	}
	
	public static Double dividir(Integer a, Integer b) {
		return (a.doubleValue()/b.doubleValue());
	}
}
