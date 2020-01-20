package com;
import java.time.LocalDate;
public class Date {

	public Date(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date d1 = new Date(2008,4,11); 
        Date d2 = new Date(4000,6,2);  
        Date d3 = new Date(2019,4,8); 
  
        boolean a = d3.After(d1); 
        System.out.println("Date d3 comes after " + 
                           "date d2: " + a); 
  
        boolean b = d3.Before(d2); 
        System.out.println("Date d3 comes before "+ 
                           "date d2: " + b); 
  
        int c = d1.compareTo(d2); 
        System.out.println(c); 
  
        System.out.println("seconds from Jan 1 "+ 
                "1970 to date d1 is " + d1.getTime()); 
  
        System.out.println("Before setting "+d2); 
        d2.setTime(20458);
        System.out.println("After setting "+d2); 
        
    }

	private boolean After(Date d1) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean Before(Date d2) {
		// TODO Auto-generated method stub
		return false;
	}

	private int compareTo(Date d2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private String getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setTime(long l) {
		// TODO Auto-generated method stub
		
	} 
} 