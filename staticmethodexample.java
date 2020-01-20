class Staticmethodexample
{
static int num;//static var
int inst;//non-ststic or instance var
static void setstatic(int inst)//static method
{
num=inst;
}
public static void main(String ar[])
{
Staticmethodexample e=new Staticmethodexample();
//System.out.println(e.setstatic);
e.setstatic(10);
}
}