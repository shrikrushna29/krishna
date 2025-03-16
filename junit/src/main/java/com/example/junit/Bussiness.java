package com.example.junit;

public class Bussiness {

	public static void checkCondition(String input) {
		if (input.equals("QA")) {
			System.out.println("QA");
		} else if (input.equals("Dev")) {
			System.out.println("Dev");
		} else {
			System.out.println("Invalid Input");
		}
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * //checkCondition("QA"); // Output: QA checkCondition("Devyyy"); // Output:
	 * Dev //checkCondition("test"); }
	 */

}
