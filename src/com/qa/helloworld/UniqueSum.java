package com.qa.helloworld;

public class UniqueSum {

	public static void main(String[] args) {
		System.out.println(input(2,1,2));
	}

	private static int input(int i, int j, int k) {
		
		if (i == j) {
			return k;
		}

		if (i == k) {
			return j;
		}
		
		if (j == k) {
			return i;
		}
		
		if ((i == j) && (i == k) && (j == k)) { 
			return 0;
		} else {
			return i+j+k;
		}
	}

}
