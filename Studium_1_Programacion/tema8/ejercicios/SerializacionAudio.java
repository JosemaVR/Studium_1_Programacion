package ejercicios;

import temario.Base64;

public class SerializacionAudio {
	private static final long serialVersionUID = 1L; 
	public static void main(String[] args) { 
		// Primero serializa el fichero audio.jpg en salida.txt 
		// Y luego deserializa salida.txt en outputAudio.jpg 
		String entrada1 = "audio.wav"; 
		String salida1 = "salidaWAV.txt";
		try { 
			// Serializar la audio indicada 
			String encoded1 = Base64.encodeFromFile(entrada1); 
			// Mostrar por consola el resultado
			System.out.println(encoded1 + "\n"); 
			// Serializar directamente a otro fichero 
			Base64.encodeFileToFile(entrada1,salida1); 
			// Deserializar directamente de fichero 
			Base64.decodeFileToFile(salida1,"outputAudio.wav"); 
		} catch( java.io.IOException e ) { 
			System.out.println(e); 
		}
		
		String entrada2 = "audio.mp3"; 
		String salida2 = "salidaMP3.txt";
		try { 
			// Serializar la audio indicada 
			String encoded2 = Base64.encodeFromFile(entrada2); 
			// Mostrar por consola el resultado
			System.out.println(encoded2 + "\n"); 
			// Serializar directamente a otro fichero 
			Base64.encodeFileToFile(entrada2,salida2); 
			// Deserializar directamente de fichero 
			Base64.decodeFileToFile(salida2,"outputAudio.mp3"); 
		} catch( java.io.IOException e ) { 
			System.out.println(e); 
		}
		
		String entrada3 = "audio.ogg"; 
		String salida3 = "salidaOGG.txt";
		try { 
			// Serializar la audio indicada 
			String encoded3 = Base64.encodeFromFile(entrada3); 
			// Mostrar por consola el resultado
			System.out.println(encoded3 + "\n"); 
			// Serializar directamente a otro fichero 
			Base64.encodeFileToFile(entrada3,salida3); 
			// Deserializar directamente de fichero 
			Base64.decodeFileToFile(salida3,"outputAudio.ogg"); 
		} catch( java.io.IOException e ) { 
			System.out.println(e); 
		}
		
		String entrada4 = "audio.wma"; 
		String salida4 = "salidaWMA.txt";
		try { 
			// Serializar la audio indicada 
			String encoded4 = Base64.encodeFromFile(entrada4); 
			// Mostrar por consola el resultado
			System.out.println(encoded4 + "\n"); 
			// Serializar directamente a otro fichero 
			Base64.encodeFileToFile(entrada4,salida4); 
			// Deserializar directamente de fichero 
			Base64.decodeFileToFile(salida4,"outputAudio.wma"); 
		} catch( java.io.IOException e ) { 
			System.out.println(e); 
		}
	}
}
