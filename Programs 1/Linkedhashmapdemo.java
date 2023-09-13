package com.mapsprcatice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmapdemo {
	public static void main(String[] args) {
		Map<Integer, String>a=new LinkedHashMap<>();
		a.put(8, "sanjay");
		a.put(2, "justin");
		a.put(5, "alan");
		a.put(1,"jhon");
		System.out.println(a);
	}

}
