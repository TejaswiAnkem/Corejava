package com.strings;

public class CovertStringtoStringArray {
	public static void main(String[] args) {
		
		String a="hello my name is";
		String p[]=new String[a.length()];
		
		int temp=0;
		
		//String []b=a.split(" ");
		
		for(int i=0;i<p.length;i++) {
		p[temp++]=a;	
	
		System.out.println(p[i]);
		
	}

}}
