package com.qa.helloworld;

public class Taxes {

	public static void main(String[] args) {
		double salary = 50000;
		System.out.println("Salary: " + salary);
		System.out.println("Tax Bracket: " + taxPercentageCalculator(salary) + "%");
		System.out.println("Total Tax Payable: " + taxAmount(salary));

	}

	private static double taxAmount(double i) {
		return (taxPercentageCalculator(i)/100) * i;
		
	}

	private static double taxPercentageCalculator(double i) {
		
		if (i > 14999) {
			if (i <= 19999) {
				return 10;
			} else {
				if (i <= 29999) {
					return 15;
				}
				else {
					if (i <= 44999) {
						return 20;
					} else {
						return 25;
					}
				}
			}
			
		} else {
			return 0;
		}
	}
	
	

}
