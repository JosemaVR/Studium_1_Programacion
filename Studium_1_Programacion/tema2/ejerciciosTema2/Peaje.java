package ejerciciosTema2;

import java.util.Scanner;

public class Peaje
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Tipo de veh�culo:");
		System.out.println("1 - Moto");
		System.out.println("2 - Coche");
		System.out.println("3 - Cami�n");
		System.out.println("4 - Autobus");
		System.out.println("Indique el n�mero:");
		int x = sc.nextInt();
		int km, tn;
		switch(x){
			case 1:
				System.out.println(3.2 + "�");
				break;
			case 2:
				System.out.println("N�mero de km recorridos:");
				km = sc.nextInt();
				System.out.println(.1*km + "�");
				break;
			case 3:
				System.out.println("N�mero de km recorridos:");
				km = sc.nextInt();
				System.out.println("N�mero de toneladas transportadas:");
				tn = sc.nextInt();
				System.out.println((tn+km)*.1 + "�");
				break;
			case 4:
				System.out.println("N�mero de km recorridos:");
				km = sc.nextInt();
				System.out.println(.2*km + "�");
				break;
			default:
				System.out.println("Elija un n�mero v�lido");
				break;
		}
		
		sc.close();
		
	}

}
