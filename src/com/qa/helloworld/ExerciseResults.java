package com.qa.helloworld;

public class ExerciseResults {
	public static void main(String[] args) {
		int physics = 150;
		int chemistry = 120;
		int biology = 130;
		
		results(physics, chemistry, biology);
		resultsPercentage(physics, chemistry, biology);
	}

	private static void resultsPercentage(int physics, int chemistry, int biology) {
		double percentageTotal = ((physics + chemistry + biology) * 100)/450;
		System.out.println("Percentage: " + percentageTotal + "%");
		
	}

	private static void results(int physics, int chemistry, int biology) {
		int total = physics + chemistry + biology;
		System.out.println("Physics: " + physics);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Biology: " + biology);
		System.out.println("Total Score: " + total);
	}
}
