package com.qa.helloworld;

import java.util.ArrayList;

public class ExerciseArrays {

	public static void main(String[] args) {
		String names[] = {"Ali", "Advith", "Anne", "Alina", "Aleena"};
		String favColour[] = {"Red", "Blue", "Black", "White", "Pink"};
		int favNumber[] = {2,4,6,8,10};
		boolean likesPineappleOnPizza[] = {true,false,false,false,false};
		
		System.out.println(names[0] + "'s favourite colour is " + favColour[0] + ".");
		System.out.println(names[1] + "'s favourite colour is " + favColour[1] + ".");
		System.out.println(names[2] + "'s favourite number is " + favNumber[2] + ".");
		System.out.println(names[3] + "'s favourite number is " + favNumber[3] + ".");
		System.out.println(names[4] + " likes having pineapple on their pizza?: " + likesPineappleOnPizza[4] + ".");
		likesPineappleOnPizza[4] = true;
		System.out.println(names[4] + " has changed their mind, pineapple on pizza preference is now: " + likesPineappleOnPizza[4] + ".");
		
		System.out.println(names[2] + " and " + names[3] + " prefer to square their favourite numbers.");
		favNumber[2] *= favNumber[2];
		favNumber[3] *= favNumber[3];
		System.out.println(names[2] + "'s new favourite number is " + favNumber[2] + ".");
		System.out.println(names[3] + "'s new favourite number is " + favNumber[3] + ".");
		
		
		// FOR EACH, create variable for each element
		for (int i : favNumber) {
			System.out.println(i);
		}
		
		ArrayList<String> pizzaList = new ArrayList<String>();
		
		pizzaList.add("Large Stonebaked Tomato Based Chicken Pizza");
		pizzaList.add("Medium Thick BBQ Based Pineapple and Ham Pizza");
		
		System.out.println(pizzaList.get(1));
		
		pizzaList.set(0, "Large Thick Tomato Based Chicken Pizza"); 
		System.out.println(pizzaList.get(0));
		
	
	}

}
