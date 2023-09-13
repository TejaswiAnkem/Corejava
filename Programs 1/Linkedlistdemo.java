package com.Listspractice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistdemo {
	public static void main(String[] args) {
		List<Object>a= new LinkedList<>();
	
		a.add(1);
		a.add(5);
		a.add(8);
		a.add(6);
		System.out.println(a);
		
		Iterator<Object> d = a.iterator();
		
		while(d.hasNext());
		Object elements = d.next();
		System.out.println(elements);
	}
}
