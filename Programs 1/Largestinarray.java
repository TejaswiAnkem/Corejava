package com.arrayprograms;

public class Largestinarray {
	public static void main(String[] args) {
		int a[]= {12,34,56,78,9};
		
			int max=a[0];
			 
			for(int i=0;i<a.length;i++) {
				
				if(a[i]>max) {
					max=a[i];
		}
			}
		System.out.println("maximum value:"+max);	
	}
}