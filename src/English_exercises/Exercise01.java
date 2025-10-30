package English_exercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option;
		String answer;
		
		double totalPrice = 375.99;
		final double SCREEN_38 = 75.99;
		final double SCREEN_43 = 99.99;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Which screen do you prefeer?");
		System.out.println("1. 38cm " + SCREEN_38);
		System.out.println("2. 43cm " + SCREEN_43);
	    option = reader.nextInt();
	    
	    switch(option) {
	    
	    case 1:
	    	totalPrice += SCREEN_38;
	    	break;
	    case 2:
	    	totalPrice += SCREEN_43;	
	    	break;
	    }
	    
	    System.out.println("Do you want an antivirus software (Y / N)");
	    answer = reader.next();
	    
	    if(answer.equalsIgnoreCase("Y")) {
	    	totalPrice += 125;
	    	
	    }
	    
		System.out.println("Total price: " + totalPrice);
		
		
		reader.close();
		
	}

}
