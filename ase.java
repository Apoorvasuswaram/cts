import java.io.*;
import java.util.*;
class asec
{
public static void main(String arg[])
{
int temp;
int arr[]={12,34,22,1};
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]<arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<arr.length;i++)
System.out.println("desc order is:" +arr[i]);
System.out.println("\n");
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int j=0;j<arr.length;j++)
System.out.println("asec order is:" +arr[j]);
}
}