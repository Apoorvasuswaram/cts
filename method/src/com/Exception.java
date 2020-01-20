package com;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=9,b=0;
		try
		{
		System.out.println(a/b);
		throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally always executed");
		}
		System.out.println("my program is executed");
	}

}
