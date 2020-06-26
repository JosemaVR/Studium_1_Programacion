package ejerciciosTema2;

import java.util.Scanner;

public class PasarAMayusculas
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una letra:");
		String a = sc.next();
		char x = a.charAt(0);
		do {
			if(a.length()>1) {
				System.out.println("Sólo 1 letra.");
				System.out.println("Dame una letra:");
				a = sc.next();
				x = a.charAt(0);
			} else if (x == Character.toUpperCase(x)){
				System.out.println("La letra debe ser minúscula.");
				System.out.println("Dame una letra:");
				a = sc.next();
				x = a.charAt(0);
			} else {
				System.out.println("NOTA: carácter '" + x + "' = '" + Character.toUpperCase(x) + "'");	
				System.out.println("Dame una letra:");
				a = sc.next();
				x = a.charAt(0);
			}
		}	
		while(x != '*');
		System.out.println("FIN");
		sc.close();
	}

}
