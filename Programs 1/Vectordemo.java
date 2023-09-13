package com.Listspractice;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector<Object>a= new Vector<>();
		a.addElement(4);
		a.addElement(6);
		a.addElement(1);
		a.addElement(8);
		System.out.println(a);
		
		Enumeration<Object> c=a.elements();
		
		while(c.hasMoreElements());
		Integer e = (Integer) c.nextElement();
		System.out.println(e);
				
	
	}

}
