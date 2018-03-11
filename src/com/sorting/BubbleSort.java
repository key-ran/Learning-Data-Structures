package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array = new Integer[] { 1, 4, 7, 2, 9, 0, 8, 3, 5, 6 };
		Integer[] sorted = new Integer[array.length];

		// Call the bubbleSort() method to sort the Integer array
		sorted = bubbleSort(array);

		for (int index = 0; index < sorted.length; index++) {
			System.out.println("sorted[" + index + "] : " + sorted[index]);
		}

	}

	private static Integer[] bubbleSort(Integer[] array) {
		// TODO Auto-generated method stub
		boolean flag = true;
		if (array.length == 0) {
			return null;
		} else if (array.length == 1) {
			return array;
		} else {
			int temp = 0;
			for (int index = 1; index < array.length; index++) {
				if (array[index - 1] > array[index]) {
					temp = array[index];
					array[index] = array[index - 1];
					array[index - 1] = temp;
					flag = false;
				}
			}
			if (!flag) {
				// Recursive call to complete iterations
				array = bubbleSort(array);
			}

		}

		return array;
	}

}
