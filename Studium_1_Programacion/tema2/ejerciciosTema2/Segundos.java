package ejerciciosTema2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class Segundos
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su fecha de nacimiento:");
		System.out.println("Día:");
		int dia = sc.nextInt();
		System.out.println("Mes:");
		int mes = sc.nextInt();
		System.out.println("Año:");
		int anyo = sc.nextInt();
		System.out.println("Hora Nacimiento:");
		int hora = sc.nextInt();
		System.out.println("Minutos Nacimiento:");
		int min = sc.nextInt();		
		calcularSegundos(anyo, mes, dia, hora, min);
		sc.close();
	}
	
	public static void calcularSegundos(int anyo, int mes, int dia, int hora, int min) {
		LocalDate fechaNac = LocalDate.of(anyo, mes, dia);
		long res1 = LocalDate.now().getLong(ChronoField.EPOCH_DAY);
		long res2 = fechaNac.getLong(ChronoField.EPOCH_DAY);
		long primerDia = LocalTime.now().getHour()*3600 + LocalTime.now().getMinute()*60 + LocalTime.now().getSecond();
		long res = (res1 - res2)*24*3600 + primerDia - hora*3600 - min*60;
		System.out.println("Has vivido " + res + " segundos.");
	}

}
