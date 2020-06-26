package ejerciciosTema2;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número a:");
		int a = sc.nextInt();
		System.out.println("Dame el número b:");
		int b = sc.nextInt();
		int i = a;
		if(a>b) {
			for (i=(b+1); i<a; i++) {
				if(i%2==0) {
					System.out.println(i);				
				}
			}
		} else {
			for (i=(a+1); i<b; i++) {
				if(i%2==0) {
					System.out.println(i);				
				}
			}
		}
		sc.close();
	}

}
