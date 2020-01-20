public 	class Bankemp
{
public int empid;
public String empname;
public int empsalary;
public Bankemp()x
{

}
public Bankemp(int empid,String empname,int empsalary)
{
this.empid=empid;
this.empname=empname;
this.empsalary=empsalary;
}
/*void setbankemp(int id,String name,int salary)
{
empid=id;
empname=name;
empsalary=salary;
}*/
void getbankemp()
{
System.out.println("empid is:" +empid+ "empname is:" +empname+ "empsal is:" +empsalary);
}
}