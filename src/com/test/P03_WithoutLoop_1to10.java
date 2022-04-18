package com.test;

// We will use recursion concept here..
public class P03_WithoutLoop_1to10 {

	public void printElement(int n) {
		
		// Here will check if number is less then 10 or not
		if (n <= 10) {
			System.out.println(n);
			printElement(n + 1);
		}
	}

	public static void main(String[] args) {

		P03_WithoutLoop_1to10 obj = new P03_WithoutLoop_1to10();
		obj.printElement(1);
	}
}
