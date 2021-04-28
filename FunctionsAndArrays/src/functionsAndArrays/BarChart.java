/*
 * You are given a number n, representing the size of array arr.
 * You are given n numbers, representing elements of array arr.
 * You are required to print a bar chart representing value of array.
 */
// Example n = 5, element = 3, 1, 0, 7, 5
// Example output
//				*		
//				*		
//				*	*	
//				*	*	
//	*			*	*	
//	*			*	*	
//	*	*		*	*

package functionsAndArrays;

import java.util.Scanner;

public class BarChart {

	// To create a bar chart you have to find max in an array
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] arr = new int[n];
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			if(i == 0) {
				max = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		/*
		 * Set max value as the top row and go down.
		 * Iterate over the array if you find value equal to the row then print it.
		 * else print empty space.
		 */ 
		int star = max;
		for (int i = 0; i < max; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] >= star) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			star--;
			System.out.println();
		}
		scn.close();
	}
}
