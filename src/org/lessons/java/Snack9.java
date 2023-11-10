package org.lessons.java;

public class Snack9 {

	public static void main(String[] args) {
		
		int[] arrayNumber = {2, 7, 23 ,564, 123, 64, 14, 76, 34, 33};
		
		int evenNumber = 0;
		int oddNumber = 0;
		
		
		for(int i = 0; i<arrayNumber.length; i++) {
			if(arrayNumber[i] % 2 == 0) {
				evenNumber++;
			} else {
				oddNumber++;
			}
		}
		
		int[] evenNumberArray = new int[evenNumber];
		int[] oddNumberArray = new int[oddNumber];
		
		int indexEvenNumberArray = 0;
		int indexOddNumberArray = 0;
		
		for(int i = 0; i<arrayNumber.length; i++) {
			if(arrayNumber[i] % 2 == 0) {
				evenNumberArray[indexEvenNumberArray] = arrayNumber[i];
				indexEvenNumberArray++;
			} else {
				oddNumberArray[indexOddNumberArray] = arrayNumber[i];
				indexOddNumberArray++;
			}
		}
		
		System.out.println(evenNumberArray[0]);
		System.out.println(evenNumberArray[1]);
		System.out.println(evenNumberArray[2]);
		System.out.println(evenNumberArray[3]);
		System.out.println(evenNumberArray[4]);
		System.out.println(evenNumberArray[5]);
		System.out.println(oddNumberArray[0]);
		System.out.println(oddNumberArray[1]);
		System.out.println(oddNumberArray[2]);
		System.out.println(oddNumberArray[3]);
		

		
		
	}
}
