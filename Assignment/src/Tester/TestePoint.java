package Tester;

import com.app.geometry.Point2D;

public class TestePoint {

	public static void main(String[] args) {
		Point2D pt1 = new Point2D(2,6);
		Point2D pt2 = new Point2D(653,5);

		boolean flag = pt1.equals(pt2);
		System.out.println("result " + flag);

		
		if(flag == false) {
			System.out.println("Distance between 2 pont is : " +pt1.distance(pt2) );
		}
		
		System.out.println("First co-ordinate is "+pt1.getDetails());
		System.out.println("Second co-ordinate is "+pt2.getDetails());

	}

	}


