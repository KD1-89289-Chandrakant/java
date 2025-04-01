package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void displayAll(Fruit[] fruitBasket) {
		for (int i = 0; i < fruitBasket.length; i++) {
			System.out.println(fruitBasket[i].toString());
			System.out.println("Taste is : " + fruitBasket[i].taste());
		}

	}

	private static void displayStaleFruits(Fruit[] fruitBasket) {

		boolean staleFound = false;
		for (int i = 0; i < fruitBasket.length; i++) {
			if (fruitBasket[i].isFresh() == false) {
				System.out.println(fruitBasket[i].toString());
				System.out.println("Taste is : " + fruitBasket[i].taste());
			}
		}
		if (staleFound == true) {
			System.out.println("No stale fruits found in the basket");
		}

	}

	public static void makeFruitStale(Fruit[] fruitBasket, int n) {
		if (fruitBasket == null) {
			System.out.println("Error: Fruit basket is null");
			return;
		}

		if (n < 0 || n >= fruitBasket.length) {
			System.out.println("Error: Invalid index " + n + ". Must be between 0 and " + (fruitBasket.length - 1));
			return;
		}

		if (fruitBasket[n] == null) {
			System.out.println("Error: No fruit exists at index " + n);
			return;
		}

		fruitBasket[n].setFresh(false);
		System.out.println(fruitBasket[n].getName() + " at index " + n + " has been marked stale");
	}

	public static void markSourFruitStale(Fruit[] fruitBasket) {
		for (int i = 0; i < fruitBasket.length; i++) {
			if (fruitBasket[i].taste().equals("sour")) {
				fruitBasket[i].setFresh(false);
			}
		}
		System.out.println("All sour fruits marked stale");
	}

	public static int menu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("********************");
		System.out.println("0: Exit");
		System.out.println("1: Add Mango");
		System.out.println("2: Add Apple");
		System.out.println("3: Add Orange");
		System.out.println("4: Display all Fruits in Basket");
		System.out.println("5: Display all Stale Fruits in Basket");
		System.out.println("6: Mark a fruit as stale");
		System.out.println("7: Mark all sour fruits stale");

		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre Basket size : ");

		int n = sc.nextInt();
		int count = 0;
		int number;

		Fruit[] fruitBasket = new Fruit[n];

		while ((number = menu()) != 0) {

			switch (number) {
			case 1:
				fruitBasket[count] = new Mango();
				fruitBasket[count].accept();
				System.out.println(fruitBasket[count].toString());
				fruitBasket[count].toString();
				fruitBasket[count].taste();
				count++;
				break;

			case 2:
				fruitBasket[count] = new Apple();
				fruitBasket[count].accept();
				count++;
				break;

			case 3:
				fruitBasket[count] = new Orange();
				fruitBasket[count].accept();
				count++;
				break;

			case 4:
				displayAll(fruitBasket);
				break;

			case 5:
				displayStaleFruits(fruitBasket);
				break;

			case 6:
				Scanner sc1 = new Scanner(System.in);
				System.out.println(" Mark a fruit as stale input index :");
				int n1 = sc1.nextInt();
				makeFruitStale(fruitBasket, n1);
				break;

			case 7:
				markSourFruitStale(fruitBasket);
				break;

			default:
				System.out.println("invalid input ");
				break;
			}

		}

	}

}
