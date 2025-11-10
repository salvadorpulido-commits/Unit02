package forexersises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Variable contador
		
		int contador;
		
		//Variable contar multiplos de 3
		
		int contMult = 0;
				
		// Numero introducido por el usuario
		
		int numero;
		
		// Abrimos Scanner
		
		Scanner reader = new Scanner(System.in);
		
		// Pedimos un numero al usuario
		
		System.out.println("Introduzca numero:");
			numero = reader.nextInt();
		
		//Contamos desde 1 hasta numero incluido
		for(int contador = 1; contador <=numero; contador++) {
			if (contador % 3 == 0) {
				contMult++;
			}
		}
		
		// Escribimos el numero de multiplos de 3
		System.out.println("Hay " + contMult + " multiplos de 3");
		
		//Cierre del scanner
		reader.close();
	}

}
