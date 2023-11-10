package org.lessons.java;

import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		

		while(true) {
			
//			Ask word to user
			System.out.println("Inserisci una parola, oppure inserisci 0 se vuoi uscire");
			String word = in.nextLine();
			
			
		
			if (word.equals("0")) {
			in.close();
            break; 
			}
			
			int letters = 0;
			int numbers = 0;
			int symbols = 0;
			
			for(int i = 0; i < word.length(); i++) {
				if(Character.isLetter(word.charAt(i))) {
					letters += 1;
				} else if(Character.isDigit(word.charAt(i))){
					numbers += 1;
				} else {
					symbols += 1;
				}
			}
			
			System.out.println("La parola contiene " + letters + " lettere");
			System.out.println("La parola contiene " + numbers + " numeri");
			System.out.println("La parola contiene " + symbols + " simboli non alfanumerici");
			
		};
	}

}
