package com;

public class Vararg {

	static void add(int... number)
	{
		int sum=0;
		for(int i:number)
			sum=sum+i;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(90,30,49,76,5);
		add(80,98);
		add(34,56,21,34,88,90,76,45,23);
	}

}
