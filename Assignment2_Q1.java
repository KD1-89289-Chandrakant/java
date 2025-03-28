package com.assignment;

import java.util.Scanner;

class Invoice {
	private String partName;
	private String partDescription;
	private int quantity;
	private double price;

	public Invoice() {

	}

	public Invoice(String partName, String partDescription, int quantity, double price) {

		this.partName = partName;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}

	public void acceptInvoice() {
		Scanner sc = new Scanner(System.in);

		// here this is option but use of this is recommended

		System.out.println("Enter part Name : ");
		this.partName = sc.nextLine();

		System.out.println("Enter part Description : ");
		this.partDescription = sc.nextLine();

		System.out.println("Enter part quantity : ");
		this.quantity = sc.nextInt();
		
		if (quantity <0) {
			quantity = 0;
		} 
		
		System.out.println("Enter part price : ");
		this.price = sc.nextDouble();
		
		if (price< 0) {
			this.price = 0.0;
		} 

	}

	public void diaplyInvoice() {
		System.out.println("Enter part Name : " + partName);
		System.out.println("Enter part Description : " + partDescription);
		System.out.println("Enter part quantity : " + quantity);
		System.out.println("Enter part price : " + price);

	}

	public double invoiceTotalAmount(int quantity, double price) {
	
		double a = quantity * price;
		return a;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

public class Assignment2_Q1 {

	public static void main(String[] args) {

		Invoice i = new Invoice();
		i.acceptInvoice();
		i.diaplyInvoice();
		System.out.println("Generated Bill is  : " + i.invoiceTotalAmount(i.getQuantity(), i.getPrice()));

	}

}
