import java.io.*;
import java.util.*;
class matrix
{
	public static void main(String arg[])
	{
	int a[][]={{4,7},{3,1}};
	int [][]b={{6,9},{2,2}};
	int [][]c=new int[2][2];
	for(int i=0;i<c.length;i++)
	{
	for(int j=0;j<c.length;j++)
	{
	c[i][j]=0;
		for(int k=0;k<c.length;k++)
			{
				c[i][j]+=a[i][k]*b[k][j];
			}
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
	}
	}
}