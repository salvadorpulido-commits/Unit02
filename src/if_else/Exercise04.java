package if_else;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		/*
		 * Escribir una aplicación que indique cuántas cifras tiene 
		 * un número introducido por teclado, 
		 * que está comprendido entre 0 y 99999. 
		 */
		
		int number;
				
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		number = reader.nextInt();
		
		if(number < 0 || number > 99999) {
			System.out.println("Numero incorrecto");
		} else if (number < 10 ) {
			System.out.println("Tiene un cifra");
				
		} else if (number < 100) {
			System.out.println("Tiene dos cifras");
			
		} else if (number < 1000) {
			System.out.println("Tiene tres cifras");	
			
		} else if (number < 10000) {
			System.out.println("Tiene cuatro cifras");	
				
			reader.close(); 
			
			}
		
	   }
  
}


