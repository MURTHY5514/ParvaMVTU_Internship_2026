package com.lambdafucntion;

import java.util.Arrays;
import java.util.List;

public class LambdaFunction {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Print all numbers
        numbers.forEach(n -> System.out.println(n));

        // Filter even numbers and print
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
}
