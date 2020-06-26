package awtScrollbar;

import java.awt.*;

public class AwtScrollbar extends Frame {

	private static final long serialVersionUID = 1L;
		Scrollbar scrVertical = new Scrollbar(Scrollbar.VERTICAL);
		Scrollbar scrHorizontal = new Scrollbar(Scrollbar. HORIZONTAL);
		
	public AwtScrollbar() {
		setLayout(new BorderLayout());
		setTitle("Scrollbar");
		add("East", scrVertical);
		add("South", scrHorizontal);
		setLocationRelativeTo(null);
		setSize(150,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AwtScrollbar();
	}
}