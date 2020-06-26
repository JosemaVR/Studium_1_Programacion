package ejercicios;

import temario.Base64;

public class SerializacionImagen {
	private static final long serialVersionUID = 1L; 
	public static void main(String[] args) { 
		// Primero serializa el fichero imagen.jpg en salida.txt 
		// Y luego deserializa salida.txt en outputImage.jpg 
		String entrada1 = "imagen.jpg"; 
		String salida1 = "salidaJPG.txt";
		try { 
			// Serializar la imagen indicada 
			String encoded1 = Base64.encodeFromFile(entrada1); 
			// Mostrar por consola el resultado
			System.out.println(encoded1 + "\n"); 
			// Serializar directamente a otro fichero 
			Base64.encodeFileToFile(entrada1,salida1); 
			// Deserializar directamente de fichero 
			Base64.decodeFileToFile(salida1,"outputImage.jpg"); 
		} catch( java.io.IOException e ) { 
			System.out.println(e); 
		}
		
		String entrada2 = "imagen.bmp"; 
		String salida2 = "salidaBMP.txt";
		try { 
			// Serializar la imagen indicada 
			String encoded2 = Base64.encodeFromFile(entrada2); 
			// Mostrar por consola el resultado
			System.out.println(encoded2 + "\n"); 
			// Serializar directamente a otro fichero 
			Base64.encodeFileToFile(entrada2,salida2); 
			// Deserializar directamente de fichero 
			Base64.decodeFileToFile(salida2,"outputImage.bmp"); 
		} catch( java.io.IOException e ) { 
			System.out.println(e); 
		}
		
		String entrada3 = "imagen.gif"; 
		String salida3 = "salidaGIF.txt";
		try { 
			// Serializar la imagen indicada 
			String encoded3 = Base64.encodeFromFile(entrada3); 
			// Mostrar por consola el resultado
			System.out.println(encoded3 + "\n"); 
			// Serializar directamente a otro fichero 
			Base64.encodeFileToFile(entrada3,salida3); 
			// Deserializar directamente de fichero 
			Base64.decodeFileToFile(salida3,"outputImage.gif"); 
		} catch( java.io.IOException e ) { 
			System.out.println(e); 
		}
	}
}
