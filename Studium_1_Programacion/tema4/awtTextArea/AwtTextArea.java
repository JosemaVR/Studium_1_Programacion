package awtTextArea;

import java.awt.*;

public class AwtTextArea extends Frame {

	private static final long serialVersionUID = 1L;
	// Crear un TextArea vacío con tamaño 5 filas y 20 columnas
	TextArea areaTexto = new TextArea("", 5, 20);

	public AwtTextArea() {
		setLayout(new FlowLayout());
		setTitle("TextArea");
		add(areaTexto);
		setLocationRelativeTo(null);
		setSize(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AwtTextArea();
	}
}