package org.lessons.java;

import java.util.Scanner;

public class snack8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

//		Ask word to user
		System.out.println("Inserisci una parola");
		String word = in.nextLine();
		
		in.close();
		
		String newWord = "";
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'a') {
				newWord += "o";
			} else if (word.charAt(i) == 'o') {
				newWord += "a";
			} else {
				newWord += word.charAt(i);
			}
		}
		
		System.out.println(newWord);
	}

}
