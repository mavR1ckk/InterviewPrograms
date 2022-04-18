package com.test;

public class P02_SwapNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Before swap >> a: " + a + " b: " + b);
		a = a + b; // 30
		b = a - b; // 30-20=10
		a = a - b; // 30-10=20

		System.out.println("After swap >> a: " + a + " b: " + b);
	}
}
