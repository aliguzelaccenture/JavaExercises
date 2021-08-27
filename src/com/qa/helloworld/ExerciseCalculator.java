package com.qa.helloworld;

public class ExerciseCalculator {

	public static void main(String[] args) {
		System.out.println(addition(5,5));;
		System.out.println(multiplication(5,5));;
		System.out.println(subtraction(5,5));;
		System.out.println(division(10,5));;

	}

	// Revisited with conditional
	private static double division(int i, int j) {
		if (i<j) {
		return i/j;
		} else {
			System.out.print("Divison cannot be performed, returning 0: ");
			return 0;
		}
	}

	private static int subtraction(int i, int j) {
		return i-j;
	}

	private static int multiplication(int i, int j) {
		return i*j;
	}

	private static int addition(int i, int j) {
		return i+j;
		
	}

}
