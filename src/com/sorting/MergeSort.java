package com.sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array = new Integer[] { 7, 4, 1, 2, 9, 8, 3, 5, 6 };
		Integer[] sorted = new Integer[array.length];

		System.out.print("Initial Array - ");
		printArray(array);

		// Call the mergeSort() method to sort the Integer array
		sorted = mergeSort(array, 0, array.length - 1);

		for (int index = 0; index < sorted.length; index++) {
			System.out.println("sorted[" + index + "] : " + sorted[index]);
		}

	}

	private static Integer[] mergeSort(Integer[] array, int left, int right) {
		// TODO Auto-generated method stub
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			System.out.println("left-" + left + " mid-" + mid + " right-" + right);
			merge(array, left, mid, right);
		}
		return array;
	}

	private static void merge(Integer array[], int left, int mid, int right) {
		// TODO Auto-generated method stub
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int lList[] = new int[n1];
		int rList[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			lList[i] = array[left + i];
		for (int j = 0; j < n2; ++j)
			rList[j] = array[mid + 1 + j];

		int i = 0, j = 0;

		int k = left;
		while (i < n1 && j < n2) {
			if (lList[i] <= rList[j]) {
				array[k] = lList[i];
				i++;
			} else {
				array[k] = rList[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = lList[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = rList[j];
			j++;
			k++;
		}
	}

	private static void printArray(Integer[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; ++i) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
