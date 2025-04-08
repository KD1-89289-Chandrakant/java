package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Project implements Comparable<Project> {
	private int id;
	private String title;
	private int teamSize;
	private double projectCost;
	private String technology;

	public Project() {
	}

	public Project(int id, String title, int teamSize, double projectCost, String technology) {
		super();
		this.id = id;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.technology = technology;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter title ");
		this.title = sc.nextLine();
		System.out.println("Enter id ");
		this.id = sc.nextInt();
		System.out.println("Enter teamSize ");
		this.projectCost = sc.nextInt();
		System.out.println("Enter projectCost ");
		this.projectCost = sc.nextDouble();

		sc.nextLine(); // Consume the leftover newline
		System.out.println("Enter technology ");
		this.technology = sc.nextLine();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public double getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Project)) {
			return false;
		}
		Project other = (Project) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", teamSize=" + teamSize + ", projectCost=" + projectCost
				+ ", technology=" + technology + "]";
	}

	@Override
	public int compareTo(Project o) {
		return this.teamSize - o.teamSize;
	}

}

class SortByCost implements Comparator<Project> {

	@Override
	public int compare(Project o1, Project o2) {
		return Double.compare(o1.getProjectCost(), o2.getProjectCost());
	}

}

public class Assignment9_Q2 {
	private static final Set<Project> set = new LinkedHashSet<Project>();
	private static List<Project> alist = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);

	private static void display() {

		for (Project project : set) {
			System.out.println(project);
		}

//		another way 
	}

	private static void deleteProject() {
		System.out.println("Enter id ");
		int a = sc.nextInt();

		Project p = new Project();
		p.setId(a);
		set.remove(p);
		System.out.println("Element is removed");
	}

	private static void copyToArrayList() {
		alist = new ArrayList<>(set);
		System.out.println("copied to arraylist");
	}

	private static void displayList() {
//		for (Project project : alist) {
//			System.out.println(project);
//		}
//		another way
		ListIterator<Project> trav = alist.listIterator();
		while (trav.hasNext()) {
			Project ele = trav.next();
			System.out.println(ele);
		}
	}

	private static int displayMenu() {

		System.out.println("\n===== Project Management System =====");
		System.out.println("0. Exit");
		System.out.println("1. Input a Project from user ");
		System.out.println("2. Display all Projects in Set");
		System.out.println("3. Delete a Project by Id from Set");
		System.out.println("4. Copy All Projects from Set to ArrayList");
		System.out.println("5. Display all Projects from List");
		System.out.println("6. Sort all Projects in List by cost");
		System.out.println("7. Find project with Max team size");

		System.out.print("Enter your choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		Collections.addAll(set, new Project(1, "Train Reservation System", 5, 8754.00, "Java"),
				new Project(2, "E-Commerce Platform", 8, 15000.00, "Spring Boot"),
				new Project(3, "Banking System", 10, 30000.00, "Python"),
				new Project(4, "Healthcare App", 6, 12000.50, "React"),
				new Project(5, "Chatbot", 4, 9000.75, "Node.js"));
		int number;

		while ((number = displayMenu()) != 0) {
			switch (number) {
			case 1:
				Project p = new Project();
				p.accept();
				System.out.println(p.toString());
				break;

			case 2:
				display();
				break;

			case 3:
				deleteProject();
				break;

			case 4:
				copyToArrayList();
				break;

			case 5:
				displayList();
				break;

			case 6:
				if (alist == null || alist.isEmpty()) {
					System.out.println("ArrayList is empty. Please copy projects first (Option 4).");
				} else {
					alist.sort(new SortByCost());
					System.out.println("List sorted by project cost.");
				}
				break;

			case 7:
				if (alist == null || alist.isEmpty()) {
					System.out.println("ArrayList is empty. Please copy projects first (Option 4).");
				} else {
					Project p1 = Collections.max(alist); // uses compareTo() for teamSize natutal Ordering u can use
															// comparator also
					System.out.println("Project with max team size:");
					System.out.println(p1);
				}
				break;

			default:

				break;
			}
		}

	}
}
