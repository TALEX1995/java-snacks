package org.lessons.java;

public class Snack6 {

	public static void main(String[] args) {
		
		String strNumber = "269";
		int intNumber = 0;
		
		
		for (int i = 0; i < strNumber.length(); i++) {
	        char currentChar = strNumber.charAt(i);

	        switch (i) {
	            case 0:
	                intNumber = currentChar - '0';
	                break;
	            default:
	                intNumber = intNumber * 10 + (currentChar - '0');
	                break;
	        }
		}
		
		System.out.println(intNumber);

	}

}
