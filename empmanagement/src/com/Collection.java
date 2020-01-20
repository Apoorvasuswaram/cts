package com;
import java.util.*;
public class Collection {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		/*System.out.println(e);*/
		/*ArrayList<String> e1=new ArrayList<String>();*/
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Object srt:list)
		{
			System.out.println(srt);
		}
		/*e1.add("d");
		e1.add("e");
		e1.add("f");
		e.addAll(e1);
		System.out.println(e);
		e.remove(1);
		System.out.println(e);
		e.removeAll(e1);jj
		System.out.println(e1);
		e1.clear();
		System.out.println(e1);*/
	}
}
