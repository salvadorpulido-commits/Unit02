package while_exercises;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		int sumaEdades = 0;
		int	numAlumnos = 0;		
		int numMayoresEdad = 0;
		double media;
		
		//Variable donde almacenamos la edad introducida por el usuario
		int edad;
		
		//Abrimos scanner
		Scanner reader = new Scanner(System.in);
		
		//Pedimos introducir edad
		System.out.println("Introduce edad ");
		edad = reader.nextInt();
		
		
		//Mientras que la edad sea positiva
		while (edad >= 0) {
			
			//Sumamos la edad introducida
			sumaEdades += edad;
			numAlumnos++;
			
		//Si el alumno es mayor de edad	
			
		if (edad >= 18); {
		numMayoresEdad++;
		}
		
		// Le pedimos la edad al usuario
		System.out.println("Introduzca una edad:");
		edad = reader.nextInt();
	}
	
	// Calculamos la media de las edades
	media = (double) sumaEdades / numAlumnos;
	
	// Imprimimos los distintos valores calculados
	System.out.println("La suma de las edades es: " + sumaEdades);
	System.out.println("El número total de alumnos es: " + numAlumnos);
	System.out.println("La media de las edades es: " + media);
	System.out.println("Alumnos mayores de edad: " + numMayoresEdad);
	
	
	// Cerramos el scanner
	reader.close();

    }

}