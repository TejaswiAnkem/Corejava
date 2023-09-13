package com.strings;

public class Reverseastring {
	public static void main(String[] args) {

		d();

	}
	public static void d() {	
		String a="sanjay helo";
		String temp="";
char b[]=a.toCharArray();
		for( int i=a.length()-1;i>=0;i--) {
             
		//	System.out.print(a.charAt(i));//we are converting i values into characters in given string. 
temp=temp+b[i];
		}
System.out.println(temp);
		
	}}
