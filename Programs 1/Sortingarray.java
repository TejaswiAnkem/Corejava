package com.arrayprograms;



public class Sortingarray {
	public static void main(String[] args) {
		
		int a[]= {12,34,544,54,834,88,545};
		
		int max=a[0];
		int min=a[0];
		for ( int i=0;i<a.length;i++) {
			if(a[i]>max) {
			max=a[i];
			}
		if(a[i]<min) {
		min=a[i];
		}	
		}
		System.out.println("maximum "+ max);
		System.out.print("minimum "+ min);
		
		
	}
	}
