/*
 * You are given a number n1, representing the size of array arr1.
 * You are given n1 numbers, representing elements of array arr1.
 * You are given a number n2, representing the size of array arr2.
 * You are given n2 numbers, representing elements of array arr2.
 * The two arrays represent digits of two numbers.
 * You are required to find the difference of two numbers represented by two arrays and print the arrays. arr2 - arr1
 * number represented by arr1 is smaller than number represented by arr2
 */
// Example - n1 = 3 Elements of arr1 = 2, 6, 7
// Example - n2 = 4 Elements of arr1 = 1, 0, 0, 0
// Output - 7, 3, 3
package functionsAndArrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int [] arr1 = new int[n1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scn.nextInt();
		}
		int n2 = scn.nextInt();
		int [] arr2 = new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scn.nextInt();
		}
		scn.close();
		
		int [] diff = new int[n2];
		
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = diff.length - 1;
		int c = 0;
		int d = 0;
		while(k >= 0) {
			d = 0;
			int arr1V = i >= 0 ? arr1[i] : 0; // this is to fill the empty space as size of array1 is small than array2
			 if(arr2[j] + c >= arr1V) { // when borrow is not needed
				 d = arr2[j] + c - arr1V; // calculate the difference and null the carry
				 c = 0;
			 } else {
				 d = arr2[j] + c + 10 - arr1V; // take borrow and assign carry
				 c = -1;
			 }
			 diff[k] = d;
			 k--;
			 j--;
			 i--;
		}
		// this loop is added so that 0 from start is not considered
		// example 000123 should be 123
		int idx = 0;
		for (int l = 0; l < diff.length; l++) {
			if(diff[l] == 0) {
				idx++;
			} else {
				break;
			}
		}
		for (int l = idx; l < diff.length; l++) {
			System.out.println(diff[l]);
		}
	}
}
