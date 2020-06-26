package temario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClaseSerializable {
	private static final long serialVersionUID = 1L; 
	public static void main(String[] args) { 
		try { 
			ObjectOutputStream objetoSalida = new ObjectOutputStream(new FileOutputStream("archivoSerializable.x")); 
			String s = new String("Me van a serializar…"); 
			objetoSalida.writeObject(s); 
			ObjectInputStream objetoEntrada = new ObjectInputStream(new FileInputStream("archivoSerializable.x")); 
			String s2 = (String) objetoEntrada.readObject(); 
			System.out.println(s2); 
			objetoSalida.close(); 
			objetoEntrada.close(); 
		} catch(Exception e) {
			System.out.println("Se produjo un error en la serialización:" + e.getMessage());
		}
	}
}
