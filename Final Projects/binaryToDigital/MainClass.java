package binaryToDigital;

import java.util.Scanner;

public class MainClass { // Main Class

	public static void main(String[] args) {
		boolean exitWhile = true;
		long binaryNumber = 0;
		int decimalNumber = 0, numberOfDigits = 0;
		do {
			try {
				exitWhile = false;
				Scanner myObj = new Scanner(System.in);
				System.out.print("Please inter a binary number = ");
				binaryNumber = myObj.nextLong(); // to receive user input
				numberOfDigits = calculateDigits(binaryNumber);
				if (numberOfDigits > 10) {
					System.out.println("Please don't enter number have more than 10 digits!");
					exitWhile = true;
				}
			} catch (Exception e) {
				exitWhile = true;
				System.err.println(e.getMessage());
			}
		} while (exitWhile == true);

		decimalNumber = BinaryToDecimal.dicimalCal((int) binaryNumber); // to convert user entry to decimal number
		System.out.println("In binary form = " + binaryNumber);
		System.out.println("In decimal form = " + decimalNumber);
		System.out.println("In digital form >> ");
		DecimalToDigital.digitalForm(decimalNumber); // to convert decimal number to digital form

	}

	static int calculateDigits(long binaryNumber) {
		int theNumberCount = 0;
		while (binaryNumber != 0) {
			theNumberCount++;
			binaryNumber = binaryNumber / 10;
		}
		return theNumberCount;
	}

}
