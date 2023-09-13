package com.strings;

public class Stringtochararray {
	public static void main(String[] args) {
		String a="hello";
		
		char b[]=new char[a.length()];
		
		for(int i=0;i<a.length();i++) {
			b[i]=a.charAt(i);
		}
		for(char c:b) {
			System.out.print(c);
		}
		
	}

}
