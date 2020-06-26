package ejerciciosTema2;

import java.util.Scanner;

public class PasarLetrasANumeros
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame letra:");
		String x = sc.next();
		char a = x.charAt(0);
		int i = 1;
		while(a!='*') {
			System.out.println(a + " = " + (i+(a-'a')));
			System.out.println("Dame letra:");
			x = sc.next();
			if(x.length()>1) {
				System.out.println("Solo 1 letra");
			} else {
				a = x.charAt(0);
			}
		}
		if(a=='*') {
			System.out.println("FIN");
		}		
		sc.close();
	}
}
