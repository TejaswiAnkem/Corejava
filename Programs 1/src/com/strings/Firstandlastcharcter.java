package com.strings;

public class Firstandlastcharcter {
	public static void main(String[] args) {

g();


	}
	public static void g() {
		String a ="java";
		// Finding string length
		int b = a.length();
		
		// First character of a string
		char first = a.charAt(0);

		// Last character of a string
		char last = a.charAt(b - 1);
		System.out.println(last);
		// Printing first and last
		// character of a string
		System.out.println("First: " + first);
		System.out.println("Last: " + last);

	}

}
