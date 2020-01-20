package com;

public class Employeedetails {
	int emp_id,emp_salary;
	 String emp_name,emp_location;
	 Address address;
	
	 

	@Override
	public String toString() {
		return "Employeedetails [emp_id=" + emp_id + ", emp_salary=" + emp_salary + ", emp_name=" + emp_name
				+ ", emp_location=" + emp_location + ",address="+address+"]";
	}

    public Employeedetails(int emp_id, int emp_salary, String emp_name, String emp_location,Address address) {
		super();
		this.emp_id = emp_id;
		this.emp_salary = emp_salary;
		this.emp_name = emp_name;
		this.emp_location = emp_location;
		this.address=address;
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
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	/*public int details()
	{
		System.out.println(202,30000,"apoorva","chennai");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employeedetails e=new Employeedetails(202,2000,"appu","chennai");
	System.out.println("emp id is:" +emp_id+"\nemp sal is:" +emp_salary+"\nemp name is:" +emp_name+"\nemp loc is:" +emp_location);
		//Employeedetails e=new Employeedetails();
		/*e.setEmp_id(10);
		e.setEmp_salary(3000);
		e.setEmp_name("appu");
		e.setEmp_location("chennai");
		e.getEmp_id();
		e.getEmp_salary();
	SSSSSSSSSSSSSSS	e.getEmp_name();
		e.getEmp_location();*/

	}

}
