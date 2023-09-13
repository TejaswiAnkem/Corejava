package com.strings;

public class ReplacemultiplechrsinString {

	public static void main(String[] args) {
		g();
		
	}
	static void  g() {
	

		String a="hi this is jack";
		
		
		String b=a.replace("is", "a");//using .replace() METHOD
		String c=a.replaceAll("hi this is jack", " bye");//using replaceAll to replace all
		
		System.out.println(c);
		
	}

}
