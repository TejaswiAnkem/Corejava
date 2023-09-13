package com.arrayprograms;
public class Explain_11 {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int arr [] = {-25,-20,-15, -10, -5, 0, 5, 10, 15,20,25};
		int count=0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]<0) {
		      count++;
			}
		}
		System.out.println("negative elements in an array");
		int a=0;
		int negitive[]= new int[count];
		for(int j =0;j<arr.length;j++) {
			if(arr[j]<0) {
	            negitive[a++] = arr[j];
				}
			}
		for (int n=0;n<negitive.length;n++) {
			System.out.print(negitive[n] + " ");
		}
	}
}
