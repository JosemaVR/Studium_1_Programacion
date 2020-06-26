package ejerciciosTema2;

import java.util.Scanner;

public class Operaciones2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número a:");
		int a = sc.nextInt();
		System.out.println("Dame el número b:");
		int b = sc.nextInt();
		
		System.out.println(suma(a,b));
		System.out.println(resta(a,b));
		System.out.println(producto(a,b));
		if(b==0) {
			System.out.println("b no puede ser 0.");
		} else {
			System.out.println(division(a,b));
		}
		sc.close();
	}

	public static String suma(Integer a, Integer b) {
		return "La suma de " + a + " y " + b + " es " + (a+b);
	}
	
	public static String producto(Integer a, Integer b) {
		return "El producto de " + a + " y " + b + " es " + a*b;
	}
	
	public static String resta(Integer a, Integer b) {
		return "La resta de " + a + " y " + b + " es " + (a-b);
	}
	
	public static String division(Integer a, Integer b) {
		if (a%b==0) {
			return "La división de " + a + " y " + b + " es " + (a/b);
		} else {
			return b + " no divide a " + a;
		}
	}
}
