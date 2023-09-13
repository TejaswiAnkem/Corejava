 package com.arrayprograms;

 public class Reversearray {
	 public static void main(String[] args) {

		 int[]a= {12,45,67,897,96,3454};

		 int temp=0;
		 for(int i=0;i<a.length/2;i++) {
			 temp=a[i];
			 a[i]=a[a.length-1-i];
			 a[a.length-1-i]=temp;
		 } 
		 for (int i:a) 
			 System.out.print(i+" "); 	 
	 }
 }

