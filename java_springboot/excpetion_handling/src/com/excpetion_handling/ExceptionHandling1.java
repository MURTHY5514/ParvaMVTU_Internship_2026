package com.excpetion_handling;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		
		fun();
		
	}
	//recursion
	private static void fun() {
		System.out.println("hello");
		fun();
	}
}
