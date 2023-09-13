package com.arrayprograms;

public class Arraysizes {
	public static void main(String[] args) {
		int a[]= {1,1,2,3,4,5,1,4,3,6,7};
		int j=0;
		
		for(int i=0;i<a.length-1;i++) {
			if (a[i]!=a[i+1]) {
				
				a[j]=a[i];
				j++;
			}
		}

		a[j]=a[a.length-1];
		
		for(int k=0;k<j;k++) {
		System.out.print(a[k]);
		
		 }}}
