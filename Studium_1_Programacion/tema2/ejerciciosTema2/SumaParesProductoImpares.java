package ejerciciosTema2;

public class SumaParesProductoImpares
{

	public static void main(String[] args)
	{
		int suma = 0;
		int producto = 1;
		int i = 1;
		for(i=1; i<=40; i++) {
			if(i%2==0) {
				suma = suma + i;
			} else {
				producto = producto * i;
			}
		}
		System.out.println(suma);
		System.out.println(producto);
	}

}
