package src;

import java.util.Scanner;

public class ReverseString {
	static Scanner sc = new Scanner(System.in);
	private static String s;
	
	public static void main(String[] args) {
		System.out.println("enter the string you want to reverse : ");
		StringBuffer s1 = new StringBuffer(sc.next());
		StringBuffer s2 = s1.reverse();
		System.out.println("the string after reversing is : " +s2);
	}

}

