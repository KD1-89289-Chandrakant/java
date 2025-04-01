package src;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string you wanna check if it is palindrome or not : ");
        String s1 = sc.nextLine();
        
        String reversed = new StringBuilder(s1).reverse().toString();
        
        if (s1.equals(reversed))
            System.out.println("entered string is palindrome string");
        else
            System.out.println("the entered string is not a palindrome string");
        
    }
}

