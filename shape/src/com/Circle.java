package com;

public class Circle{
	int radius;

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + "]";
	}


	public Circle(int radius) {
		super();
		this.radius = radius;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public double area()
	{
		return 3.14*radius*radius;
	}

}
