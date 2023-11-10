package org.lessons.java;

import java.util.Random;

public class Snack2 {
	
	public static void main(String[] args) {
		
		String[] name = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] surname = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			int randNameIndex = rand.nextInt(10);
			int randSurnameIndex = rand.nextInt(10);
			
			
			System.out.println("Invitato n. " + (i + 1) + " " + name[randNameIndex] + " " + surname[randSurnameIndex]);
		}
		
	}
}
