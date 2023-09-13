package com.strings;

public class Placingquotestostring {

	public static void main(String[] args) {
		
		go();
		
	}
	public static void go() {
		String a="hello hi";
		String d=" \"hello hi\" ";//using sequence here \" is insertedfor adding quotes
		char b='"';//using char for symbol(")
		
		String c=b+a+b;
		
		
            System.out.println(c);
	}

}
