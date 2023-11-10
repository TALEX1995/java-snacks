package org.lessons.java;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		Ask word to user
		System.out.println("Inserisci una parola, ti dirò se è palindroma");
		String word = in.nextLine();
		
		in.close();
		
//		Create variable for reverse word
		String reverseWord = "";
			
		for(int i = word.length() - 1; i >= 0; i--) {
			
			char c = word.charAt(i);
			reverseWord += c;
			
		}
		
		if(!word.equals(reverseWord)) {
			System.out.println("La parola " + word + " non è palindroma");
		} else {
			System.out.println("La parola " + word + " è palindroma");
		};

	}

}
