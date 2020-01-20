public class Bankemp
{
public int empid;
public String empname;
public int salary;
void Bankemp()
{
empid=0;
empname="";
empsalary=0;
}
public Bankemp(int id,String name,int salary)
{
empid=id;
empname=name;
empsalary=salary;
}
void setbankemp(int id,String name,int salary)
{
empid=id;
empname=name;
empsalary=salary;
}
void getbankemp()
{
System.out.println("empid is:" +empid+ "empname is:" +empname+ "empsal is:" +empsalary);
}
}