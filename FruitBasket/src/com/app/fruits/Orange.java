package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {
		super();
		System.out.println("Orange parameterless constructor");
	}

	public Orange(String color, String name, double weight, boolean isFresh) {
		super(color, name, weight, isFresh);
		System.out.println("Orange parameterized constructor");
	}

	@Override
	public String taste() {
		return "sour ";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return super.getWeight();
	}

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		super.setWeight(weight);
	}

	@Override
	public boolean isFresh() {
		// TODO Auto-generated method stub
		return super.isFresh();
	}

	@Override
	public void setFresh(boolean isFresh) {
		// TODO Auto-generated method stub
		super.setFresh(isFresh);
	}

	@Override
	public String toString() {
		return "Orange [color=" + color + ", name=" + name + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}

}
