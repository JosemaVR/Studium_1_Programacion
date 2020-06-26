package ejercicios;

import java.awt.*;

public class Ejercicio1 extends Frame{

	
	private static final long serialVersionUID = 1L;
	Label txtTexto = new Label("Celsius");
	TextField txtTexto1 = new TextField(20);
	Label txtTexto2 = new Label("Fahrenheit");
	TextField txtTexto3 = new TextField(20);
	Button btnBoton5 = new Button("Celsius a Fahrenheit");
	Button btnBoton6 = new Button("Fahrenheit a Celsius");
	public Ejercicio1() {
	// Establecer la distribución con 3 filas y 2 columnas
		setLayout( new GridLayout( 3,2 ) );
		add(txtTexto);
		add(txtTexto1);
		txtTexto1.requestFocus();		
		add(txtTexto2);
		add(txtTexto3);
		txtTexto3.requestFocus();		
		add(btnBoton5);
		add(btnBoton6);
		setSize(400,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	// Fin del Constructor

	public static void main(String[] args) {
		new Ejercicio1();
	}
	//Fin del Main

}
