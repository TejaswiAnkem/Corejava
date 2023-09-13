package com.Listspractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraylistdemo {
	public static void main(String[] args) {
		List<Object>a= new ArrayList<>();
		a.add("sanjay");
		a.add("naveen");
		a.add("mohan");
		System.out.println(a);
		
	Collections.sort(a,new Comparedemo());
	}
}
