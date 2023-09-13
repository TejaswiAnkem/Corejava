package com.strings;

public class Palindromearenot {
	public static void main(String[] args) {
		
		to();
	}
	public static void to() {
		String a="radar";
		int d=a.length();
		char b=a.charAt(0);
		//char c=a.charAt(2);
		int e=d-1;
		if(b==e)
			System.out.println("it is a palindrome");
		
		else
			System.out.println("IT IS NOT A PALINDROME");
			
	}

}
