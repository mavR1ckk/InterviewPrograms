package com.test;

import java.util.Arrays;

public class P04_SecondLargestArray {

	public static void main(String[] args) {

		// Way 1
		// Sort array without using Arrays.sort
		Integer[] arr = { 1, 2, 8, 10, 8, 5, 9, 12, 25 };

		for (int i = 0; i<arr.length; i++) {

			for (int j = i+1; j<arr.length; j++) {

				int tmp = 0;

				if (arr[i]>arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(arr[arr.length-2]);

		// Way 2nd using arrays.sort method
		Integer[] arr1 = { 8, 6, 8, 41, 02, 57, 8, 9, 21 };
		
		Arrays.sort(arr1);
		System.out.println(arr1[arr1.length-2]);
	}
}