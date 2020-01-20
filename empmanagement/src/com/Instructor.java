package com;

public class Instructor extends Superperson{
int salary;
	
	

	@Override
public String toString() {
	return "Instructor [salary=" + salary + ", pname=" + pname + ", syear=" + syear + "]";
}

	public Instructor(String pname, int syear, int salary) {
	super(pname, syear);
	this.salary = salary;
}

	public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
