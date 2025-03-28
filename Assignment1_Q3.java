package com.assignment;

import java.util.Scanner;

public class Assignment1_Q3 {

	public static int menu() {
		int choice;

		Scanner sc = new Scanner(System.in);
		System.out.println("********************************");
		System.out.println("0: Exit");
		System.out.println("1: Idli (Price - 60)");
		System.out.println("2: Dosa (Price - 500)");
		System.out.println("3: Samosa (Price - 100)");
		System.out.println("4: Generate Bill");
		System.out.println("Enter your choice");
		System.out.println("********************************");

		choice = sc.nextInt();
		return choice;

	}

	public static void main(String[] args) {
//		System.out.println(menu());
		Scanner sc = new Scanner(System.in);
		
		int number ;
		int totalBill = 0 ;
		
		while ((number = menu()) != 0) {
			
			switch (number) {
			case 1:
				System.out.println("Enter Quantity of Idli : ");
				int a = sc.nextInt();
			    totalBill = totalBill + (60*a);
				break;
				
			case 2:
				System.out.println("Enter Quantity of Dosa : ");
				int b = sc.nextInt();
			    totalBill = totalBill + (500*b);
				break;
				
			case 3:
				System.out.println("Enter Quantity of Samosa : ");
				int c = sc.nextInt();
			    totalBill = totalBill + (100*c);
				break;
				
			case 4 :
				System.out.println("Total Bill is : " + totalBill);
				break;

			default:
			  System.out.println("invalid input");
				break;
			}
		}

	}

}
