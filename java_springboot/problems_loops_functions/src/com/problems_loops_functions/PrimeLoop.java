package com.problems_loops_functions;

import java.util.Scanner;

public class PrimeLoop {
	public static void main(String[] args) {
		/*
		 * prime number:
		 * =============
		 * * the number is div by itself and 1
		 * ex: 2,3,5,7,11,13,17,19,23
		 * 
		 * 10 --> 2,5
		 */
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();//5
		boolean flag = true;
		for(int i=2;i<=num/2;i++) { //2<=2
			if(num%i==0) { //5%2==0
				flag = false;
			}
		}
		if(flag)
			System.out.println("Prime Number");
		else 
			System.out.println("Not a Prime Number");
		
	}
}
