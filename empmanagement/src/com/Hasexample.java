package com;
class Engine
{
	int engno,age;
	String fueltype;
	@Override
	public String toString() {
		return "Engine [engno=" + engno + ", age=" + age + ", fueltype=" + fueltype + "]";
	}
	public Engine(int engno, int age, String fueltype) {
		super();
		this.engno = engno;
		this.age = age;
		this.fueltype = fueltype;
	}
	public int getEngno() {
		return engno;
	}
	public void setEngno(int engno) {
		this.engno = engno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
}

class Motorcar
{
	Engine e;
	int carno;
	String carmodel;
	@Override
	public String toString() {
		return "Motorcar [e=" + e + ", carno=" + carno + ", carmodel=" + carmodel + "]";
	}
	public Motorcar(Engine e, int carno, String carmodel) {
		super();
		this.e = e;
		this.carno = carno;
		this.carmodel = carmodel;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public int getCarno() {
		return carno;
	}
	public void setCarno(int carno) {
		this.carno = carno;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	
}

public class Hasexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motorcar c=new Motorcar(new Engine(2,786,"wxr"),2356,"asx");
		System.out.println(c);
	}

}
