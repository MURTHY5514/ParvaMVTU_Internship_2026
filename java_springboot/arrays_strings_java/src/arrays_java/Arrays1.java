package arrays_java;

import java.util.Arrays;

public class Arrays1 {
	public static void main(String[] args) {
		/*
		 * Array:
		 * ======
		 * it is a collection of similar data elements(all Integers, all Strings).
		 * 
		 * data_type arr_name[]= {values};
		 * 
		 * data_type arr_name[] = new data_type[size];
		 * int arr[] = new int[4];
		 * 
		 *types:
		 *======
		 *1D
		 *2D
		 *mutli D
		 * 
		 */
		
		//String array
		String names[] = new String[4];// 0 ---> 3
		names[0]= "pavan";
		names[1] = "jagadeesh";
		names[2] = "darshan";
		names[3] = "mahantesh";
		//names[4] = "mohan";
		
		System.out.println("Array: "+Arrays.toString(names));
	}
}
