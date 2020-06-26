package awtChoice;

import java.awt.*;

public class AwtChoice extends Frame {

	private static final long serialVersionUID = 1L;
		Choice choLista = new Choice();

	public AwtChoice() {
		setLayout(new FlowLayout());
		setTitle("Choice: Lista desplegable");
		//Añadir elementos a la lista
		choLista.add("Blanco");
		choLista.add("Rojo");
		choLista.add("Azul");
		//Añadir la lista
		add(choLista);
		setLocationRelativeTo(null);
		setSize(100,120);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AwtChoice();
	}
}