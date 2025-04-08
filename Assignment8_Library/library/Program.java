package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Program {

	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0 : Exit");
		System.out.println("1 : Add new book in list");
		System.out.println("2 : Display all books in forward order");
		System.out.println("3 : Display all books in reverse order");
		System.out.println("4 : Delete a book at given index");
		System.out.println("5 : Sort by Quantity");
		System.out.println("Enter your Choice");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Book> list = new ArrayList<Book>();

		list.add(new Book("JK Rowling", "Harray Potter", 500.5, 1));
		Collections.addAll(list, new Book("RR Martin", "House of Dragon", 5000.5, 12),
				new Book("Amish Devgan", "Immortals of Meluha", 300.00, 2),
				new Book("Rishi Datey", "Knights of Night", 5452, 645));
		

//			System.out.println(list.toString());
		Scanner sc = new Scanner(System.in);

		int number;

		while ((number = menu()) != 0) {
			switch (number) {
			case 1:
				Book book = new Book();
				book.accept();
				list.add(book);
				break;

			case 2:

				Iterator<Book> trav = list.iterator();
				while (trav.hasNext()) {
					Book ele = trav.next();
					System.out.println(ele);
				}

				break;

			case 3:
				ListIterator<Book> trav1 = list.listIterator(list.size());
				while (trav1.hasPrevious()) {
					Book ele = trav1.previous();
					System.out.println(ele);
				}

				break;

			case 4:
				System.out.println("Enter the index number ");
				int a = sc.nextInt();
				for (Book b : list) {
					if (list.indexOf(b) == a ) {
						list.remove(a);
					}
				}

				break;
				
			case 5 :
//this is one way to sort arraylist using sort() and passing anyomis object in it
// another way is using Comparable
				
				list.sort(new SortByQuantity());
				for (Book book2 : list) {
				System.out.println(book2);	
				}
				break;
			default:
				System.out.println("invalid number");
				break;
			}
		}

	}

}
