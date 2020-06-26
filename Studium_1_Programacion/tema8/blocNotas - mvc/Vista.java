package mvc;

import java.awt.*;

public class Vista extends Frame {
	
	MenuBar barraMenu = new MenuBar();
	
	Menu menuArchivo = new Menu("Archivo");
	Menu menuContador = new Menu("Gestión");
	
	MenuItem menuNuevo = new MenuItem("Nuevo");
	MenuItem menuAbrir = new MenuItem("Abrir");
	MenuItem menuGuardar = new MenuItem("Guardar");
	MenuItem menuSalir = new MenuItem("Salir");
	
	MenuItem menuContarPalabras = new MenuItem("Contar palabras");
	MenuItem menuContarLetras = new MenuItem("Contar letras");
	MenuItem menuContarVocales = new MenuItem("Contar vocales");
		
	TextArea campoTexto = new TextArea();
	
	FileDialog fdCargar = new FileDialog(this, "Seleccionar archivo", FileDialog.LOAD);
	FileDialog fdGuardar = new FileDialog(this, "Indicar nombre y ubicación del archivo", FileDialog.SAVE);

	Dialog dlgCuenta = new Dialog(this, "", true);
	Label lblCuenta = new Label();
	
	public Vista() {
		setLayout(new BorderLayout());
		setTitle("Bloc de Notas");
		
		barraMenu.add(menuArchivo);
		barraMenu.add(menuContador);
		
		menuArchivo.add(menuNuevo);
		menuArchivo.add(menuAbrir);
		menuArchivo.add(menuGuardar);
		menuArchivo.addSeparator();
		menuArchivo.add(menuSalir);
		
		menuContador.add(menuContarPalabras);
		menuContador.add(menuContarLetras);
		menuContador.add(menuContarVocales);

		setMenuBar(barraMenu);

		add(campoTexto, BorderLayout.CENTER);

		dlgCuenta.setLayout(new FlowLayout());
		dlgCuenta.add(lblCuenta);
		dlgCuenta.setSize(300,80);
		dlgCuenta.setLocationRelativeTo(null);
		dlgCuenta.setVisible(false);
		
		setSize(500,500);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}	
}