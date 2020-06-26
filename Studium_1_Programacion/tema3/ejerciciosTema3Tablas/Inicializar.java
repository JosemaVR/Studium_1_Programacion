package ejerciciosTema3Tablas;

public class Inicializar {

	public static void main(String[] args) {

		final int i = 2;
		int k;
		int tabla[] = new int[i];
		for(k=0; k<i; k++) {
			tabla[k] = 0;
		}
		for(k=0; k<i; k++) {
			System.out.print(tabla[k] + " ");
		}
	}

}
