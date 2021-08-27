package com.qa.helloworld;

public class GreatestCommonDivsor {

	public static void main(String[] args) {
		System.out.println(calculateGCD(6,12));

	}

	private static int calculateGCD(int i, int j) {
		int gcd = 0;
		for(int n = 1; n <= i && n <= j; n++)  
		{    
			if(i%n==0 && j%n==0) {
				gcd = n; 
			} 
		} 
		return gcd;
	}

}
