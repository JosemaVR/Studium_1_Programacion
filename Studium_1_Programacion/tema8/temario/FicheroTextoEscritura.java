package temario;

import java.io.*; 

public class FicheroTextoEscritura { 
	public FicheroTextoEscritura() { 
		try {
			//FileWriter tambi�n puede lanzar una excepci�n 
			// Destino de los datos 
			FileWriter fw = new FileWriter("Archivo.txt", true); 
			// Buffer de escritura 
			BufferedWriter bw = new BufferedWriter(fw); 
			// Objeto para la escritura 
			PrintWriter salida = new PrintWriter(bw); 
			//Guardamos la primera l�nea 
			salida.println("Caca"); 
			//Cerrar el objeto salida, el objeto bw y el fw 
			salida.close(); 
			bw.close(); 
			fw.close(); 
			System.out.println("�Archivo creado correctamente!"); 
		} catch(IOException i) { 
			System.out.println("Se produjo un error de Archivo"); 
		} 
	} public static void main(String[] args) { 
		new FicheroTextoEscritura(); 
	} 
}