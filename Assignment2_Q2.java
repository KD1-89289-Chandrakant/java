package com.assignment;

import java.util.Scanner;

class Employee {
	private String firstName;
	private String lastName;
	private int sal;

	public Employee() {

	}

	public Employee(String firstName, String lastName, int sal) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.sal = sal;
	}

//	way 1

	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);

		// here this is option but use of this is recommended

		System.out.println("Enter first Name : ");
		this.firstName = sc.nextLine();

		System.out.println("Enter last name : ");
		this.lastName = sc.nextLine();

		System.out.println("Enter salary : ");
		this.sal = sc.nextInt();

		if (sal < 0) {
			sal = 0;
		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSal() {
		return sal;
	}

	
//	2nd way
	public void setSal(int sal) {
		
		if (sal >0) {
			this.sal = sal;
		}
	}

	@Override
	public String toString() {
		return "Employee [firstName = " + firstName + ", lastName = " + lastName + ", sal = " + sal + "]";
	}

}

public class Assignment2_Q2 {

	public static void main(String[] args) {

		System.out.println("enter eemployee 1 data");
		Employee emp1 = new Employee();
		emp1.acceptEmployee();
		double updatedSalaray = emp1.getSal() + emp1.getSal() * 0.10;

		System.out.println(updatedSalaray);
		System.out.println("Employee 1 Annual Salary " + updatedSalaray * 12);

		System.out.println("********************************************");

		System.out.println("enter eemployee 2 data");
		Employee emp2 = new Employee();
		emp2.acceptEmployee();
		double updatedSalaray2 = emp1.getSal() + emp1.getSal() * 0.10;

		System.out.println(updatedSalaray);
		System.out.println("Employee 1 Annual Salary " + updatedSalaray2 * 12);

	}

}
