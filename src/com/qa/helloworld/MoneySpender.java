package com.qa.helloworld;

public class MoneySpender {

	public static void main(String[] args) {
		int money = 55;
		boolean moneyBool = true;
		
		System.out.println("SPENDING MONEY..");
		
//		while (moneyBool) {
//			money--;
//			System.out.println("Account Balance: " + money);
//			if (money <= 50) {
//				System.out.println("Account Limit Reached");
//				System.out.println("STOP SPENDING MONEY");
//				moneyBool = false;
//				System.out.println("Account Locked");
//			}
//		}
		
		do {
			money--;
			System.out.println("Account Balance: " + money);
			if (money <= 50) {
				System.out.println("Account Limit Reached");
				System.out.println("STOP SPENDING MONEY");
				moneyBool = false;
				System.out.println("Account Locked");
			}	
		} while (moneyBool);

	}

}
