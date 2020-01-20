package com;
 class A
{
	 static final double pi=3.14;
	void display()
	{
		System.out.println("class A");
	}
}
class A1 extends A
{
	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
	}
}


public class Finalexample {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(A.pi);
	}
}

