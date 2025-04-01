package com.app.fruits;

 class Apple extends Fruit{

	public Apple() {
		super();
		System.out.println("Apple parameterless constructor");
	}

	public Apple(String color, String name, double weight, boolean isFresh) {
		super(color, name, weight, isFresh);
		System.out.println("Apple parameterized constructor");
	}
	

	@Override
	public String taste() {
		return "sweet and sour ";
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
		return "Apple [color=" + color + ", name=" + name + ", weight=" + weight + ", isFresh=" + isFresh + "]";
	}

}
