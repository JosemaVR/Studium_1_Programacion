package ejerciciosTema3Tablas;

import java.util.Scanner;
import java.util.Vector;

public class Suma2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Integer i;
		System.out.println("Dame un número (si pulsa '0' se dará por finalizado)");
		Integer k = sc.nextInt();
		Integer suma = 0;
		String x = null;
		Vector <Integer> v = new Vector <Integer>();
		for(i=0; k!=0; i++) {
			System.out.println("Dame un número (si pulsa '0' se dará por finalizado)");
			if(x=="*") {
				System.out.println("FIN");
			} else {
				v.add(k);	
			}	
			k = sc.nextInt();
		}
		
		for(i=0; i<v.size(); i++) {
			suma = suma + v.get(i);
		}
		
		System.out.println(suma);
		sc.close();
	}

}
