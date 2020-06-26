package ejerciciosTema2;

import java.util.Scanner;

public class Meses
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número del mes");
		int a = sc.nextInt();
		System.out.println("El mes equivalente a " + a + " es " + mes(a));
		sc.close();
	}

	public static String mes(Integer a) {
		String res;
		switch(a) {
		case 1:
			res = "Enero";
			break;
		case 2:
			res = "Febrero";
			break;
		case 3:
			res = "Marzo";
			break;
		case 4:
			res = "Abril";
			break;
		case 5:
			res = "Mayo";
			break;
		case 6:
			res = "Junio";
			break;
		case 7:
			res = "Julio";
			break;
		case 8:
			res = "Agosto";
			break;
		case 9:
			res = "Septiembre";
			break;
		case 10:
			res = "Octubre";
			break;
		case 11:
			res = "Noviembre";
			break;
		case 12:
			res = "Diciembre";
			break;
		default:
			res = "no existe";
			break;
		}
		return res;
	}
}
