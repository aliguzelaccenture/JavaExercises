package com.qa.helloworld;

import java.util.Random;

public class DiceStack {

	public static void main(String[] args) {
		methodStack1();
		methodStack2();
		methodStack3();
	}

	private static void methodStack1() {
		int total = 0;
		total += rollDie(6);
		total += rollDie(6);
		total += rollDie(6);
		total += rollDie(6);
		System.out.println("4 x 6 sided dice: " + total);
	}
	
	private static void methodStack2() {
		int total = 0;
		total += rollDie(6);
		total += rollDie(6);
		total += rollDie(6);
		total += rollDie(8);
		total += rollDie(8);
		System.out.println("3 x 6 sided dice + 2 x 8 sided dice: " + total);
	}
	
	private static void methodStack3() {
		int total = 0;
		total += rollDie(2);
		total += rollDie(3);
		total += rollDie(4);
		total += rollDie(5);
		total += rollDie(6);
		total -= rollDie(7);
		System.out.println("2,3,4,5,6 sided dice - 7 sided dice: " + total);
	}

	private static int rollDie(int i) {
		return (new Random().nextInt(i)) + 1;
		
	}
	
}
