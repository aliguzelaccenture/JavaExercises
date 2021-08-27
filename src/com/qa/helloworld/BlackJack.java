package com.qa.helloworld;

public class BlackJack {

	public static void main(String[] args) {
		System.out.println(play(22,18));

	}

	private static int play(int i, int j) {
		if ((i <= 21) || (j <= 21)) {
			if ((i <= 21) && (j <= 21)) {
				if (i>j) {
					return i;
				} else {
					return j;
				}
			}
			
			if (i<=21) {
				return i;
			} else {
				return j;
			}
		}
		else {
			return 0;
		}

	}

}
