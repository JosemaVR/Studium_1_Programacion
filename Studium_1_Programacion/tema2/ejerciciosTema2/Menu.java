package ejerciciosTema2;

import java.util.Scanner;

public class Menu
{

	public static void main(String[] args)
	{
		System.out.println("* MENU *");
		String m1 = "1 - Abrir";
		String m2 = "2 - Cerrar";
		String m3 = "3 - Modificar";
		String m4 = "4 - Salir";
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println("Seleccione 1 opción");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch(x) {
			case 1:
				System.out.println(m1);
				break;
			case 2:
				System.out.println(m2);
				break;
			case 3:
				System.out.println(m3);
				break;
			case 4:
				System.out.println(m4);
				break;
			default:
				System.out.println("Debe elegir una opción válida");
				break;
		}
		sc.close();
	}

}
