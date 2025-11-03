package doWhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Variable almacenar suma total
		int suma = 0;
		
		// Contador que va a ir sumando
		int contador = 1;
		
		// Numero introducido por ususario
		
		int numero;
		
		// Creamos scanner
		
		Scanner reader = new Scanner(System.in);
		
		// Pedimos numero al usuario
	    System.out.println("Introduzca un numero ");
	    numero = reader.nextInt();
	    
	    do {
	    	suma += contador;
	    	contador++;
	    } while(numero <= 0); // PUNTO y COMA!!!!
	    
	    System.out.println("Introduzca un numero ");
	    numero = reader.nextInt();
	    
	    System.out.println("La suma de los numeros es: ");
	    suma = reader.nextInt(); 
	    		
	    reader.close();
	   
	    }

	}
