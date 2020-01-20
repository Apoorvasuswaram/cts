package com;

public class Box {
 
	int length,width,heigth;
	
	
	
	public Box(int length, int width, int heigth) {
		super();
		this.length = length;
		this.width = width;
		this.heigth = heigth;
	}



	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeigth() {
		return heigth;
	}



	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}


	public int calculatevolume()
	{
		return length*width*heigth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10,20,30);
		System.out.println(b.calculatevolume());
		//System.out.println();

	}

}
