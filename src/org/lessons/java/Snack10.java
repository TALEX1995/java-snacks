package org.lessons.java;

import java.util.Scanner;

public class Snack10 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		Ask number to user
		System.out.println("Inserisci il primo numero");
		String firstNumber = in.nextLine();
		int intFirstNumber = Integer.valueOf(firstNumber);
		
		System.out.println("Inserisci il secondo numero");
		String secondNumber = in.nextLine();
		int intSecondNumber = Integer.valueOf(secondNumber);
		
		in.close();
		
		int minNum = 0;
		int maxNum = 0;
		
		if(intFirstNumber > intSecondNumber) {
			minNum = intSecondNumber;
			maxNum = intFirstNumber;
		} else if(intFirstNumber < intSecondNumber) {
			minNum = intFirstNumber;
			maxNum = intSecondNumber;
		}
		
		
		int numberBetweenMinMax = maxNum - minNum;
		int sum = 0;
		
		for(int i = 0; i <= numberBetweenMinMax; i++) {
			sum += minNum;
			minNum++;
		}
		
		System.out.println(sum);
		
		

	}

}
