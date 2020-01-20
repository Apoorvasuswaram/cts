package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();  
		al.add(new EmployeeEx(101,"appu",9));  
		al.add(new EmployeeEx(106,"nandu",23));  
		al.add(new EmployeeEx(105,"neeli",25));  
		System.out.println("sort by name:");
		Collections.sort(al,new NameComparator());  
		Iterator itr=(Iterator)al.iterator();  
		while(itr.hasNext()){  
		EmployeeEx st=(EmployeeEx)itr.next();  
		System.out.println(st.empId+" "+st.empname+" "+st.age);  
		}  
		System.out.println("sort by age:");
		Collections.sort(al,new AgeComparator());  
		Iterator itr1=(Iterator)al.iterator();  
		while(itr1.hasNext()){  
		EmployeeEx st=(EmployeeEx)itr1.next();  
		System.out.println(st.empId+" "+st.empname+" "+st.age);
		}
	}

}
