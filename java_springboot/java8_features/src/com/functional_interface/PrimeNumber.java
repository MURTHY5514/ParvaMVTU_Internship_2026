package com.functional_interface;

import java.util.function.Predicate;

public class PrimeNumber {
	public static void main(String[] args) {
		// 5 --> true/false.
		Predicate<Integer> pri = num -> {
			if(num<=1) return false;
			for(int i = 2;i<=num/2;i++) {
				if(num%i ==0) return false;
			}
			return true;
		};
		boolean res = pri.test(11);
		if(res) System.out.println("Prime Number");
		else System.out.println("Not a Prime Number");
	}
}
