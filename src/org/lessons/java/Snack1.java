package org.lessons.java;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		Ask number to user
		System.out.println("Inserisci un numero");
		String number = in.nextLine();
		int intNumber = Integer.parseInt(number);
		
		in.close();
		
		if(intNumber % 2 == 0) {
			System.out.println("Il numero inserito è pari: " + intNumber);
		} else {
			System.out.println("Il numero inserito è dispari, il numero successivo è: " + (intNumber + 1));
		}
		

	}

}
