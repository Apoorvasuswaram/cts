package com;
import java.util.*;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Collections;
public class Mapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put(1, "apoorva");
		map.put(2, "sindhu");
		map.put(3, "neelima");
		map.put(4, "nandini");

		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
