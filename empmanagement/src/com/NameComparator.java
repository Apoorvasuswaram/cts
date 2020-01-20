package com;

import java.util.Comparator;

public class NameComparator implements Comparator{
public int compare(Object o1,Object o2)
{
	EmployeeEx e1=(EmployeeEx)o1;
	EmployeeEx e2=(EmployeeEx)o2;
	return e1.empname.compareTo(e2.empname);
}
}
