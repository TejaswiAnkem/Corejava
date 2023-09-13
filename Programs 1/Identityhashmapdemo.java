package com.mapsprcatice;

import java.util.IdentityHashMap;
import java.util.Map;

public class Identityhashmapdemo {
public static void main(String[] args) {
	Map<Integer, String>a= new IdentityHashMap<>();
	Integer b= new Integer(10);
	Integer c= new Integer(10);
	a.put(1, "tom");
	a.put(3, "jerry");
	//it compare adressess of objects(==)
	System.out.println(a);

}
}
