package com;

public class Square {

	int side;
	
	@Override
	public String toString() {
		return "Square [side=" + side + ", getSide()=" + getSide() + "]";
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int area()
	{
		return side*side;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
