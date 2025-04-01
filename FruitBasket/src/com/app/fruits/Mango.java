package com.app.fruits;

public class Mango extends Fruit {

	public Mango() {
		super();
		System.out.println("Mango parameterless constructor");
	}

	public Mango(String color, String name, double weight, boolean isFresh) {
		super(color, name, weight, isFresh);
		System.out.println("Mango parameterized constructor");
	}

	@Override
	public String taste() {
		return "sweet ";
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
		return "Mango [color=" + color + ", name=" + name + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}

}
