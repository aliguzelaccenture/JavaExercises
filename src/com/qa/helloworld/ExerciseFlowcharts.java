package com.qa.helloworld;

public class ExerciseFlowcharts {

	public static void main(String[] args) {
		System.out.println(flowchart(5,5,false));

	}

	private static int flowchart(int i, int j, boolean b) {
		if (b) {
			return i+j;
		} else {
			return i*j;
		}
		
	}

}
