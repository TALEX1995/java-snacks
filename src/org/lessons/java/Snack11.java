package org.lessons.java;

import java.util.Random;

public class Snack11 {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		
		final int COUNT_NUMBER = 10;

		int[] arrayNumber = new int[COUNT_NUMBER];
		
		for(int i = 0; i < 10; i++) {
			int n = rand.nextInt(101);
			arrayNumber[i] = n;
			System.out.println(arrayNumber[i]);
		}
		
		int min = 100;
		int max = 0;
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			if(arrayNumber[i] < min) {
				min = arrayNumber[i];
			};
			if(arrayNumber[i] > max) {
				max = arrayNumber[i];
			};
			sum += arrayNumber[i];
		}
		
		int medium = sum / COUNT_NUMBER;
		
		System.out.println("Minimo: " + min);
		System.out.println("Massimo: " + max);
		System.out.println("Media: " + medium);
	}

}
