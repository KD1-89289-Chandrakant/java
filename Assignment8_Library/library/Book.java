package library;

import java.util.Comparator;
import java.util.Scanner;

public class Book {

	private String authorName;
	private String bookName;
	private double price;
	private int quantity;
	public Book() {
	}
	
	public Book(String authorName, String bookName, double price, int quantity) {
		super();
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Author Name : ");
		this.authorName = sc.nextLine();
		System.out.println("Enter Book Name : ");
		this.bookName = sc.nextLine();
		System.out.println("Enter Book Price Name : ");
		this.price = sc.nextDouble();
		System.out.println("Enter Quantity Name : ");
		this.quantity = sc.nextInt();
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

//	my written equals methods
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;	
			}
		
		if (this == obj) {
		return true;	
		}
		
		if (!(obj instanceof Book)) {
			return false;	
			}
		
		Book other = (Book) obj;
		if(!this.bookName.equals(other.bookName)) {
			return false;
		}
		 // If all attributes match, return true
	    return true;
	}
	
	
	
	@Override
	public String toString() {
		return "Book [authorName = " + authorName + ", bookName = " + bookName + ", price=" + price + ", quantity = "
				+ quantity + "]";
	}	
}

class SortByQuantity implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getQuantity()-o2.getQuantity();
	}
	
}
