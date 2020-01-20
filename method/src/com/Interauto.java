package com;

abstract class Automobile1 
{
	String1 modelno;
	abstract String1 show(String1 modelno);
}
interface run
{
	int rmax=100;
}
interface swim
{
	int smax=150;
}
interface fly1
{
	int fmax=200;
}
class roadauto extends Automobile1 implements run
{
	String1 show(String1 modelno)
	{
		return modelno;
	}
	
}	
class swimauto extends Automobile1 implements swim
{
	String1 show(String1 modelno)
	{
		return modelno;
	}
	
}	
class airauto extends Automobile1 implements fly1
{
	String1 show(String1 modelno)
	{
		return modelno;
	}
	
}	
	/*@Override
	public int fly(int a) {
		// TODO Auto-generated method stub
		return a;
	}*/
	
public class Interauto {
	 
	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		airauto a=new airauto();
		System.out.println("the model is:"+a.show("airbus113"));
		System.out.println("the speed is:" +airauto.fmax); 
		roadauto r=new roadauto();
		System.out.println("the model is:"+r.show("roadbus113"));
		System.out.println("the speed is:" +roadauto.rmax);
		swimauto s=new swimauto();
		System.out.println("the model is:"+s.show("swimbus113"));
		System.out.println("the speed is:" +swimauto.smax);
		
	}

}
