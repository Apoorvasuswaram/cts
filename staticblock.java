class Staticblock
{
static int a;
static 
{
a=10;
System.out.println("static block called" +a);
}
static void setA()
{
a=67;
System.out.println("static method called" +a);
}
public static void main(String arg[])
{
System.out.println("main method is called");
setA();
}
}