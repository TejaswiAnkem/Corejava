package com.strings;

public class Somemethods {
	public static void main(String[] args) {
		
		hi();
	}
	static void hi() {	
		String a= "sanjay";
		String b="javadeveloper";
		
		String c=a.concat(b);//concatnation
		
		
		
		String d="aeroplane";
		
		String e=d.replace("pl", "com");
		
		
		
		
		System.out.println(c);
		
		System.out.println(a.charAt(3));//using charAt for position
		
		System.out.println(a.length());//using length for counting of elemnts
		
		System.out.println(a.equals(b));// equals() used to compare strings
		
		System.out.println(e);//replace is used to replace characters
		
		
		
		
		
		
	}

}
