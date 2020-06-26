package ejerciciosTema2;

import java.util.Scanner;

public class Euros
{

	final static Double peseta = 166.39;
	
	public static void main(String[] args)
	{
		{
			System.out.println("* MENU *");
			String m1 = "1 - Pasar de Pesetas a Euros";
			String m2 = "2 - Pasar de Euros a Pesetas";
			String m3 = "3 - Salir";
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
			System.out.println("Seleccione 1 opción");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			double y;
			switch(x) {
				case 1:
					System.out.println("Cantidad:");
					y = sc.nextDouble();
					System.out.println(pesetasAEuros(y));
					break;
				case 2:
					System.out.println("Cantidad:");
					y = sc.nextDouble();
					System.out.println(eurosAPesetas(y));
					break;
				case 3:
					System.out.println("Saliendo");
					break;
				default:
					System.out.println("Debe elegir una opción válida");
					break;
			}
			sc.close();
		}
	}
	
	public static Double pesetasAEuros(Double y) {
		return y/peseta;
	}
	
	public static Double eurosAPesetas(Double y) {
		return y*peseta;
	}
}
