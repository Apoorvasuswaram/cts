package com;

import java.util.Collection;

public class EmployeeMain1 
{
	/*public EmployeeMain(int emp_id, int emp_salary, String emp_name, String emp_location) {
		super(emp_id, emp_salary, emp_name, emp_location);
		// TODO Auto-generated constructor stub*/

	public static void main(String[] args) {
		/*Employeedetails e=new Employeedetails(1,1000,"app","knl",new Address(123,"sql",500987));
		System.out.println(e);
		WageEmployee w=new WageEmployee(12, 1000,"appu","chennai",8,9,(new Address(518005,"ashok nagar",45)));
		System.out.println(w.calculateSalary());
		System.out.println(w);*/
		Arraylist<EmployeeMain> a1=new Arraylist<EmployeeMain>();
		a1.add(new EmployeeMain(123,345,chennai, hyd));
		a1.add(new EmployeeMain(emp_id, emp_id, emp_location, emp_location, address));
		a1.add(new EmployeeMain());
		a1.add(new EmployeeMain());
		a1.add("sss");
		a1.add("aaa");
		a1.add("eee");
		Collection.sort(a1);
		for(EmployeeMain  e1:a1)
		{
			System.out.println(e1.emp_name);
		}
		// TODO Auto-generated method stub

	}

}
