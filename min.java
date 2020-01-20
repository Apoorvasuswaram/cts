import java.io.*;
import java.util.*;
class minmax
{
public static void main(String arg[])
{
int arr[]={12,34,22,1};
int i=0,j=0;
int min=arr[i];
for(i=1;i<arr.length;i++)
{
if(arr[i]<min)
min=arr[i];
}
System.out.println("min value is:"+min);
int max=arr[j];
for(j=1;j<arr.length;j++)
{
if(arr[j]>max)
max=arr[j];
}
System.out.println("max value is:"+max);
}
}
