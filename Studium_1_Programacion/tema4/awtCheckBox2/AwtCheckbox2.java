package awtCheckBox2;

import java.awt.*;

public class AwtCheckbox2 extends Frame {

	private static final long serialVersionUID = 1L;
		//En este caso, primero se define un grupo
		CheckboxGroup chkgrGrupo = new CheckboxGroup();
		// Al crear los checkboxes, se indica la etiqueta, si está o no
		// activo y el grupo al que pertenece. En un grupo, solamente
		// podrá estar activo un checkbox
		Checkbox chkUno = new Checkbox("Opción Uno", false, chkgrGrupo);
		Checkbox chkDos = new Checkbox("Opción Dos", false, chkgrGrupo);
		Checkbox chkTres = new Checkbox("Opción Tres", false, chkgrGrupo);
		
		CheckboxGroup chkgrGrupo2 = new CheckboxGroup();
		Checkbox chkUno2 = new Checkbox("Opción Uno", false, chkgrGrupo);
		Checkbox chkDos2 = new Checkbox("Opción Dos", false, chkgrGrupo2);
		Checkbox chkTres2 = new Checkbox("Opción Tres", false, chkgrGrupo2);

		
	public AwtCheckbox2() {
		setLayout(new FlowLayout());
		setTitle("Botones de Opción excluyentes");
		add(chkUno);
		add(chkDos);
		add(chkTres);
		
		add(chkUno2);
		add(chkDos2);
		add(chkTres2);
		setLocationRelativeTo(null);
		setSize(100,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AwtCheckbox2();
	}
}