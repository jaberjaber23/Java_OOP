package practice;

public class Bubble_Sort {

	public static void main(String[] args) {
		int[] bubbleArr = new int[] { 5, 14, 8, 96, 24, 11, 2, 34 }; // Bubble Sort
		int swap = 0; // used to swap only
		
		System.out.print("The array before swaping :"); //|
		for(int x : bubbleArr)                          //|==> To print how the array before swapping
			System.out.print(" " + x);	                //|
		System.out.println();                           //|
		System.out.println("................................................");
		
		for (int i = 0; i < bubbleArr.length - 1; i++) // to check other numbers in array if there on the wrong order
		{
			for (int j = 0; j < bubbleArr.length - 1; j++) // first loop 
			{
				if (bubbleArr[j] > bubbleArr[j + 1]) // to check adjacent elements if they are in wrong order
				{
					swap = bubbleArr[j + 1];
					bubbleArr[j + 1] = bubbleArr[j];
					bubbleArr[j] = swap;
				}
			}
		}
		System.out.print("The array after swaping  :"); //|
		for(int x : bubbleArr)                         //|==> to print how the array after swapping 
			System.out.print(" " + x);                 //| 
	}
}
