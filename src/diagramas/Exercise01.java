package diagramas;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Declaramos variable
		int edad;

		// Abrimos scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos edad al usuario
		System.out.println("Introduzca su edad");
		edad = reader.nextInt();

		// Calculamos condicion e imprime resultado
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");

		}

		reader.close();
	}
}
