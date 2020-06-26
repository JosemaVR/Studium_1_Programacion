package ejerciciosTema2;

import java.time.LocalDate;
import java.util.Scanner;

public class A2030
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su nombre:");
		String nombre = sc.next();
		System.out.println("Indique su fecha de nacimiento:");
		System.out.println("D�a:");
		Integer dia = sc.nextInt();
		System.out.println("Mes:");
		Integer mes = sc.nextInt();
		System.out.println("A�o:");
		Integer anyo = sc.nextInt();		
		System.out.println("D�a a elegir:");
		Integer dia2 = sc.nextInt();
		System.out.println("Mes a elegir:");
		Integer mes2 = sc.nextInt();
		System.out.println("A�o a elegir:");
		Integer anyo2 = sc.nextInt();
		
		LocalDate fechaNac = LocalDate.of(anyo, mes, dia);
		int res = (fechaNac).until(LocalDate.of(anyo2,mes2,dia2)).getYears();
		if((LocalDate.of(anyo2,mes2,dia2)).isAfter(LocalDate.now())) {
			System.out.println("Hola " + nombre + ", el " + dia2 + " de " + Meses.mes(mes2) + " del " + anyo2 + " tendr�s " + res + " a�os.");
		} else if((fechaNac).isAfter(LocalDate.of(anyo2,mes2,dia2))) {
			System.out.println("La fecha elegida es anterior al nacimiento");
		} else if((LocalDate.of(anyo2,mes2,dia2)).isBefore(LocalDate.now())) {
			System.out.println("Hola " + nombre + ", el " + dia2 + " de " + Meses.mes(mes2) + " del " + anyo2 + " ten�as " + res + " a�os.");
		} else if((fechaNac).isAfter(LocalDate.of(anyo2,mes2,dia2))) {
			System.out.println("La fecha elegida es anterior al nacimiento");
		} else {
			System.out.println("Hola " + nombre + ", el " + dia2 + " de " + Meses.mes(mes2) + " del " + anyo2 + " tienes " + res + " a�os.");
		}
		sc.close();
	}

}
