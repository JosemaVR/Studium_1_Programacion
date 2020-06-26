package awtCanvas;

import java.awt.*;

public class AwtCanvas extends Frame {
	
	private static final long serialVersionUID = 1L;
		// Creación del Canvas
		Canvas cnvC1 = new Canvas();
	public AwtCanvas() {
		setLayout(new FlowLayout());
		setTitle("Canvas");
		add(cnvC1);
		setLocationRelativeTo(null);
		setSize(100, 100);
		// Obtener el foco para el canvas
		cnvC1.requestFocus();
		setVisible(true);
	}
	public static void main(String[] args) {
		new AwtCanvas();
	}
}