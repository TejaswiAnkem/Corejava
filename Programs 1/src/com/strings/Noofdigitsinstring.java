package com.strings;

public class Noofdigitsinstring {
	public static void main(String[] args) {
		int1();
		
	}
	public static void int1() {	
		   String a = "sai134rf4tf4234";
	        int b = 0;
	        for (int i = 0; i < a.length(); i++) {
	            if (a.charAt(i) >= 48 && a.charAt(i) <= 57)
	                b++;
	        }
	        System.out.println("Total number of Digits = "
	                           + b);
	    }
	

	}


