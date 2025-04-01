package com.app.fruits;

import java.util.Scanner;

abstract class Fruit {
	public String color;
	public String name;
	public double weight;
	public boolean isFresh = true;

//	For class/instance fields: boolean defaults to false 
//	For local variables: No default value (must be initialized 
//	explicitly, or compiler error occurs)

	public Fruit() {
		System.out.println("Fruit parameterless constructor");
	}

	public Fruit(String color, String name, double weight, boolean isFresh) {
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.isFresh = isFresh;
		System.out.println("Fruit parameterized constructor");
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter fruit name : ");
		this.name = sc.nextLine(); 
		System.out.println("Enter colour name : ");
		this.color = sc.nextLine(); 
		System.out.println("Enter weight : ");
		this.weight = sc.nextInt(); 
		System.out.println("Is fruit fresh : ");
		this.isFresh = sc.nextBoolean(); 
		
	}
	
	public abstract String taste();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", name=" + name + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}

}
