package com.qa.helloworld;

public class IterationFlowCharts2 {

	public static void main(String[] args) {
		
		for (int a = 100; a <= 200; a++) {
			if (a%2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
		
		oneToTen();

	}

	private static void oneToTen() {
		for (int i = 0; i < 10; i++) {
			for (int nums = 0; nums < 10; nums++) {
				System.out.println(nums+1);
			}
		}
		
	}
	
	

}
