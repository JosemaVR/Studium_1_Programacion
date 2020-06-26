package ejerciciosTema2;

public class Cuadrados
{

	public static void main(String[] args)
	{
		System.out.println("La suma de los cuadrados de los 100 primeros números naturales es: " + sumaCuadrados());

	}

	public static Integer sumaCuadrados() {
		int i;
		int res = 0;
		for(i=0; i<=99; i++) {
			res = res + (i*i);
		}
		return res;
	}
}
