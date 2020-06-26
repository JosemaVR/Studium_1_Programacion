package ejerciciosTema2;

import java.util.Scanner;

public class ConversionRadianes
{

	public static void main(String[] args)
	{
		System.out.println("* MENU *");
		String m1 = "1 - Radianes a Grados";
		String m2 = "2 - Grados a Radianes";
		String m3 = "3 - Salir";
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println("Seleccione 1 opción");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch(x) {
			case 1:
				System.out.println("Dame el radian");
				double rad = sc.nextDouble();
				System.out.println(radAGrados(rad) + "º");
				break;
			case 2:
				System.out.println("Dame el angulo");
				double gra = sc.nextDouble();
				System.out.println(gradosARad(gra) + " radianes");
				break;
			case 3:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Elija una opción válida");
				break;
		}
		sc.close();
	}
	
	public static Double radAGrados(Double rad) {
		return rad*180;
	}
	
	public static Double gradosARad(Double gra) {
		return gra/180;
	}

}
