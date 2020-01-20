package com;

import java.util.Scanner;

public class Alphabets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=155,b=219;
		char x,y;
		Scanner s=new Scanner(System.in);
		x=s.next().charAt(0);
		y=s.next().charAt(0);
		if((int)x<78)
		{
			System.out.println((char)(char)a-x);
		}
		if((int)y<110)
		{
			System.out.println((char)(char)b-y);
		}
		/*char ascii(char)=(char)ascii;
		for(int i=65;i<=90;i++)
		{
			if(ascii>=65)
				
				for(int j=90;j>=65;j--)
			
			System.out.println("the last letter is:" +s1);
		}*/
	}

}
