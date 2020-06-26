package practica1;

import java.util.Scanner;

public class PreguntasRespuestas {

	public static void main(String[] args) {
		// Creamos una tabla vacía de 1 dimensión y tamaño 10 para introducir las preguntas
		String pregunta[] = new String[10];
		// Creamos una tabla vacía de 2 dimensiones y tamaño 10x3 para introducir las respuestas
		String respuesta[][] = new String [10][3];
		// Apertura de la introducción por teclado
		Scanner sc = new Scanner(System.in);
		/* 
	 		'i' y 'j' nos sirven para localizar las preguntas y las respuestas 
			(primero la pregunta, que nos marca la i de las respuestas)
			'x' e 'y' nos sirve para elegir la respuesta y que esta sea válida,
			y 'k' para contabilizar los aciertos.
			'a1[]' y 'a2[]' nos ayudan a llamar a la función 'aleatorio'.
		 */
		Integer i, j, x, z;
		String y;
		Integer k = 0;
		Integer a1[] = aleatorio(10);
		Integer a2[];
		/* 
		 	Las preguntas están definidas en una tabla de 1 dimensión de tamaño 10.
			Las respuestas están definidas en una tabla de 2 dimensiones de tamaño 10x3, 
			donde el primer nº las relaciona con su pregunta.
		*/
		pregunta[0] = "¿Capital de Francia?";
		respuesta[0][0] = "Lyon";
		respuesta[0][1] = "Marsella";
		respuesta[0][2] = "París *";
		
		pregunta[1] = "¿Cómo se llama a la cría de la oveja?";
		respuesta[1][0] = "Lechón";
		respuesta[1][1] = "Ternero";
		respuesta[1][2] = "Cordero *";
		
		pregunta[2] = "¿En que años consiguió la seleccion de baloncesto sus 2 mundiales?";
		respuesta[2][0] = "2010 y 2019";
		respuesta[2][1] = "2006 y 2010";
		respuesta[2][2] = "2006 y 2019 *";
		
		pregunta[3] = "¿Que película ganó el Oscar a mejor película?";
		respuesta[3][0] = "Resacón en las Vegas";
		respuesta[3][1] = "Transformers";
		respuesta[3][2] = "Gladiator *";
		
		pregunta[4] = "¿Cual es el país más poblado del mundo?";
		respuesta[4][0] = "San Marino";
		respuesta[4][1] = "Andorra";
		respuesta[4][2] = "India *";
		
		pregunta[5] = "¿Que piloto español ha ganado el mundial de moto GP este año?";
		respuesta[5][0] = "Valentino Rossi";
		respuesta[5][1] = "Fernando Alonso";
		respuesta[5][2] = "Marc Márquez *";
		
		pregunta[6] = "¿Partido político del presidente del gobierno?";
		respuesta[6][0] = "PP";
		respuesta[6][1] = "Podemos";
		respuesta[6][2] = "PSOE *";
		
		pregunta[7] = "¿Cual es la respuesta correcta?";
		respuesta[7][0] = "Esta no es";
		respuesta[7][1] = "No es esta";
		respuesta[7][2] = "Esta si! *";
		
		pregunta[8] = "¿Donde se habla euskera?";
		respuesta[8][0] = "Murcia";
		respuesta[8][1] = "Portugal";
		respuesta[8][2] = "País Vasco *";
		
		pregunta[9] = "¿De que color es el caballo blanco de Santiago?";
		respuesta[9][0] = "Verde";
		respuesta[9][1] = "Negro";
		respuesta[9][2] = "Blanco *";
		/* 
		 	Para cada pregunta obtenida en 'a1[]' 
		  	obtenemos sus respuestas reordenadas con 'a2[]'
			y vamos enseñando por pantalla las respuestas
		*/
		for(i=0; i<3; i++) {
			System.out.println("\n"+pregunta[a1[i]]);
			a2 = aleatorio(3);
			for(j=0; j<3; j++) {
				System.out.println((j+1) + " - " + respuesta[a1[i]][a2[j]]);
			}
			/* 
				Respondemos a la pregunta con un nº del 1 al 3, 
				si no es así salta el error hasta que sea válido
			*/
			for(x=0; x<1 || x>3; x=z) {
				y = sc.next();
				switch(y) {
					case "1":
						x = 1;
						z = 1;
						break;
					case "2":
						x = 2;
						z = 2;
						break;
					case "3":
						x = 3;
						z = 3;
						break;
					default:
						x = 0;
						z = 0;
						break;
				}
				if(x!=3 && x!=2 && x!=1) {
					System.out.println("Respuesta no válida. "
					+ "Pruebe otra vez eligiendo uno de los valores.");
				}
			}
			// Añadimos los aciertos que vayamos obteniendo si se cumple el 'if'
			if(respuesta[a1[i]][2] == respuesta[a1[i]][a2[(x-1)]]) {
				k = k + 1;
			}
		}
		// Este 'if' solo se usa para redactar mejor la respuesta dada en los aciertos
		if(k == 1) {
			System.out.println(k + " acierto.");
		} else {
			System.out.println(k + " aciertos.");
		}		
		// Cierre de la introducción por teclado
		sc.close();
	}
	/* 
		Esta función nos devuelve una tabla de tamaño 3 
	 	con 3 valores aleatorios de entre los que le demos como inicial sin repetir.
		Ejemplo: 3 valores aleatorios de 5 posibles: 3, 1, 4
	*/
	public static Integer[] aleatorio(Integer cantidad) {
		// Creamos una tabla de 1 dimensión y tamaño 3 para introducir los 3 valores aleatorios
		Integer aleatorio[] = new Integer[3];
		// Declaramos unos numeros aleatorios iniciales
		aleatorio[0] = (int) (Math.random()*cantidad);
		aleatorio[1] = (int) (Math.random()*cantidad);
		aleatorio[2] = (int) (Math.random()*cantidad);
		/* 
			Con este 'while' obtenemos aleatorios nuevos 
			hasta que obtenemos 3 diferentes, evitamos la repetición
		*/
		while(aleatorio[0] == aleatorio[1] || aleatorio[0] == aleatorio[2] 
				|| aleatorio[1] == aleatorio[2]) {
			aleatorio[1] = (int) (Math.random()*cantidad);
			aleatorio[2] = (int) (Math.random()*cantidad);
		}
		// Al llegar aquí devolvemos 3 números no repetidos entre 0 y ('cantidad'-1)
		return aleatorio;	
	}
}