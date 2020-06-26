package ejercicios;

import java.io.*;
import java.util.Scanner;

public class Ejercicio5 {
	public Ejercicio5() {
		String nombreArticulo1 ="";
		String nombreArticulo2 ="";
		System.out.println("Primer txt:");
		Scanner sc1 = new Scanner(System.in);
		nombreArticulo1= sc1.nextLine();
		System.out.println("Segundo txt:");
		Scanner sc2 = new Scanner(System.in);
		nombreArticulo2 = sc2.nextLine();
		if(lectura(nombreArticulo1+".txt").equals(lectura((nombreArticulo2+".txt")))) {
			System.out.println("Tienen el mismo contenido");
		} else {
			System.out.println("Son diferentes");
		}
		sc1.close();
		sc2.close();
	} 

	public String lectura(String nombreArticulo) {
		String texto = "Nada de nada";
		try {
			//Origen de los datos en el proyecto anterior 
			FileReader fr = new FileReader("../P_T8/"+nombreArticulo); 
			//Buffer de lectura BufferedReader 
			BufferedReader entrada = new BufferedReader(fr); 
			//Cerrar el objeto entrada
			String s;
			System.out.println("Información del archivo");
			while((s=entrada.readLine())!=null) { 
				texto = texto + "\n" + s;
				System.out.println(s);
			} 
			entrada.close();
			fr.close();
		} catch(FileNotFoundException e) { 
			System.out.println("Archivo NO encontrado"); 
		} catch(IOException i) { 
			System.out.println("Se produjo un error de Archivo"); 
		} 
		return texto;
	}

	public static void main(String[] args) { 
		new Ejercicio5(); 
	} 
}
