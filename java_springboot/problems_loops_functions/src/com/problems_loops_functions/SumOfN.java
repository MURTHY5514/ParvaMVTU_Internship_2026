package com.problems_loops_functions;

import java.util.Scanner;

public class SumOfN {
	public static void main(String[] args) {
		/*
		 * palindrome
		 * reverse
		 * so of digits
		 * factorial
		 * count of digits
		 * sum  of n natural no:
		 * =====================
		 * 5 --> 1+2+3+4+5 -->15
		 * 10 ---> 55
		 */
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt(); //5
		int i = 1;
		int res = 0;
		while(i<=num) {//1<=5
			res = res+i; //1
			i++;
		}
		System.out.println("Result is: "+res);
		
	}
}
