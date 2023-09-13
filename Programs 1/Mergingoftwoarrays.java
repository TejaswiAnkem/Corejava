package com.arrayprograms;

public class Mergingoftwoarrays {
	public static void main(String[] args) {
		 int a[]= {1,2,3,4,5};
		 int b[]= {6,7,8,9,10};
		int c1=0;
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[c1]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[c1]=b[i];
	}
     System.out.println();  
}}
