package com.app.geometry;

public class Point2D {
	private int x;
	private int y;

	public Point2D() {
		super();
	}

	public Point2D(int x, int y) {
		// super();
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		return this.x + " , " + this.y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Point2D)) {
			return false;
		}




		Point2D p = (Point2D) obj;
		if (this.x == p.x && this.y == p.y)
			return true;
		else
			return false;

	}


	public double distance(Point2D other) {
		return Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}


