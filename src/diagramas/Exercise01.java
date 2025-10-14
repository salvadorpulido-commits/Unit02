package diagramas;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		int edad;
		Scanner reader = new Scanner(System.in);
		
				
		System.out.println("Introduzca su edad:");
		edad = reader.nextInt();
		
		if (edad >=18) {
			System.out.println("Eres mayor de edad");
				
		}

		reader.close();
	}

}
