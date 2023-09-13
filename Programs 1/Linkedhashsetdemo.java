package com.setspractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.Listspractice.Comparedemo;

public class Linkedhashsetdemo {
	public static void main(String[] args) {
		Set<Object>a= new LinkedHashSet<>();
		a.add("s");
		a.add("e");
		a.add("a");
		a.add("r");
		a.add("d");
		System.out.println(a);
		List<Set<Object>> e = Arrays.asList(a);
		Collections.sort(e,new Mycomparator1());
System.out.println(e);
//		//Iterator<Object> u= a.iterator();
//		
//	     while(u.hasNext());
//	     Object c = u.next();
//	     System.out.println(c);
//		
	}

}
