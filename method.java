class student
{
int sid;
String sname;
String sbranch;
double sfee;

void setstudent(int id,String name,String branch, double fee )
{
sid=id;
sname=name;
sbranch=branch;
sfee=fee;
}
void getstudent()
{
System.out.println("id="+sid+"\nname="+sname+"\nbranch="+sbranch+"\nfee="+sfee);
}
public static void main(String arg[])
{
student a=new student();
a.setstudent(888,"appu","aws",10000.9);
a.getstudent();
}
}