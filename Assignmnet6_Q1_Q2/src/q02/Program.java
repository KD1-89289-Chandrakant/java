package q02;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		try {
			Circle c1 = new Circle();
			System.out.println(c1.toString());
			System.out.println("-------------------------------------------------");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the diameter of circle : ");
			double diameter = sc.nextDouble();
			c1.setMyDiameter(diameter);
			System.out.println(c1.toString());
		}
		catch(NegativeDiameterException e) {
			System.out.println(e.getMessage());
		}
	}

}
