
import java.util.*;
class cal
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the char");String x=s.nextLine();
System.out.println("enter the a");int a=s.nextInt();
System.out.println("enter the b");int b=s.nextInt();
switch(x)
{
case "+": System.out.println("add two numbers"+(a+b));
break;
case "-": System.out.println("sub two no"+(a-b));
break;
case "*": System.out.println("mul two no"+(a*b));
break;
case "/": System.out.println("div two no"+(a/b));
break;
}
}
}