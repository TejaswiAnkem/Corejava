package com.arrayprograms;
import java.util.Arrays;
public class Removeelement {
	public static void main(String[] args) {
		// original array
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println("Original array: " + Arrays.toString(a));

		// index of element to be removed 
		int index = 3;
		int[]b=new int[a.length-1];
		int k=0;
		//now iterate the loop
		for(int i=0;i<a.length;i++) {

			if( i==index) {//if it is not true we need to copy the element
				continue;//if the condition is true then the loop is skipped
			}

			b[k]=a[i];
			k++;
		}
		System.out.println("New Array :");
		for (int j=0;j<a.length;j++) {
			System.out.print(b[j] + " ");
		}
	}
}


	  
	  
	