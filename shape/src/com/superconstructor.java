package com;

class A extends Object{
A(int a,int b,int c)
{
	super();
	System.out.println("A()");
}
}
class B extends A
{
	B(int a,int b,int c)
	{
		super(a,b,c);
		System.out.println("B()");
	}
}

public class superconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a=new A();
		B b=new B(2,6,9);
        System.out.println(b.hashCode());
        System.out.println(b.getClass());
	}

}