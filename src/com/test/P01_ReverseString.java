package com.test;

public class P01_ReverseString {

	public static void main(String[] args) {

		String str = "ABCD";
		String revStr = "";

		System.out.println("Original string : " + str);

		// Traverse from last index
		for (int i = str.length() - 1; i >= 0; i--) {

			// Store the updated string in revStr
			revStr += str.charAt(i);
		}
		System.out.println("Reverse string : " + revStr);
	}
}
