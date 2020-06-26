package ejerciciosTema2;

import java.util.Scanner;

public class Descuentos
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme el código del articulo");
		String codigo = sc.next();
		System.out.println("Deme el precio del articulo");
		int precio = sc.nextInt();
		System.out.println("Deme las unidades vendidas");
		int unidades = sc.nextInt();
		if(unidades>100) {
			System.out.println("Codigo: " + codigo + " - A pagar: " + precio*unidades + "€ - Descuento aplicado: 40% // " + precio*.4*unidades + "€ - Total a pagar: " + precio*.6*unidades + "€");
		} else if(unidades>25) {
			System.out.println("Codigo: " + codigo + " - A pagar: " + precio*unidades + "€ - Descuento aplicado: 25% // " + precio*.25*unidades + "€ - Total a pagar: " + precio*.75*unidades + "€");
		} else if(unidades>10) {
			System.out.println("Codigo: " + codigo + " - A pagar: " + precio*unidades + "€ - Descuento aplicado: 10% // " + precio*.1*unidades + "€ - Total a pagar: " + precio*.9*unidades + "€");
		} else {
			System.out.println("Codigo: " + codigo + " - A pagar: " + precio*unidades + "€ - Descuento aplicado: 0% // " + 0 + "€ - Total a pagar: " + precio*unidades + "€");
		}
		sc.close();
	}

}
