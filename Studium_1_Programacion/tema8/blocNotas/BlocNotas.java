package es.studium.BlocNotas;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BlocNotas extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;

	// En primer lugar creamos la barra de menú
	MenuBar barraMenu = new MenuBar();

	// Ahora creamos los elementos principales del menú
	Menu archivo = new Menu("Archivo");
	Menu gestion = new Menu("Gestión");

	// MenuItem del menú archivo
	MenuItem archivoNuevo = new MenuItem("Nuevo");
	MenuItem archivoAbrir = new MenuItem("Abrir");
	MenuItem archivoGuardar = new MenuItem("Guardar");
	MenuItem archivoSalir = new MenuItem("Salir");

	// MenuItem del menú gestion
	MenuItem gestionContarPalabras = new MenuItem("Contar palabras");
	MenuItem gestionContarLetras = new MenuItem("Contar letras");
	MenuItem gestionContarVocales = new MenuItem("Contar vocales");

	// Creamos el textarea
	TextArea ta = new TextArea(20,60);

	// Creamos la ventana de diálogo
	Dialog d = new Dialog(this, "", true);

	// Y una etiqueta
	Label lblDialogo = new Label();

	public BlocNotas()
	{
		// SIN Layout para que ocupe toda la pantalla y que se adapte siempre que esta cambie de tamaño
		setTitle("Bloc de Notas");

		// Establecemos la barra de menú
		setMenuBar(barraMenu);

		// Añadimos los elementos al menú archivo
		archivo.add(archivoNuevo);
		archivo.add(archivoAbrir);
		archivo.add(archivoGuardar);
		archivo.addSeparator();
		archivo.add(archivoSalir);

		// Añadimos los elementos al menú gestion
		gestion.add(gestionContarPalabras);
		gestion.add(gestionContarLetras);
		gestion.add(gestionContarVocales);

		// Por último agregamos los elementos archivo y gestion a la barra
		barraMenu.add(archivo);
		barraMenu.add(gestion);

		// Escuchador de la ventana
		addWindowListener(this);

		// Para poder cerrar el Diálogo
		d.addWindowListener(this);

		// Listeners de las opciones de los submenús
		archivoNuevo.addActionListener(this);
		archivoAbrir.addActionListener(this);
		archivoGuardar.addActionListener(this);
		archivoSalir.addActionListener(this);

		gestionContarPalabras.addActionListener(this);
		gestionContarLetras.addActionListener(this);
		gestionContarVocales.addActionListener(this);

		// Añadimos el textarea
		this.add(ta);

		setSize(450,400);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new BlocNotas();
	}

	public void actionPerformed(ActionEvent ae) 
	{
		Object a;
		a = ae.getSource();
		// Archivo Nuevo
		if(a.equals(archivoNuevo))
		{
			// Borramos el textarea
			ta.selectAll();
			ta.setText("");
		}
		// Archivo Abrir
		else if(a.equals(archivoAbrir))
		{
			// Clase FileDialog en modo Lectura
			FileDialog fd = new FileDialog(this, "Seleccionar archivo", FileDialog.LOAD);
			// Establecer el Tipo de fichero
			fd.setFile("*.txt");
			// Mostrar el FiledDialog fd
			fd.setVisible(true);
			// Elaboramos la ruta al fichero y el nombre con los datos aportados por el usuario
			String filename = fd.getDirectory()+fd.getFile();

			// Si el archivo NO existe
			if (filename == "")
			{
				// Definir el Diálogo
				d.setLayout(new FlowLayout());
				d.setTitle("Archivo No encontrado");
				d.addWindowListener(this);
				lblDialogo.setText("Archivo No encontrado");            
				d.add(lblDialogo);
				d.setLocationRelativeTo(null);
				d.setSize(250,150);
				d.setVisible(true);
			}
			else
			{
				try
				{
					// Buffer de lectura enlazado al FileReader que enlaza con el fichero físico
					BufferedReader entrada = new BufferedReader(new FileReader(filename));
					String s;
					// Vaciamos el textarea
					ta.selectAll();
					ta.setText("");
					// Bucle para sacar toda la información del archivo línea a línea
					while((s=entrada.readLine())!=null)
					{
						// Añadimos el texto al final del textarea
						ta.append(s);
						// Añadimos un salto de línea en el textarea para que cada línea aparezca por separado
						ta.append("\n");
					}
					// Cerrar el objeto entrada
					entrada.close();
				}
				catch(IOException i)
				{
					// Definir y mostrar el Diálogo
					d.setLayout(new FlowLayout());
					d.setTitle("Archivo No encontrado");
					d.addWindowListener(this);
					lblDialogo.setText("Archivo No encontrado");            
					d.add(lblDialogo);
					d.setLocationRelativeTo(null);
					d.setSize(250,150);
					d.setVisible(true);
				}
			}
		}
		else if(a.equals(archivoGuardar))
		{
			try
			{
				// Solicita nombre del fichero
				FileDialog fd = new FileDialog(this, "Seleccionar archivo", FileDialog.SAVE);
				// Establecer el Tipo de fichero
				fd.setFile("*.txt");
				// Mostrar el FiledDialog fd
				fd.setVisible(true);
				// Elaboramos la ruta al fichero y el nombre con los datos aportados por el usuario
				String filename = fd.getDirectory()+fd.getFile();
				// Buffer de escritura enlazado al FileWriter que enlaza con el fichero físico
				BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
				// Objeto para la escritura en el Buffer
				PrintWriter salida = new PrintWriter(bw);
				// Copia en el archivo el contenido del textarea
				salida.println(ta.getText());
				// Cerrar objetos de salida
				bw.close();
				salida.close();

				// Establecemos el texto de la etiqueta
				lblDialogo.setText("Guardado archivo " + fd.getFile());

				// Definir y mostrar el Diálogo
				d.setLayout(new FlowLayout());
				d.setTitle("Archivo guardado");
				lblDialogo.setText("Archivo guardado");    
				d.add(lblDialogo);
				d.setLocationRelativeTo(null);
				d.setSize(250,150);
				d.setVisible(true);
			}
			catch(IOException i)
			{
				// Definir y mostrar el Diálogo
				d.setLayout(new FlowLayout());
				d.setTitle("Error al guardar Archivo");
				lblDialogo.setText("Error al guardar Archivo");            
				d.add(lblDialogo);
				d.setLocationRelativeTo(null);
				d.setSize(250,150);
				d.setVisible(true);
			}            
		}
		else if(a.equals(archivoSalir))
		{
			System.exit(0);
		}
		else if(a.equals(gestionContarPalabras))
		{
			// Sacamos el contenido del TextArea
			String miCadena = ta.getText();

			// Buscamos palabras separadas por " " y por \n o Intro
			StringTokenizer auxiliar1 = new StringTokenizer(miCadena, " ");
			StringTokenizer auxiliar2 = new StringTokenizer(miCadena, "\n");
			int numPalabras = auxiliar1.countTokens() + auxiliar2.countTokens();
			// Si el TextArea tiene contenido debemos quitar uno, pues cuenta uno de más siempre
			if(numPalabras!=0)
			{
				numPalabras--;
			}

			// Establecemos el texto de la etiqueta
			lblDialogo.setText("Hay " + numPalabras + " palabras en el texto.");

			// Definir y mostrar el Diálogo
			d.setLayout(new FlowLayout());
			d.setTitle("Contador de Palabras");            
			d.add(lblDialogo);
			d.setSize(200,150);
			d.setLocationRelativeTo(null);
			d.setVisible(true);
		}
		else if(a.equals(gestionContarLetras))
		{
			int numLetras = 0;
			char c = 0;

			// Sacamos el contenido del TextArea
			String texto = ta.getText();

			// Contamos Letras. No se cuentan los espacios y ni otros símbolos de control
			for(int i=0; i<texto.length();i++)
			{
				c = texto.charAt(i);

				if(Character.isLetter(c))
					numLetras++;
			}
			// Establecemos el texto de la etiqueta
			lblDialogo.setText("Hay " + numLetras + " letras en el texto.");

			// Definir y mostrar el Diálogo
			d.setLayout(new FlowLayout());
			d.setTitle("Contador de Letras");
			d.add(lblDialogo);
			d.setSize(200,150);
			d.setLocationRelativeTo(null);
			d.setVisible(true);
		}
		else 
		{
			int numVocales = 0;
			char c = 0;

			// Sacamos el contenido del TextArea
			String texto = ta.getText();

			for(int i=0; i<texto.length();i++)
			{
				// Recorremos letra a letra 
				c = texto.charAt(i);

				if(Character.isLetter(c))
				{
					// Vocales minúsculas sin tilde
					if ((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
					{
						numVocales++;
					}
					// Vocales minúsculas con tilde
					else if ((c=='á')||(c=='é')||(c=='í')||(c=='ó')||(c=='ú'))
					{
						numVocales++;
					}
					// Vocales mayúsculas sin tilde
					else if ((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
					{
						numVocales++;
					}
					// Vocales mayúsculas con tilde
					else if ((c=='Á')||(c=='É')||(c=='Í')||(c=='Ó')||(c=='Ú'))
					{
						numVocales++;
					}
				}
			}

			// Establecemos el texto de la etiqueta
			lblDialogo.setText("Hay " + numVocales + " vocales en el texto.");

			// Definir y mostrar el Diálogo
			d.setLayout(new FlowLayout());
			d.setTitle("Contador de Vocales");
			d.add(lblDialogo);
			d.setSize(200,150);
			d.setLocationRelativeTo(null);
			d.setVisible(true);
		}        
	}
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) 
	{
		// Si el diálogo tiene el foco
		if(d.hasFocus())
		{
			// Ocultamos la ventana
			d.setVisible(false);
		}
		// Si no tiene el foco, cerramos el programa
		else
		{
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}