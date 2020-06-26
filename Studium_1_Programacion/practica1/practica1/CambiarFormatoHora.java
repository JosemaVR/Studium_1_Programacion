package practica1;

import java.util.Scanner;

public class CambiarFormatoHora {

	public static void main(String[] args) {
		// Declaración de 3 frases que se repetirán a lo largo del código
		final String convertido = "Convertido a 'AM/PM':";
		final String pregunta = "Dime la hora (formato 'HH:mm') - Finaliza enviando '*'";
		final String error = "Error de formato. Tiene que tener la forma 'HH:mm', " + 
				"las horas deben estar entre 0 y 23, " + 
				"y los minutos deben estar entre 0 y 59.";
		// Apertura de la introducción por teclado	
		Scanner sc = new Scanner(System.in);
		// Preguntamos por primera vez al usuario
		System.out.println(pregunta);
		// Introducimos la variable 'horaCompleta', se comprueba más adelante si el formato es correcto
		String horaCompleta = sc.next();
		// Declaramos la variable 'formato' que nos indicará si es o no correcta la inserción de datos
		Boolean formato = false;
		// Declaramos la variable 'i' que usaremos en el for
		Integer i, hora1, hora2, minuto1, minuto2, horas, horasMostradas;
		for(i=0; formato==false; i++) {
			// Comprobación del formato de hora introducidos
			if(horaCompleta.length()==5) {
				hora1 = horaCompleta.charAt(0)-48;
				hora2 = horaCompleta.charAt(1)-48;
				minuto1 = horaCompleta.charAt(3)-48;
				minuto2 = horaCompleta.charAt(4)-48;
				horas = hora1*10+hora2;
				if(horas<=23 && horas>=0 && minuto1<=5 && minuto1>=0 && minuto2>=0 && minuto2<=9 && ':'==horaCompleta.charAt(2)) {
					if(horas>12) {
						System.out.println(convertido);
						horasMostradas = horas-12;
						if(horasMostradas>9) {
							System.out.println(horasMostradas + ":" + minuto1 + minuto2 + " PM");
						} else {
							// Necesario para que muestre un '0' antes de las horas menores de 10
							System.out.println("0" + horasMostradas + ":" + minuto1 + minuto2 + " PM");						
						}
					} else if(horas==12) {
						System.out.println(convertido);
						System.out.println(horas + ":" + minuto1 + minuto2 + " PM");
					} else {
						System.out.println(convertido);
						// Necesario para que muestre un '0' antes de las horas menores de 10
						System.out.println(hora1 + "" + hora2 + ":" + minuto1 + minuto2 + " AM");
					}
					// Reinicio del bucle si todo ha ido bien
					System.out.println(pregunta);
					horaCompleta = sc.next();
				// Si el formato no es correcto comienza este código
				} else {
					// Se ejecuta si el formato no es correcto, pero si tiene 5 carácteres
					formato = false;
					System.out.println(error);
					System.out.println(pregunta);
					horaCompleta = sc.next();
				}
			} else if(horaCompleta.contains("*")) {
				// Si el usuario ha escrito '*' se finaliza el bucle
				formato = true;
			} else {
				// Se ejecuta sólo si no tiene 5 carácteres
				formato = false;
				System.out.println(error);
				System.out.println(pregunta);
				horaCompleta = sc.next();
			}
		}
		// Se muestra cuando se finaliza el bucle (pulsando '*')
		System.out.println("FIN");
		// Cierre de la introducción por teclado
		sc.close();
	}
}