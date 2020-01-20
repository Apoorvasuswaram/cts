package com;


import java.util.Collection;

public class Collection1 implements Comparable<Collection1> {

	int emp_id,emp_salary;
	 String emp_name,emp_location;
	
	 

	@Override
	public String toString() {
		return "Employeedetails [emp_id=" + emp_id + ", emp_salary=" + emp_salary + ", emp_name=" + emp_name
				+ ", emp_location=" + emp_location + "]";
	}

   public Collection1(int emp_id, int emp_salary, String emp_name, String emp_location) {
		super();
		this.emp_id = emp_id;
		this.emp_salary = emp_salary;
		this.emp_name = emp_name;
		this.emp_location = emp_location;
		
	}
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int CompareTo(Employeedetails per)
	{
		return emp_name.compareTo(per.emp_name);
	}

	public String getEmp_location() {
		return emp_location;
	}

	public void setEmp_location(String emp_location) {
		this.emp_location = emp_location;
	}
	

	
	public int CompareTo(Collection1  emp)
	{
		return emp_name.compareTo(emp.emp_name);
	}
	/*public int details()
	{
		System.out.println(202,30000,"apoorva","chennai");
	}*/

	public int CompareTo1(Collection1 c)
	{
		return emp_name.compareTo(c.emp_name);
	}

	@Override
	public int compareTo(Collection1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
}