package English_exercises;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        
        //Declaramos variables
        Scanner reader;           // Para leer datos del usuario
        double amount;             // Cantidad de dinero introducida
        double interestRate;       // Tipo de interés según la cuenta
        double interestEarned;     // Interés ganado en un año
        char accountType;          // Tipo de cuenta (A, B, C o X)
        
        //INICIALIZACIONES
        reader = new Scanner(System.in);
        interestRate = 0;
        interestEarned = 0;
        
        //Entrada de datos
        System.out.print("Enter the amount of money: ");
        amount = reader.nextDouble();
        
        System.out.print("Enter the account type (A, B, C, X): ");
        accountType = reader.next().toUpperCase().charAt(0); 
        //Convertimos a mayuscula para aceptar letras minusculas o mayusculas
        
        //Logica principal con switch
        switch(accountType) {
            case 'A':
                interestRate = 1.5;
                break;
            case 'B':
                interestRate = 2.0;
                break;
            case 'C':
                interestRate = 1.5;
                break;
            case 'X':
                interestRate = 5.0;
                break;
            default:
                System.out.println("Invalid account type. Using 0% interest.");
                interestRate = 0;
                break;
        }
        
        //Calculo del interés
        interestEarned = amount * (interestRate / 100);
        
        // 🔹 Resultados
        System.out.println("------------------------------------");
        System.out.printf("Account type: %c%n", accountType);
        System.out.printf("Annual interest rate: %.1f%%%n", interestRate);
        System.out.printf("Amount entered: €%.2f%n", amount);
        System.out.printf("Interest earned in one year: €%.2f%n", interestEarned);
        System.out.printf("Total after one year: €%.2f%n", (amount + interestEarned));
        
        reader.close();
    }
}

