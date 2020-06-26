package awtTextField;

import java.awt.*;

public class AwtTextField extends Frame {

	private static final long serialVersionUID = 1L;
	// Crear un TextField con 20 de ancho
	TextField txtTexto = new TextField(20);

	public AwtTextField() {
		setLayout(new FlowLayout());
		setTitle("TextField");
		add(txtTexto);
		txtTexto.requestFocus();
		setLocationRelativeTo(null);
		setSize(250,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AwtTextField();
	}
}