package q01;

import java.util.Scanner;

public class StringReader {

	public static int calcLength(String str) throws ExceptionLineTooLong {
		if(str.length() > 80) {
			throw new ExceptionLineTooLong();
		}
		return str.length();
	}
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		int strLength = calcLength(str);
		System.out.println("Length of String = " + strLength);
		} 
		catch(ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}
		
	}

}
