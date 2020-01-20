package com;

public class WageEmployee extends Employeedetails
{
int numbers;
int hours;

@Override
public String toString() {
	return "WageEmployee [numbers=" + numbers + ", hours=" + hours + ", emp_id=" + emp_id + ", emp_salary=" + emp_salary
			+ ", emp_name=" + emp_name + ", emp_location=" + emp_location + ", address=" + address + "]";
}

public int getNumbers() {
	return numbers;
}
public void setNumbers(int numbers) {
	this.numbers = numbers;
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public WageEmployee(int emp_id, int emp_salary,String emp_name,String emp_location,int numbers,int hours,Address address) {
super(emp_id, emp_salary, emp_name,emp_location,address);
this.numbers=numbers;
this.hours=hours;
}
int calculateSalary()
{
	return emp_salary*numbers*hours;
}

}