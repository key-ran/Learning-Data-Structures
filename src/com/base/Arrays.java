package com.base;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring an Array
		boolean[] booleanArray; // or boolean byteArray[];

		Integer[] integerArray; // or Integer integerArray[];
		Double[] doubleArray;
		Float[] floatArray = new Float[] { 1.0f, 2.5f, 3.9f, 4.1f, 5.7f, 6.0f, 7.2f, 8.3f, 9.6f, 10.3f };

		// Initializing an Array
		booleanArray = new boolean[2];
		// booleanArray - Holds up to 2 elements of boolean type

		integerArray = new Integer[10];
		// integerArray - Holds up to 10 elements of Integer type

		doubleArray = new Double[integerArray.length];
		// doubleArray - Holds up to 10 elements of Double type

		// static initialization
		booleanArray[0] = true;
		booleanArray[1] = false;

		System.out.println("#################################################");
		// Element at index 0 of booleanArray
		System.out.println("booleanArray[0] : " + booleanArray[0]);

		// Element at index 1 of booleanArray
		System.out.println("booleanArray[1] : " + booleanArray[1]);

		System.out.println("#################################################");
		// Length of array
		System.out.println("doubleArray.length : " + doubleArray.length);

		System.out.println("#################################################");
		// Array Object
		System.out.println("integerArray : " + integerArray);

		System.out.println("#################################################");
		System.out.println("FloatArray contents listed below : ");
		// Iterating through floatArray
		int index = 0;
		for (index = 0; index < floatArray.length; index++) {
			System.out.println("floatArray[" + index + "] : " + floatArray[index]);
		}
		System.out.println("#################################################");

		Float searchVal = 7.2f;
		index = findElement(floatArray, searchVal);

	}

	public static int findElement(Float[] floatArray, Float searchVal) {
		int position = 0;

		// Find index of element in floatArray (Linear Search / Sequential)
		for (Float element : floatArray) {
			if (element.equals(searchVal)) {
				System.out.println("Element " + searchVal + " found at floatArray[" + position + "]");
			} else {
				position++;
			}
		}
		if (position == floatArray.length) {
			System.out.println("Element " + searchVal + " is not present in floatArray");
		}
		return position;
	}

}
