package ejerciciosTema2;

import java.util.Scanner;

public class BinarioADecilam
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la primera cifra:");
		int a = sc.nextInt();
		System.out.println("Dame la segunda cifra:");
		int b = sc.nextInt();
		System.out.println("Dame la tercera cifra:");
		int c = sc.nextInt();
		System.out.println("Dame la cuarta cifra:");
		int d = sc.nextInt();
		System.out.println("Dame la quinta cifra:");
		int e = sc.nextInt();
		if((a==1 || a==0) && (b==1 || b==0) && (c==1 || c==0) && (d==1 || d==0) && (e==1 || e==0)) {
			System.out.println("El número binario es " + a + "" + b + "" + c + "" + d + "" + e);
			System.out.println("El número decimal es " + conversion(a, b, c, d, e));
		} else {			
			System.out.println("Los números tienen que ser 0 o 1");
		}		
		sc.close();
	}
	
	public static Integer conversion(Integer a, Integer b, Integer c, Integer d, Integer e) {
		return e*1+d*2+c*4+b*8+a*16;
	}

}
