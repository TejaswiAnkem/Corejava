package com.strings;

public class Ignorecases {
	public static void main(String[] args) {
		Ignorecases c=new Ignorecases();
		c.go();
	
	}
	  void go() {
	String a="HELLO";
	String b="hello";
	
    if(a.equalsIgnoreCase(b))
    	System.out.println("it is true");
    else
    	System.out.println("it is false");

}}