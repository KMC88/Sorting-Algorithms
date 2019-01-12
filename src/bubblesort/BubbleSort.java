package bubblesort;

public class BubbleSort {

	/**
	 * Sorts a given array of integers in ascending order using the bubble sort
	 * algorithm and returns the sorted array
	 * 
	 * @param arr
	 */
	public static int[] bubbleSortAsc(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) { // arr.length-1 because sort will not need more iterations

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) { // comparing adjacent elements in array and swapping them if necessary
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * Sorts a given array of integers in descending order using the bubble sort
	 * algorithm and returns the sorted array
	 * 
	 * @param arr
	 */
	public static int[] bubbleSortDesc(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) { // arr.length-1 because sort will not need more iterations

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) { // comparing adjacent elements in array and swapping them if necessary
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
