package com.functional_interface;

import java.util.function.Predicate;

public class PredicateFuncionalInterface {
	public static void main(String[] args) {
		//even or odd using predicate(bool)
		Predicate<Integer> pre =  a->a%2==0;
		System.out.println(pre.test(13));
	}
}
