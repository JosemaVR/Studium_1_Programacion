package ejercicios;

import java.awt.*;

public class Ejercicio4 extends Frame{

	
	private static final long serialVersionUID = 1L;
	CheckboxGroup chkgrGrupo1 = new CheckboxGroup();
	Checkbox chk1 = new Checkbox("Gasolina", false, chkgrGrupo1);
	Checkbox chk2 = new Checkbox("Díesel", false, chkgrGrupo1);
	Checkbox chk3 = new Checkbox("Híbrido", false, chkgrGrupo1);
	Checkbox chk4 = new Checkbox("Eléctrico", false, chkgrGrupo1);
	CheckboxGroup chkgrGrupo2 = new CheckboxGroup();
	Checkbox chk5 = new Checkbox("3 puertas", false, chkgrGrupo2);
	Checkbox chk6 = new Checkbox("4 puertas", false, chkgrGrupo2);
	Checkbox chk7 = new Checkbox("5 puertas", false, chkgrGrupo2);
	CheckboxGroup chkgrGrupo3 = new CheckboxGroup();
	Checkbox chk8 = new Checkbox("Sí", false, chkgrGrupo3);
	Checkbox chk9 = new Checkbox("No", false, chkgrGrupo3);
	Label txt1 = new Label("¿Tipo de motorización?");
	Label txt2 = new Label("¿Número de puertas?");
	Label txt3 = new Label("¿Pintura Metalizada?");
	Button btnBoton = new Button("Calcular Presupuesto");
	
	public Ejercicio4() {
	// Establecer la distribución con 3 filas y 2 columnas
		setLayout( new FlowLayout() );
		add(txt1);
		add(chk1);
		add(chk2);	
		add(chk3);	
		add(chk4);
		add(txt2);
		add(chk5);	
		add(chk6);	
		add(chk7);
		add(txt3);
		add(chk8);	
		add(chk9);		
		add(btnBoton);
		setSize(450,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	// Fin del Constructor

	public static void main(String[] args) {
		new Ejercicio4();
	}
	//Fin del Main

}
