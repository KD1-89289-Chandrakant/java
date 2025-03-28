package com.assignment;

import java.util.Scanner;

public class assignment1_Q2 {
	
	static void avg(double num1, double num2) {
		double avg = (num1 + num2) /2;
		
		System.out.println("Average of both the number is  : " + avg);
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double num1, num2;

		System.out.println("enter value");

		if (!sc.hasNextInt()) {
			num1 = sc.nextDouble();

			System.out.println("enter second value");
			if (!sc.hasNextInt()) {
				num2 = sc.nextDouble();
				
//				assignment1_Q2.avg(num1 ,num2);   use this when u want to call static method from another class/paackage 
				avg(num1 ,num2);
				
			} else {
				System.out.println("invalid input");
			}

			System.out.println("all inputs are double");

		}

		else {
			System.out.println("invalid input");
		}	
		sc.close();
	}

}
