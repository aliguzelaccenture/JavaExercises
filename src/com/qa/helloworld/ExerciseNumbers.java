package com.qa.helloworld;

public class ExerciseNumbers {

	public static void main(String[] args) {
		
//		System.out.println(addDigits(52));
		System.out.println(7%10);
		System.out.println(45637/10%10);
		System.out.println(45637/100%10);
//		countDigits(555);
//		
//		stringDigits(68);
//		
//		countDigits(234);

	}
	
	private static int addDigits(int i) {
		System.out.println(i);
		return ((i/10)%10)+(i%10);
	}

	private static void countDigits(int i) {
		int tmp = i;
		int count = 0;
		int ones,tens,hundreds,thousands,tenthousands;
		
		for (; tmp != 0; tmp /= 10, ++count) {
			if (i == 1) {
				System.out.println("One");
			}
			
	    }
		System.out.println(count);
		
	}

	private static void stringDigits(int stringDigits) {
		
		
	}

	
	
	

}
