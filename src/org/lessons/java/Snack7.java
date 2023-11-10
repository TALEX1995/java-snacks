package org.lessons.java;

import java.util.Scanner;

public class Snack7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		Ask second to user
		System.out.println("Inserisci i secondi e ti diro quante ore minuti e secondi sono");
		String inputSeconds = in.nextLine();
		int intSeconds = Integer.valueOf(inputSeconds);
		
		in.close();
		
		int hours = intSeconds / 3600;
		
        int remainingSeconds = intSeconds % 3600;
        
        int minutes = remainingSeconds / 60;
        
        int seconds = remainingSeconds % 60;
        
        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
		
		
		System.out.println(formattedTime);
		

	}

}
