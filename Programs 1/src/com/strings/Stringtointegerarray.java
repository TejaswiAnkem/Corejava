package com.strings;

import java.util.Arrays;

public class Stringtointegerarray {
	public static void main(String[] args) {
        String a = "[1,2,356,678,3378]";
        
        // calling replaceAll() method and split() method on
        // string
        String[] b= a.replaceAll("\\[", "")
                              .replaceAll("]", "")
                              .split(",");
 
        // declaring an array with the size of string
        int[] arr = new int[b.length];
 
        // parsing the String argument as a signed decimal
        // integer object and storing that integer into the
        // array
        for (int i = 0; i < b.length; i++) {
            arr[i] = Integer.valueOf(b[i]);
        }
 
        // printing string
        System.out.print("String : " + a);
 
        // printing the Integer array
        System.out.print("\nInteger array : "+ Arrays.toString(arr));

	}

}