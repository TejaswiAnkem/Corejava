package com.arrayprograms;

public class CountEvenandOdd {
	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,8};
		/*
		 * int odd = 0; int even = 0; for (int i = 0; i < a.length; i++) { if (a[i] % 2
		 * == 0) even++;
		 * 
		 * else odd++; }
		 * 
		 * System.out.println("Count of the Even numbers = " + even);
		 * System.out.println("Count of the Odd numbers = " + odd);
		 */
		
		
		int odd=0;
		int even=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even++;
			}else 
				odd++;
			}
		System.out.println(even);
		System.out.println(odd); 
}}
