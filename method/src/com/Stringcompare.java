package com;
public class Stringcompare {
	static int count=0;
	/*static String s1= new String("Appu");
	static String s2=new String("nandu");*/ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in); 
		String s=s1.nextLine();
		String s=s2.nextLine();
		char []c=s1.toCharArray();
		char []d=s2.toCharArray();
		if(c.length==d.length)
		{
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(c[i]!=d[j])
				{
					count=0;
				}
				else
				{
					count++;
				}
			}
		}
		}
		if(count==0)
		{
			System.out.println("they are different Strings");
			
		}
		else
		{
			System.out.println("equal ");
		}
	}

}
