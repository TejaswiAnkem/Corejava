package com.strings;

public class Removewords {
	public static void main(String[] args) {
		
	g();
		
	}
	static void g() {	
		String a= "backend and the frontend developers";
		

	 
	        //  word to be removed
	     //   String word = "the";
	 
	        // Replace all words by "" string
	        // using replaceAll() method
	        a = a.replaceAll("the", "");
	 
	        // Trim the string using trim() method
	        //a = a.trim();
	 
	       
	        System.out.print(a);
	    }
		
	}


