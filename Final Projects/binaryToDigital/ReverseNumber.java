package binaryToDigital;

/* this class is to reverse the number because when i print the number in digital form the remainder
 * starting from the last digits  
 * */
public class ReverseNumber {

	public static int[] reverse(int number) {
		int numberCounter = DecimalToDigital.countNumbers(number); // to check how many digits in the number
		int[] numberCheckerArray = new int[numberCounter]; // Separating digits into an array
		for (int i = numberCounter - 1; i >= 0; i--) {
			numberCheckerArray[i] = number % 10; // for instance 123 % 10 = 3 and we save the last digits in the first
													// index in the array
			number = number / 10; // moving to the number before it
		}
		return numberCheckerArray; // return an array to print the numbers
	}

}
