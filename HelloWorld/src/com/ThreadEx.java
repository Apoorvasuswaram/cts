package com;
class MyThread extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		t1.start();
		t1.isAlive();
		System.out.println(t1);
		t1.isDaemon();
		System.out.println(t1);
	}

}
