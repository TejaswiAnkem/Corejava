package com.arrayprograms;

public class Sumofevenandodd {
	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8};

		int sum=0;
		int sum1=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2 == 0) {
				sum=sum + a[i];// sum=0+i
			}
			else {
				sum1=sum1 + a[i] ;
					}
		
				}
		System.out.println("Odd numbers sum = " + sum1);  
				System.out.println("Even numbers sum = " + sum);

		 
	}
}



