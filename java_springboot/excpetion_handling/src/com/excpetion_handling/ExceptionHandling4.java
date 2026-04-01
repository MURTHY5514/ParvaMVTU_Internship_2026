package com.excpetion_handling;

public class ExceptionHandling4 {
	public static void main(String[] args) {

//		System.out.println("start of program");
//		try {
//			System.out.println("res: "+(10/0));
//		} finally {
//			System.out.println("This is finally block");
//		}
//		System.out.println("End of program");

		System.out.println("start of program");
		try {
			System.out.println("res: " + (10 / 0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("This is finally block");
		}
		System.out.println("End of program");
	}
}
