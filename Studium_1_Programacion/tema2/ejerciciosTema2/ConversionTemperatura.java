package ejerciciosTema2;

import java.util.Scanner;

public class ConversionTemperatura
{

	public static void main(String[] args)
	{
		System.out.println("* MENU *");
		String m1 = "1 - Pasar de Centigrado a Fahrenheit";
		String m2 = "2 - Pasar de Fahrenheit a Centigrado";
		String m3 = "3 - Salir";
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println("Seleccione 1 opci�n");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double k;

		if(x==1) {
			System.out.println("Dame la temperatura:");
			k = sc.nextDouble();
			System.out.println(k + "�C");
			double cf = k*(9./5.) + 32;
			System.out.println(cf + "�F");
		} else if (x==2) {
			System.out.println("Dame la temperatura:");
			k = sc.nextDouble();
			System.out.println(k + "�F");
			double fc = k*(5./9.) - 32;
			System.out.println(fc + "�C");
		} else if (x==3) {
			System.out.println("Saliendo");
		} else {
			System.out.println("Opci�n no v�lida");
		}

		sc.close();
	}

}
