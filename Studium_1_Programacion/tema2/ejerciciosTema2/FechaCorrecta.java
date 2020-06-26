package ejerciciosTema2;

import java.time.LocalDate;
import java.util.Scanner;

public class FechaCorrecta
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el día");
		int dia = sc.nextInt();
		System.out.println("Indique el mes");
		int mes = sc.nextInt();
		System.out.println("Indique el año");
		int anyo = sc.nextInt();
		if(mes<1 || mes>12) {
			System.out.println("Mes no puede ser mayor que 12 o menor que 0 en ningún caso.");
		} else {
			switch(mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(dia>31 || dia<1) {
						System.out.println("Dia no puede ser mayor que 31 o menor que 0 en ningún caso.");
					} else {
						System.out.println(fecha(anyo, mes, dia));
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(dia>30 || dia<1) {
						System.out.println("Dia no puede ser menor que 0 en ningún caso, ni mayor que 30 en los meses " 
							+ Meses.mes(4) + ", " + Meses.mes(6) + ", " + Meses.mes(9) + " y " + Meses.mes(11));
					} else {
						System.out.println(fecha(anyo, mes, dia));
					}
					break;
				case 2:
					if(dia==29 && ((anyo%4==0 && anyo%100!=0) || anyo%400==0)){
						System.out.println(fecha(anyo, mes, dia));
					} else if(dia>28 || dia<1) {
						System.out.println("Dia no puede ser mayor que 28 o menor que 0 en el mes de " + Meses.mes(2));
					} else {
						System.out.println(fecha(anyo, mes, dia));
					}
					break;
				default:
					System.out.println("Motivo desconocido");
					break;
			}
			sc.close();
		}
	}

	private static LocalDate fecha(Integer anyo, Integer mes, Integer dia)
	{
		return LocalDate.of(anyo, mes, dia);
	}
}