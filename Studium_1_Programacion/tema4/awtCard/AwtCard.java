package awtCard;

//Este ejemplo solamente sirve para ver cómo se implementa un Frame
//con este tipo de Distribución. Pero no podremos ver cómo pasar
//de una panel a otro hasta no ver la Gestión de Eventos
//En ese capítulo acabaremos este programa
import java.awt.*;

public class AwtCard extends Frame {
	
	private static final long serialVersionUID = 1L;
	//Creamos un par de paneles
	Panel pnlCard = new Panel();
	Panel pnlAc = new Panel();
	//Creamos un Choice o Lista de Selección
	Choice choC = new Choice();
	//Cadenas constantes (final) que insertaremos en el Choice
	final static String strPanelBoton = "Panel con Botones";
	final static String strPanelTexto = "Panel con Campo de Texto";
	//Creamos otros dos panels que irán dentro del Panel card
	Panel pnlP1 = new Panel();
	Panel pnlP2 = new Panel();
	Button btnB1 = new Button("Botón 1");
	Button btnB2 = new Button("Botón 2");
	Button btnB3 = new Button("Botón 3");
	// Creamos un TextField o Campo de Texto de tamaño 20
	TextField txtTexto = new TextField( "Texto",20 );
	public AwtCard() {
		// Establecer distribución del Frame
		setLayout( new BorderLayout() );
		// Añadir elementos al Choice
		choC.addItem(strPanelBoton);
		choC.addItem(strPanelTexto);
		// Añadir el Choice al panel pnlAc
		pnlAc.add(choC);
		// Añadir el panel pnlAc al Frame en la parte superior
		add( "North", pnlAc );
		// Establecer distribución del panel card
		pnlCard.setLayout( new CardLayout() );
		// Añadir botones al panel pnlP1
		pnlP1.add(btnB1);
		pnlP1.add(btnB2);
		pnlP1.add(btnB3);
		// Añadir TextField al panel pnlP2
		pnlP2.add(txtTexto);
		// Añadir los panels pnlP1 y pnlP2 al panel pnlCard
		pnlCard.add(strPanelBoton, pnlP1);
		pnlCard.add(strPanelTexto, pnlP2);
		// Añadir el panel pnlCard al Frame en el centro
		add( "Center", pnlCard);
		// Establecer el tamaño del Frame
		setSize(200,200);
		// Centra la ventana en la pantalla
		setLocationRelativeTo(null);
		// Mostrar el Frame en pantalla
		setVisible(true);
	}
	//Fin del Constructor
	
	public static void main(String[] args) {
		new AwtCard();
	}
	//Fin del main
}
//Fin de la clase