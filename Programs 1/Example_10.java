package com.arrayprograms;

public class Example_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {-25,-20,-15, -10, -5, 0, 5, 10, 15,20,25};
		int positive =0;
		int negitive =0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>0) {
				positive++;
			}
			else if(arr[i]<0) {
				negitive++;
			}
			else {
				System.out.println("Zero in the array = 1");
			}
		}
		System.out.println("Positive numbers in the array = "+ positive);
		System.out.println("Negative numbers in the array = " + negitive);	
	}
}
