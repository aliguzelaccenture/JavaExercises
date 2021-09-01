package com.qa.helloworld;

public class PizzaLoop {

	public static void main(String[] args) {
		
		
		for (int pizza = 4; pizza >=0 ; pizza--) {
			System.out.println("---NEW PIZZA---");
			for (int pizzaSlices = 8; pizzaSlices >=0 ; pizzaSlices--) {
				if (pizzaSlices <= 2) {
					System.out.println("WARNING: Time to get another pizza!");
				}
				System.out.println("1 Pizza Slice Eaten, " + pizzaSlices + " left.");
			}
			
			
			if (pizza == 1) {
				System.out.println("---Only 1 Pizza Left!---");
			}
		}

	}
	
}
