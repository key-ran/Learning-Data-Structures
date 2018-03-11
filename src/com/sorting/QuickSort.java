package com.sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array = { 7, 4, 1, 2, 9, 8, 3, 5, 6, 0 };
		Integer[] sorted = new Integer[array.length];

		System.out.print("Initial Array - ");
		printArray(array);

		// Call the quickSort() method to sort the Integer array
		sorted = quickSort(array, 0, array.length - 1);

		for (int index = 0; index < sorted.length; index++) {
			System.out.println("sorted[" + index + "] : " + sorted[index]);
		}

	}

	private static int partition(Integer[] array, int left, int right) {
		int pivot = array[right];
		int i = (left - 1);
		for (int j = left; j < right; j++) {
			if (array[j] <= pivot) {
				i++;

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		int temp = array[i + 1];
		array[i + 1] = array[right];
		array[right] = temp;

		return i + 1;
	}

	private static Integer[] quickSort(Integer array[], int left, int right) {
		// TODO Auto-generated method stub
		if (left < right) {
			int pivot = partition(array, left, right);

			quickSort(array, left, pivot - 1);
			quickSort(array, pivot + 1, right);
		}
		return array;
	}

	private static void printArray(Integer array[]) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; ++i) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
