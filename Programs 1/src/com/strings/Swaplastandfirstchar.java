package com.strings;

public class Swaplastandfirstchar {
	public static void main(String[] args) {
		String a="camel";
		String b=a.toUpperCase();
		int n=a.length();
		char c=a.charAt(0);
		char d=a.charAt(n-1);
		String e=a.substring(1, n-1);//

		String result=d+e+c;
		System.out.println(result);

	}

}
