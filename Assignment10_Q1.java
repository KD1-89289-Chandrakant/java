package com.assignment;

import java.util.stream.IntStream;

class FactorialWithStream {
    public static long factorial(int n) {
        return IntStream.rangeClosed(1, n)
                        .reduce(1, (a, b) -> a * b);
    }
}

public class Assignment10_Q1 {
	 public static void main(String[] args) {
	
	 int num = 5; // Change this to any number
     long result = FactorialWithStream.factorial(num);
     System.out.println("Factorial of " + num + " is: " + result);
     }
}
