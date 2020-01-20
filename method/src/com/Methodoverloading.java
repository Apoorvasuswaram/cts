package com;
class Addition
{
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,int b)
	{
		return a+b;
	}
	double add(double a, double b)
	{
		return a+b;
	}
}


public class Methodoverloading {

	
	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		System.out.println(a.add(23,78));
		System.out.println(a.add(4.5,5));
		System.out.println(a.add(9.8, 55.6));

	}

}
