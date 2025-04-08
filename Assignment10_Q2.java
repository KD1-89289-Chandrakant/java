package com.assignment;

import java.util.stream.IntStream;

public class Assignment10_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int start = 1;
	        int end = 10; // Change this to any range you want

	        int sum = IntStream.rangeClosed(start, end)
	                           .sum();

	        System.out.println("Sum of integers from " + start + " to " + end + " is: " + sum);

	}

}
