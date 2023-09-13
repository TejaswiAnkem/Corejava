package com.strings;

public class CountnoofdigitsinString {
	public static void main(String[] args) {
		
		to();
	}
	public static void to(){
		String a="ght334y5763r6nas";
		int count=0;
		for(int i=0;i<a.length();i++) 
			if(a.charAt(i)>=48 && a.charAt(i)<=57) 
			count++;
	
		
		System.out.println(count);
	}

}
