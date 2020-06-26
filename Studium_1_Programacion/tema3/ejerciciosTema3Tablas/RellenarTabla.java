package ejerciciosTema3Tablas;

public class RellenarTabla {

	public static void main(String[] args) {

		int tabla[] = new int[20];
		int i;
		for(i=0; i<20; i++) {
			tabla[i] = 2*i;
		}
		for(i=0; i<tabla.length; i++) {
			System.out.println(tabla[i]);
		}
	}

}
