package ejercicios;

import java.awt.*;

public class Ejercicio2 extends Frame{

	
	private static final long serialVersionUID = 1L;
	Label txtTexto = new Label("Introduzca la cantidad");
	TextField txtTexto1 = new TextField(20);
	Label txtTexto2 = new Label("Introduzca el porcentaje");
	TextField txtTexto3 = new TextField(20);
	Button btnBoton = new Button("Calcular");
	Label txtTexto4 = new Label("Resultado");
	TextField txtTexto5 = new TextField(30);
	
	public Ejercicio2() {
	// Establecer la distribución con 3 filas y 2 columnas
		setLayout( new FlowLayout() );
		add(txtTexto);
		add(txtTexto1);
		txtTexto1.requestFocus();		
		add(txtTexto2);
		add(txtTexto3);
		txtTexto3.requestFocus();		
		add(btnBoton);
		add(txtTexto4);
		txtTexto4.requestFocus();		
		add(txtTexto5);
		setSize(350,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	// Fin del Constructor

	public static void main(String[] args) {
		new Ejercicio2();
	}
	//Fin del Main

}
