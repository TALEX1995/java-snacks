package org.lessons.java;

public class Snack3 {

	public static void main(String[] args) {
		
		int[] numbers = {5, 23, 54, 1, 53, 626, 34, 44, 25, 523, 30, 347};
		
		int sum = 0;
		
//		for(int i = 0; i < numbers.length; i++) {
//			if(i % 2 == 1) {
//				sum += numbers[i];
//			}
//		}
		
		for(int i = 1; i < numbers.length; i+=2) {
			
				sum += numbers[i];
			
		}
		
		System.out.println("La somma dei numeri in posizione dispari è: " + sum);
	}

}
