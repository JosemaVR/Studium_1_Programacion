package mvc;

public class Principal {

	public static void main(String[] args) {
		Vista v = new Vista();
		Modelo m = new Modelo();
		new Controlador(m, v);
	}
}