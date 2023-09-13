package com.arrayprograms;

public class smallestofarray {
	public static void main(String[] args) {
		
		int a[]= {333,545,54,443,211,424,5454};
		
		 int min=a[0];
		
		for(int i=0;i<a.length;i++) {
		
		if(a[i]<min) {
		min=a[i];
		}
	}
     System.out.println("smallest element:"+min);
}
}