package ejerciciosTema3Tablas;

import java.io.IOException;
import java.util.Scanner; 

public class Tabla1Dimension { 
	
	public static void main(String[] args) throws IOException { 
		
		int tabla[] = new int[10]; 
		int i; 
		Scanner teclado = new Scanner(System.in); 
		
		// Recorrido para rellenar la tabla 
		
		for(i=0;i<10;i++) { 
			System.out.println("Ingrese el valor de la posición "+i+":"); 
			tabla[i] = teclado.nextInt(); 
		} 
		
		// Recorrido para mostrar los valores de la tabla 
		for(i=0;i<10;i++) { 
			System.out.println("Tabla["+i+"]="+tabla[i]);
		} 
		teclado.close(); 
	}
}