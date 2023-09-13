package com.mapsprcatice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapdemo {
	public static void main(String[] args) {
		Map<Integer, String>a=new HashMap<>();
		a.put(8, "sanjay");
		a.put(2, "justin");
		a.put(5, "alan");
		a.put(1,"jhon");
		System.out.println(a);
		
		Set<Integer> c = a.keySet();
		System.out.println(c);
		
		Collection<String> d = a.values();
		System.out.println(d);
		
		Set<Entry<Integer, String>> e = a.entrySet();
		System.out.println(c);
		
		Iterator<Entry<Integer, String>> m1 = e.iterator();
		System.out.println(m1);
		
		while(m1.hasNext()) {
			Entry<Integer, String> f = m1.next();
			System.out.println(f);
		}
	}

}
