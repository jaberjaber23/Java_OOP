package binaryToDigital;

/*
 *  this class is to print user number in the digital format 
 *  the methods is to print all the number form top to the bottom
 *  starting from first rows and jumping to the next rows after print all the column
 */
   
public class DecimalToDigital {
	static int[] headerAbove_ = { 0, 2, 3, 5, 6, 7, 8, 9 }; // for numbers with a header line
	static int[] upperLeftLine = { 0, 4, 5, 6, 8, 9 }; // for numbers with a left upper line
	static int[] middleLine_ = { 2, 3, 4, 5, 6, 8, 9 }; // for numbers with middle line
	static int[] middleLineSpace = { 0, 1, 7 }; // for numbers with space in the middle
	static int[] upperRightLine = { 0, 1, 2, 3, 4, 7, 8, 9 };// for numbers with upper right line
	static int[] lowerLeftLine = { 0, 2, 6, 8 }; // for numbers with lower lift line
	static int[] lowerMiddleLine = { 0, 2, 3, 5, 6, 8, 9 }; // for numbers with lower middle line
	static int[] lowerMiddleSpace = { 1, 4, 7 }; // for numbers with lower middle space
	static int[] lowerRightLine = { 0, 1, 3, 4, 5, 6, 7, 8, 9 }; // for numbers with lower right line

	static void digitalForm(int numberCheck) {
		int[] numberCheckArray = ReverseNumber.reverse(numberCheck); // to reverse the number
		int exitLoop = 0, remainder = 0, numberCount;
		boolean test = true;
		numberCount = countNumbers(numberCheck); // to count how many digits in the number
		
		while (exitLoop < numberCount) { // for the first line
			test = true; // to check it is a space or line
			remainder = numberCheckArray[exitLoop]; // print the number starting from top to bottom

			for (int i = 0; i < headerAbove_.length; i++) {
				if (remainder == headerAbove_[i]) {
					firstLine();
					test = false; // if the number has a line we should jumping in the space condition
				}
			}
			if (test) // space condition
				System.out.print("   ");
			exitLoop++; // to exit from loop if we checked all the number
		}

		exitLoop = 0; // to refresh the condition
		System.out.println(); // moving to the next line of the digit form

		while (exitLoop < numberCount) { // second line
			test = true; // refresh the space condition
			remainder = numberCheckArray[exitLoop];
			for (int i = 0; i < upperLeftLine.length; i++) {
				if (remainder == upperLeftLine[i]) {
					secondLine1(); // for the left upper line
					test = false;
				}
			}
			if (test)
				System.out.print(" ");

			for (int i = 0; i < middleLine_.length; i++) {
				if (remainder == middleLine_[i])
					secondLine2(); // for the middle line
			}

			for (int i = 0; i < middleLineSpace.length; i++) {
				if (remainder == middleLineSpace[i])
					System.out.print(" ");
			}

			test = true;
			for (int i = 0; i < upperRightLine.length; i++) {
				if (remainder == upperRightLine[i]) {
					secondLine3(); // for upper right line
					test = false;
				}
			}

			if (test) // space condition
				System.out.print(" ");
			exitLoop++;
		}

		exitLoop = 0; // refresh the condition
		System.out.println(); // moving to the last line which is the third line

		while (exitLoop < numberCount) {
			remainder = numberCheckArray[exitLoop];
			test = true;
			for (int i = 0; i < lowerLeftLine.length; i++) {
				if (remainder == lowerLeftLine[i]) {
					thirdLine1(); // to print lower left line
					test = false;
				}
			}

			if (test)
				System.out.print(" ");

			for (int i = 0; i < lowerMiddleLine.length; i++) {
				if (remainder == lowerMiddleLine[i])
					thirdLine2(); // to print lower middle line
			}

			for (int i = 0; i < lowerMiddleSpace.length; i++) {
				if (remainder == lowerMiddleSpace[i])
					System.out.print(" ");
			}

			test = true;
			for (int i = 0; i < lowerRightLine.length; i++) {
				if (remainder == lowerRightLine[i]) {
					thirdLine3(); // to print lower right line
					test = false;
				}
			}
			if (test)
				System.out.print(" ");

			exitLoop++;
		}
	}

	private static void firstLine() {
		System.out.print(" _ ");
	}

	private static void secondLine1() {
		System.out.print("|");
	}

	private static void secondLine2() {
		System.out.print("_");
	}

	private static void secondLine3() {
		System.out.print("|");
	}

	private static void thirdLine1() {
		System.out.print("|");
	}

	private static void thirdLine2() {
		System.out.print("_");
	}

	private static void thirdLine3() {
		System.out.print("|");
	}

	public static int countNumbers(int number) { // to count how many digits in the number
		int theNumberCount = 0;
		while (number != 0) {
			theNumberCount++;
			number = number / 10;
		}
		return theNumberCount;
	}

}
