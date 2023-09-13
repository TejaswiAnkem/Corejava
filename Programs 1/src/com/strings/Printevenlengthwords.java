package com.strings;

public class Printevenlengthwords {
	public static void main(String[] args) {
               ho();
	
	}
	public static void ho() {
		String s1="hi this is jack how are you";

	String[] s2 = s1.split(" ");
	for(String word : s2)
		if (word.length()%2==0)
			System.out.println(word);
	}}
