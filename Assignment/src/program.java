import java.util.Scanner;

public class program{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		
		int number = sc.nextInt();
		System.out.println("Given number :"+ number);
		
		System.out.println("Binary :"+ Integer.toBinaryString(number));
		System.out.println("Octal :"+ Integer.toOctalString(number));
		System.out.println("hexa :"+Integer.toHexString(number));
		
		sc.close();

	}



 

}
