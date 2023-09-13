package com.setspractice;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.Listspractice.Comparedemo;
import com.collections.Comparator1;

public class Treesetdemo {
	public static void main(String[] args) {
		Set<Object>a=new TreeSet<>(new Comparedemo());
		a.add(3);
         a.add(8);
         System.out.println(a);
	}

}
