package com;
class Automobile implements fly
{
	double speed=100;
	String1 modelno;
	void setmodelno(String1 modelno)
	{
		this.modelno=modelno;
	}
	String1 show()
	{
		return modelno;
	}
	@Override
	public int fly(int a) {
		// TODO Auto-generated method stub
		return a;
	}
}
interface fly
{
	int speed=400;
	int fly(int a);
}
public class Interface {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		Automobile a=new Automobile();
		a.setmodelno("airbus120");
		System.out.println("name of areroplane:"+ a.show());
		System.out.println("flying with speed:"+a.fly(90));
		System.out.println("the air speed is:"+fly.speed);
	}

}