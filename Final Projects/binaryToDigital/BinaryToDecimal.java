package binaryToDigital;
/*
 *this class is to convert the number from binary form to decimal form
 */

public class BinaryToDecimal {
	private static int power = 1, remainder = 0, theDecimalNumber = 0;

	public static int getPower() { // power getter
		return power;
	}

	public static void setPower(int power) { // power setter
		BinaryToDecimal.power = power;
	}

	public static int getRemainder() { // remainder getter
		return remainder;
	}

	public static void setRemainder(int remainder) { // remainder setter
		BinaryToDecimal.remainder = remainder;
	}

	public static int getTheDecimalNumber() { // thDecimalNumber getter
		return theDecimalNumber;
	}

	public static void setTheDecimalNumber(int theDecimalNumber) { // theDecimalNumber setter
		BinaryToDecimal.theDecimalNumber = theDecimalNumber;
	}

	static int dicimalCal(int binaryNumber) {
		while (binaryNumber != 0) {
			remainder = binaryNumber % 10; // to check if the last number = 1 or 0
			theDecimalNumber = theDecimalNumber + (remainder * power); // if the number = 0 we should skip the number
																		// and move to the next number
			power = power * 2; // the power of the binary number (128 64 32 16 8 4 2 1)
			binaryNumber = binaryNumber / 10; // moving to the next number
		}
		return theDecimalNumber; // return the decimal number
	}
}
