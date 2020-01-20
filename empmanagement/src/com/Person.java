package com;


 class Superperson
{
	String pname;
	int syear;
	@Override
	public String toString() {
		return "Superperson [pname=" + pname + ", syear=" + syear + "]";
	}
	
	public Superperson(String pname, int syear) {
		super();
		this.pname = pname;
		this.syear = syear;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getSyear() {
		return syear;
	}
	public void setSyear(int syear) {
		this.syear = syear;
	}

	
	
}
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
