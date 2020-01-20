class A
{
static int count=0;
A()
{
count++;
}
public static void main(String arg[])
{
A a=new A();
A a1=new A();
System.out.println(a.count);
System.out.println(a1.count);
}
}