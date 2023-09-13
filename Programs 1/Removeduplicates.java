package com.arrayprograms;
public class Removeduplicates {
	public static void main(String[] args) {		
	int a[]= {1,2,2,3,4,4,5,6,6,7};
	int j=0;
	for(int i=0;i<a.length-1;i++) {
		if(a[i] != a[i+1]) {
		//store in j array
          a[j]=a[i];
          //now j is incremented
          j++;
		} }     
       //   its stores upto lastsecond element
      //  so for last element
         a[j]=a[a.length-1];
     //using for loop iterate every element in j array
            //take a temp variable		
          for(int k=0;k<j;k++) {
        	 System.out.print(a[k]);
	         
          }
	}}