package com;
abstract class Abstractclass1
{
	abstract void add(int a,int b);
	void show()
	{
		System.out.println("this is a abstract class");
	}
	
}
class Abstractimp extends Abstractclass1
{

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
	
}

public class Abstractclass {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		Abstractimp a=new Abstractimp();
		a.add(10,20);
	}

}
