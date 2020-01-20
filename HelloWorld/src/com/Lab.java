package com;

import java.util.Scanner;

public class Lab {
	static int a = 0, b = 0, c = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the students:");
		int n=s.nextInt();
		System.out.println("enter the students in lab1:");
		int x=s.nextInt();
		System.out.println("enter the students in lab2:");
		int y=s.nextInt();
		System.out.println("enter the students in lab3:");
		int z=s.nextInt();
			
		if(x>=n)
			a=x-n;
		
		else
		{
			if((x>y)&&(x>z))
			{
			a=n+x;
			}
			else if((y>z))
			{
				a=n+y;
			}
			else
				a=n+z;
		}
		if(y>=n)
		{
			b=y-n;
		}
		else
		{
			if((x>y)&&(x>z))
			{
			b=n+x;
			}
			else if((y>z))
			{
				b=n+y;
			}
			else
				b=n+z;
			}

	if(z>=n)

	{
		c = z - n;
	}else
	{
		if((x>y)&&(x>z))
		{
		c=n+x;
		}
		else if((y>z))
		{  
			c=n+y;
		}
		else
			c=n+z;
	}

	if((a>b)||(a>c))
	{
		if (b > c) {
			System.out.println("print the lab3");
		} else {
			System.out.println("print the lab 2");
		}

	}else
	{
		System.out.println("print the lab 1");
	}
	/*
	 * if((b<c)&&(b<a)) { System.out.println("print the lab2"); }
	 * if((c<b)&&(c<a)) { System.out.println("print the lab3"); } }
	 */
}}
