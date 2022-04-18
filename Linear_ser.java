package practice;

public class Linear_ser {

	public static void main(String[] args) {
		int[] linearArr = new int[] { 5, 9, 1, 78, 26, 41, 7, 4, 32, 16, 7 }; // Linear array
		int counter = 0, key = 10; // To calculate how many repetitions number .. (key = input)
		boolean found_notFound = false; // To make the condition (true) if the number is found in the array
		for (int i = 0; i < linearArr.length; i++) {
			if (linearArr[i] == key) // to check if the number exists or not
			{
				found_notFound = true;
				counter++;
			}
		}
		if (found_notFound)
			System.out.println("It found this number " + counter + " times!");
		else
			System.out.println("Not found!!");
	}

}
