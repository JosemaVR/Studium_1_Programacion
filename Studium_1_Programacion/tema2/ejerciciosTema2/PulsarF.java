package ejerciciosTema2;

import java.util.Scanner;

public class PulsarF
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame letras hasta f");
		String x = sc.next();
		char y = x.charAt(0);
		if(x.length()>1) {
			System.out.println("Solo 1 letra");
		}
		char a;
		for(a=y; a!='f'; a = sc.next().charAt(0)) {
			System.out.println(a);	
		}
		if(a=='f') {
			System.out.println("FIN");
		}
		sc.close();
	}

}
