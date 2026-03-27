package com.arrayList;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		//using generics.
		ArrayList<Integer> arr1 = new ArrayList<>(); // there is type safety
		arr1.add(12);
		int age = 10;
//		arr1.add("Hello");
		arr1.add(age);
		arr1.add(34);
		System.out.println(arr1);
		int age1 = arr1.get(1); // no need to type cast.
		
		int num = 30;
		//Integer num2 = num; //auto boxing
		Integer num2 = Integer.valueOf(num);
		
		//int num3 = num2; //un boxing
		int num3  = num2.intValue();
		
		Byte b = 30;
		byte b1 = b.byteValue();
	}
}
