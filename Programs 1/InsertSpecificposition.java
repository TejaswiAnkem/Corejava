package com.arrayprograms;
import java.io.*;
import java.util.Scanner;

public class InsertSpecificposition {
	public static void main(String[] args) throws IOException {
		// ) Insert Element at Specific Position

		   InputStreamReader r1=new InputStreamReader(System.in);    
		    BufferedReader br1=new BufferedReader(r1);            
		    System.out.println("Enter number");    
		    String name1=br1.readLine();
		    int number =Integer.parseInt(name1);
		    

		 InputStreamReader r2=new InputStreamReader(System.in);    
		 BufferedReader br2=new BufferedReader(r2);            
			System.out.println("Enter index");    
			String name2=br2.readLine();
			int index =Integer.parseInt(name2);

			int arr [] = {0, 5, 10, 15,20,25};
			if(index<=arr.length-1) {
				arr[index]=number;
			}
			else {
				System.out.println("index is out of range");
			}
			for (int x=0;x<arr.length;x++) {
				System.out.print(arr[x] + " ");
			}
	
	}
	}