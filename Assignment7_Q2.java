package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 implements Comparable<Student1>{
	private int roll; 
	private String name; 
	private String city; 
	private double marks;
	
	public Student1() {
	}

	public Student1(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		
		return this.getCity().compareTo(o.getCity());
	} 
	
	
	
	 
}

class sortByMe implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		int diff = o1.getCity().compareTo(o2.getCity());
		
		if (diff == 0) {
//			diff = (int) (o1.getMarks() - o2.getMarks());
			diff = Double.compare(o1.getMarks(), o2.getMarks());
		} 
		
		if (diff == 0) {
			diff = o1.getName().compareTo(o2.getName());
		} 
		return diff;
	}
	
}

public class Assignment7_Q2 {

	public static void main(String[] args) {
		
		List<Student1> stu = new ArrayList<>();
		Collections.addAll(stu,
			    new Student1(1, "Amit", "Pune", 85.0),
			    new Student1(2, "Ravi", "Pune", 85.0),
			    new Student1(3, "Amit", "Pune", 78.5),
			    new Student1(4, "Neha", "Mumbai", 85.0),
			    new Student1(5, "Ravi", "Mumbai", 90.0),
			    new Student1(6, "Sneha", "Nagpur", 66.5),
			    new Student1(7, "Amit", "Nagpur", 85.0),
			    new Student1(8, "Ravi", "Delhi", 72.0),
			    new Student1(9, "Amit", "Delhi", 85.0),
			    new Student1(10, "Neha", "Bangalore", 91.5),
			    new Student1(11, "Sneha", "Chennai", 85.0),
			    new Student1(12, "Ravi", "Hyderabad", 70.0),
			    new Student1(13, "Amit", "Ahmedabad", 85.0),
			    new Student1(14, "Neha", "Kolkata", 79.0),
			    new Student1(15, "Ravi", "Surat", 88.0)
			);
		
//		  natural Ordreing
//		  way1 
//		  stu.sort(null);
		
//		  way2
//		  Collections.sort(stu);
		  
		  stu.sort(new sortByMe());
		  
		for (Student1 student1 : stu) {
		System.out.println(student1);	
		}
		
	}

}
