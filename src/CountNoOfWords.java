package src;

import java.util.Scanner;

public class CountNoOfWords {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the string : ");
        String s = sc.nextLine();
        String[] words = s.split(" ");  

        System.out.println(words.length);
    }
}     

