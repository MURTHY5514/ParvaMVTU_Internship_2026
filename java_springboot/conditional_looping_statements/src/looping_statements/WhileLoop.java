package looping_statements;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		/*
		 * while loop:
		 * ===========
		 * ini;
		 * while(con){
		 * 	//code
		 * 	inc/dec
		 * }
		 * * if you don't the no of iteration and condition chekc happens before execution 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int count = sc.nextInt(); //-1
		int i = 1;
		while(i<=count) { //1<=-1
			System.out.println("Value: "+i);
			i++;
		}
		
	}
}
