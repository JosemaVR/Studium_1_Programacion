package mvc;

import java.awt.FileDialog;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Modelo {

	public String cargarArchivo(FileDialog fdCargar) {
		String res = "";
		try {
			FileReader fis = new FileReader(fdCargar.getDirectory() + fdCargar.getFile());
			BufferedReader bis = new BufferedReader(fis);	
			String s;
			//Bucle para sacar la información del archivo
			while((s=bis.readLine())!=null)
			{
				if(res.length()==0) {
					res = s;
				}
				else {
					res = res + "\n" + s;
				}
			}
			bis.close();
			fis.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return res;
	}

	public void guardarArchivo(FileDialog fdGuardar, String text) {
		try
		{
			FileOutputStream fos = new FileOutputStream(fdGuardar.getDirectory() + fdGuardar.getFile());
			BufferedOutputStream bos = new BufferedOutputStream (fos);
			//Necesitamos un objeto de la clase DataOutputStream
			DataOutputStream salidaB = new DataOutputStream(bos);
			//Meter un double en el archivo
			salidaB.writeBytes(text);
			salidaB.close();
			bos.close();
			fos.close();
			System.out.println("¡Archivo creado correctamente!");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}

	public Integer contarPalabras(String text) {
		// Buscamos palabras separadas por " " y por \n o Intro
		StringTokenizer auxiliar1 = new StringTokenizer(text, " ");
		StringTokenizer auxiliar2 = new StringTokenizer(text, "\n");
		int numPalabras = auxiliar1.countTokens() + auxiliar2.countTokens();
		// Si el TextArea tiene contenido debemos quitar uno, pues cuenta uno de más siempre
		if(numPalabras!=0)
		{
			numPalabras--;
		}
		return numPalabras;
	}

	public Integer contarLetras(String text) {
		String textoFinal = text.replaceAll("\r", "").replaceAll("\n", "").replaceAll(" ", "");
		return textoFinal.length();
	}

	public Integer contarVocales(String text) {
		Integer j = 0;
		String textoFinal = text.replaceAll("\r", "").replaceAll("\n", "").replaceAll(" ", "");
		char[] letras = textoFinal.toCharArray();
		for(int i = 0; i<letras.length; i++) {
			if(letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u') {
				j++;
			}
			else if ((letras[i]=='á')||(letras[i]=='é')||(letras[i]=='í')||(letras[i]=='ó')||(letras[i]=='ú'))
			{
				j++;
			}
			// Vocales mayúsculas sin tilde
			else if ((letras[i]=='A')||(letras[i]=='E')||(letras[i]=='I')||(letras[i]=='O')||(letras[i]=='U'))
			{
				j++;
			}
			// Vocales mayúsculas con tilde
			else if ((letras[i]=='Á')||(letras[i]=='É')||(letras[i]=='Í')||(letras[i]=='Ó')||(letras[i]=='Ú'))
			{
				j++;
			}
		}
		return j;
	}
}