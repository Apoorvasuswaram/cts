package com;
import java.util.concurrent.ThreadLocalRandom;
public class Mathclass {
public static void main(String[] args) {
		// TODO Auto-generated method stub
double x=7.8;
int y=44;
int min=1,max=6;
/*System.out.println("print max:" +Math.max(x,y)); 
System.out.println("print squareroot:" +Math.sqrt(y)); 
System.out.println("print power:" +Math.pow(x,y)); 
System.out.println("print log value:" +Math.log(x));
for(int i=0;i<10;i++)
    {
	int ran=(int) ((Math.random()*100));
System.out.println("print random:" +ran); 
	}*/
int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
}
}
