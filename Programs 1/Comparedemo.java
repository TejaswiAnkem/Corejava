package com.Listspractice;

import java.util.Comparator;

public class Comparedemo implements Comparator<Object> {



	@Override
	public int compare(Object o1, Object o2) {

		//typecasting objects into integer
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;

		//write your logic


		if(i1>i1) {
			return -1;
		}else if(i1<i2) {
			return 1;
		}
		else 
			return 0;	
	}
}
