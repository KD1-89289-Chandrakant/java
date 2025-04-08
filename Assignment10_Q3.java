package com.assignment;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Assignment10_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   IntStream stream = IntStream.rangeClosed(1, 10);

        // Calculate sum
        int sum = stream.sum();
        System.out.println("Sum: " + sum);

        // To call summaryStatistics, we need a new stream (streams can't be reused)
        IntStream stream2 = IntStream.rangeClosed(1, 10);
        IntSummaryStatistics stats = stream2.summaryStatistics();

        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());

	}

}
