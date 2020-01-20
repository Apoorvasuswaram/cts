import java.io.*;
import java.util.*;
class sum
{
public static void main(String arg[])
{
int add=0;
int avg=0;
int arr[]={1,78,4,23,9};
int i=0;
for(i=0;i<arr.length;i++)
{
add=add+arr[i];
}
System.out.println("the sum is" +add);
avg=add/arr.length;
System.out.println("avg is" +avg);
}}