package ejercicios;

import java.io.*;
import java.util.Scanner;

public class Ejercicio12 {
	public Ejercicio12(){
		try { 
			FileOutputStream fos = new FileOutputStream("uno.bin"); 
			BufferedOutputStream bos = new BufferedOutputStream (fos); 
			//Necesitamos un objeto de la clase DataOutputStream 
			DataOutputStream salidaB = new DataOutputStream(bos); 
			//Meter un double en el archivo 
			Scanner sc = new Scanner(System.in);
			Integer dato = sc.nextInt();
			salidaB.writeInt(dato); 
			salidaB.close(); 
			bos.close(); 
			fos.close(); 
			System.out.println("¡Archivo creado correctamente!");
			sc.close();
		} catch(IOException i) { 
			System.out.println("Se produjo un error de Archivo"); 
		} 
	}
	public static void main(String[] args) { 
		new Ejercicio12(); 
	} 
}