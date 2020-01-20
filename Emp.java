import java.util.*;
public class Emp	
{
int empId;
String empName;
double empSalary;
void setemp(int id,String name,double salary);
{
empId=id;
empName=name;
empSalary=salary;
}
void getemp()
{
System.out.println("id is:"+empId+"name is:"+empName+"salary is:"+empSalary);
}
}
	