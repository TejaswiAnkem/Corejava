package com.arrayprograms;

public class EvenandOddinSeperateArray {
	public static void main(String[] args) {

		int a[]= {12,34,55,2,2,4,45,12};

		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++) {

			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		int e[]=new int[even];
		int b[]=new int[odd];
		int j=0,k=0;
		for(int i=0;i<a.length;i++) {
			if(e[i]%2==0)
				e[j++]=a[i];
			else
				b[k++]=a[i];	
		}
		System.out.println("even numbers in given array are");
		for (int c:e)
			System.out.print(c+" ");
		System.out.println("odd numbers in given array are");
		for (int d:b)
			System.out.print(d+" ");
	}

}


