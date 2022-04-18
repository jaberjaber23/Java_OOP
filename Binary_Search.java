package practice;

public class Binary_Search {

	public static void main(String[] args) {
		int[] binaryArr = new int[] { 2, 6, 8, 12, 16, 20, 24, 26, 40, 50 }; // Binary Array
		int left = 0, right = binaryArr.length - 1, mid = (left + right) / 2, key = 24;
		boolean found_notFound = false; // To make the condition (true) if the number is found in the array
		while (right > left) {
			if (binaryArr[mid] == key)
			{
				found_notFound = true;
				break; // the number has been found
			}			
			 else if (binaryArr[mid] > key) 
				right = mid - 1;  // because the number is greater than the number in the middle
			
			 else if (binaryArr[mid] < key) 
				left = mid + 1;  // because the number is smaller than the number in the middle
			
			 else 
				break; // the number has not been found 
			
			mid = (left + right) / 2;
		}
		if (found_notFound)
			System.out.println("the number has been found!");
		else
			System.out.println("the number has not been found!!");
	}

}
