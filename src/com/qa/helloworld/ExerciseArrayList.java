package com.qa.helloworld;

import java.util.ArrayList;

public class ExerciseArrayList {
	
	public static ArrayList<String> ordersArray = new ArrayList<String>();
	public static ArrayList<String> doneOrdersArray = new ArrayList<String>();
	public static int dailyOrderCounter = 0;

	public static void main(String[] args) {
		
		
		addNewOrder("Mocha");
		getOrder(0);
		changeOrder(0,"Flat White");
		getOrder(0);
		orderCompleted(0);
		addNewOrder("Small Espresso w/ Chocolate");
		addNewOrder("Large Cold Brew w/ double shot");
		addNewOrder("Medium Cappucino w/ Oat Milk");
		addNewOrder("Medium Flat White");
		addNewOrder("Large Choc Cookie Frappe w/ sugar free syrup");
		addNewOrder("Small Caramel Iced Latte w/ honeycomb dust");
		addNewOrder("Small Americano");
		addNewOrder("Large Cafe Au Lait w/ extra milk");
		addNewOrder("Medium Strawberry Iced Tea");
		orderCompleted(1);
		orderCompleted(0);
		orderCompleted(1);
		orderCompleted(0);
		checkAllOrderLists();
		resetAllOrderLists();
		checkAllOrderLists();

	}

	private static void resetAllOrderLists() {
		ordersArray.clear();
		doneOrdersArray.clear();
		
	}

	private static void checkAllOrderLists() {
		System.out.println("Current Orders: " + (ordersArray.size()) + ". Completed Orders: " + (doneOrdersArray.size()));
		
	}

	private static void orderCompleted(int i) {
		System.out.println("Order Reference: " + i + " " + ordersArray.get(i) + " (" + (doneOrdersArray.size() + 1) + ") " + "completed.");
		doneOrdersArray.add(i + ": " + ordersArray.get(i));
		ordersArray.remove(i);
		
	}

	private static void changeOrder(int i, String string) {
		System.out.println("Order Reference: " + i + " from " + ordersArray.get(i) + " to " + string);
		ordersArray.set(i,string);
		
	}

	private static void getOrder(int i) {
		System.out.println("Order Reference: " + i + " is: " +  ordersArray.get(i));
		
	}

	private static void addNewOrder(String string) {
		ordersArray.add(string);
		dailyOrderCounter++;
		System.out.println("Order Reference: " + (ordersArray.size() - 1) + " - Order Added: " + string + " (" + dailyOrderCounter + ")");
	}
	
	

}
