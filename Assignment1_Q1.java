package com.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1_Q1 {

	public static void main(String[] args) {
		
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		Integer b = a;

		
		System.out.println("Binary equivalent : " + 
		Integer.toBinaryString(a)+"  Octal equivalent  :"+Integer.toOctalString(a)+
		" Hexadecimal equivalent  :"+Integer.toHexString(a));

	}

}
