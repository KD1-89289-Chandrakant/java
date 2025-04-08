package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Scanner;

enum Senum{
	EXIT,
    ADD_STUDENT,
    DISPLAY_ALL,
    SEARCH_STUDENT,
    SORT_BY_ROLLNO,
    SORT_BY_NAME,
    SORT_BY_MARKS,
    REMOVE_STUDENT
}

class Student {
	private int rollNo;
	private String Name;
	private int marks;

	public Student() {
	}

	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.Name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void accpet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		this.Name = sc.nextLine();
		System.out.println("Enter Roll Number : ");
		this.rollNo = sc.nextInt();
		System.out.println("Enter  Marks : ");
		this.marks = sc.nextInt();

	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo = " + rollNo + ", Name = " + Name + ", marks = " + marks + "]";
	}

}

class SortByRollNo implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRollNo() - o2.getRollNo();
	}

}

class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class SortByMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getMarks() - o2.getMarks();
	}

}

public class Assignment9_Q1 {
	private static List<Student> list = new ArrayList<Student>();
	private static Scanner sc = new Scanner(System.in);

	public static void display() {
		ListIterator<Student> trav = list.listIterator();
		while (trav.hasNext()) {
			Student ele = trav.next();
			System.out.println(ele);
		}
	}

	public static void findStudent() {
		System.out.println("enter roll no");
		int a = sc.nextInt();
		Student s1 = new Student();
		s1.setRollNo(a);

		int i = list.indexOf(s1);
		if (i != -1) {

			System.out.println(list.get(i));
		}
	}

	public static void removeStudent() {
		System.out.println("enter roll no");
		int a = sc.nextInt();
		
		Student s1 = new Student();
		s1.setRollNo(a);

		int i = list.indexOf(s1);
		if (i != -1) {

			System.out.println(list.remove(i) + " is removed from the list");
		}
	}
	
public static Senum menuList() {
	Senum[] se = Senum.values();
	
	for (Senum senum : se) {
		System.out.println(senum.ordinal()+ " : " + senum.name());
	}
	System.out.println("Enter your choice");
	int a  = sc.nextInt();
    return se[a];
}
	
//	public static int menu() {
//		System.out.println("*********************************");
//		System.out.println("0 : Exit");
//		System.out.println("1 : Add student");
//		System.out.println("2 : Display all student");
//		System.out.println("3 : search the student and display details. ");
//		System.out.println("4 : sort the students on rollno");
//		System.out.println("5 : sort the students on name");
//		System.out.println("6 : sort the students on marks");
//		System.out.println("7 : Remove Student");
//		System.out.println("Enter your Choice");
//		System.out.println("*********************************");
//
//		int choice = sc.nextInt();
//		return choice;
//	}

	public static void main(String[] args) {
		
		Collections.addAll(list,  new Student(101, "Amit Sharma", 85),
                new Student(102, "Sneha Patil", 92),
                new Student(105, "Rahul Verma", 79),
                new Student(104, "Priya Deshmukh", 88),
                new Student(106, "Neha Joshi", 95),
         		new Student(103, "Rishi Datey", 76));

//		int number
		Senum choice;
		while((choice = menuList()) != Senum.EXIT ) {
			
			switch (choice) {
			case ADD_STUDENT:
				Student s = new Student();
				s.accpet();
				list.add(s);
				break;
				
			case DISPLAY_ALL:
				display();
				break;
				
			case SEARCH_STUDENT:
				findStudent();
				break;
				
			case SORT_BY_ROLLNO:
				list.sort(new SortByRollNo());
				display();
				break;
				
			case SORT_BY_NAME:
				list.sort(new SortByName());
				display();
				break;
				
			case SORT_BY_MARKS:
				list.sort(new SortByMarks());
				display();
				break;
				
			case REMOVE_STUDENT:
				removeStudent();
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}

}
