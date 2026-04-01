package com.functional_interface;
@FunctionalInterface
interface AddTwoNumbers{
	int add(int a,int b);
}


@FunctionalInterface
interface EvenOrOdd{
	boolean even_odd(int a);
}


@FunctionalInterface
interface CustomStringLength{
	int str_len(String str);
}



public class FunctionalInterface2 {
	public static void main(String[] args) {
		AddTwoNumbers add_two = (a,b)-> a+b;
		int res = add_two.add(12, 34);
		System.out.println("Result: "+res);
	}
}
