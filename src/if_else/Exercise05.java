package if_else;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";
		String jugada1;
		String jugada2;
		
		Scanner reader = new Scanner(System.in);
		jugada1 = reader.next();
		
		jugada2 = reader.next();
		
		if (jugada1.equals(jugada2)) {
		} else if (jugada1.equals("PIEDRA") && jugada2.equals("TIJERAS")) {
			System.out.println("Gana el jugador 1");
			
		}
		
		reader.close();
	}

}
