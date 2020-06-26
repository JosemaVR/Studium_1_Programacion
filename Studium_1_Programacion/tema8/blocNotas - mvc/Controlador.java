package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener {

	Vista v;
	Modelo m;
	
	public Controlador(Modelo m, Vista v) {
		this.m = m;
		this.v = v;

		v.addWindowListener(this);
		v.menuNuevo.addActionListener(this);
		v.menuAbrir.addActionListener(this);
		v.menuGuardar.addActionListener(this);
		v.menuSalir.addActionListener(this);
		v.menuContarLetras.addActionListener(this);
		v.menuContarPalabras.addActionListener(this);
		v.menuContarVocales.addActionListener(this);
		v.dlgCuenta.addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object objetoPulsado = e.getSource();
		if(objetoPulsado.equals(v.menuSalir)) {
			System.exit(0);					
		}
		else if(objetoPulsado.equals(v.menuNuevo)){
			v.campoTexto.setText("");
		}
		else if(objetoPulsado.equals(v.menuAbrir)) {
			v.fdCargar.setVisible(true);
			v.campoTexto.setText(m.cargarArchivo(v.fdCargar));
			v.fdCargar.setVisible(false);
		}
		else if(objetoPulsado.equals(v.menuGuardar)) {
			v.fdGuardar.setVisible(true);
			m.guardarArchivo(v.fdGuardar, v.campoTexto.getText());
			v.fdGuardar.setVisible(false);
		}
		else if(objetoPulsado.equals(v.menuContarPalabras)) {
			v.lblCuenta.setText("Hay " + m.contarPalabras(v.campoTexto.getText()) + " palabras en el texto");
			v.dlgCuenta.setTitle("Contador de palabras");
			v.dlgCuenta.setVisible(true);
		}
		else if(objetoPulsado.equals(v.menuContarLetras)) {
			v.lblCuenta.setText("Hay " + m.contarLetras(v.campoTexto.getText()) + " letras en el texto");
			v.dlgCuenta.setTitle("Contador de letras");
			v.dlgCuenta.setVisible(true);
		}
		else if(objetoPulsado.equals(v.menuContarVocales)) {
			v.lblCuenta.setText("Hay " + m.contarVocales(v.campoTexto.getText()) + " vocales en el texto");
			v.dlgCuenta.setTitle("Contador de vocales");
			v.dlgCuenta.setVisible(true);
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);					
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub	
	}
}