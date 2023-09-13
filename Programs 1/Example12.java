package com.arrayprograms;

public class Example12 {
	public static void main(String[] args) {
	//  Separate positive and negative numbers in an array:
			int arr [] = {-25,-20,-15, -10, -5, 0, 5, 10, 15,20,25};
			int p=0;	
			for(int i = 0; i<arr.length;i++) {
				if(arr[i]<0) {
			      p++;//p=p+1
				}
			}
			int n=(arr.length - p);
			System.out.println(p);
			System.out.println(n);
			int positive[]= new int[n];
			int negitive[]= new int[p];
			int a=0;// it is used to assign new values into  new positive array
			int b=0;
			for(int i=0;i<arr.length;i++) {
				if (arr[i]>= 0) {
						positive[a++] = arr[i];
			}
				else {
					negitive[b++] = arr[i];
			}
			}
			System.out.println("Positive numbers Array");

			for (int m=0;m<positive.length;m++) {
				System.out.print(positive[m] + " ");
			}		
			System.out.println();
			System.out.println("Negitive numbers Array");
			for (int x=0;x<negitive.length;x++) {
				System.out.print(negitive[x] + " ");
			}
		}
}
