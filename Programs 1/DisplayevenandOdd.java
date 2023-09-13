package com.arrayprograms;

public class DisplayevenandOdd {
	public static void main(String[] args) {



		//int a[]= {12,34,556,12,32,11,4};

		int a[]= {1,2,3,4,5,6,7,8};

//		int even=0;
//		int odd=0;

		for(int i=0;i<a.length;i++) {

			if(a[i]%2==0) {
				System.out.print(a[i]);
				
			}
		}
		System.out.println();
		for(int k=0;k<a.length;k++) {
			if(a[k]%2==1) {
				System.out.print(a[k]+" ");
			}}
			}
		
}
