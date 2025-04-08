package com.assignment;

public class Assignment7_Q1 {
	
	 public static <T extends Number & Comparable<T>> T findMin(T[] array) {
	        T min = array[0];
	        for (T element : array) {
	            if (element.compareTo(min) < 0) {
	                min = element;
	            }
	        }
	        return min;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArr = {10, 5, -3, 8, 2};
        Double[] doubleArr = {10.5, 3.2, 7.9, 2.1};
        Float[] floatArr = {5.5f, 1.1f, 3.3f};

        System.out.println("Minimum Integer: " + findMin(intArr));
        System.out.println("Minimum Double: " + findMin(doubleArr));
        System.out.println("Minimum Float: " + findMin(floatArr));

	}

}
