/*
 * You are given a number n1, representing the size of array arr1.
 * You are given n1 numbers, representing elements of array arr1.
 * You are given a number n2, representing the size of array arr2.
 * You are given n2 numbers, representing elements of array arr2.
 * The two arrays represent digits of two numbers.
 * You are required to add the numbers represented by two arrays and print the arrays.
 */
// Example - n1 = 5 Elements of arr1 = 3, 1, 0, 7, 5
// Example - n2 = 6 Elements of arr2 = 1, 1, 1, 1, 1, 1
// Output - 1, 4, 2, 1, 8, 6

package functionsAndArrays;

import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scn.nextInt();
		}
		int n2 = scn.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scn.nextInt();
		}
		int[] sum = new int[n1 > n2 ? n1 : n2];
		sum = sumOfArray(arr1, arr2, sum);
		for (int val : sum) {
			System.out.println(val);
		}
		scn.close();
	}

	public static int[] sumOfArray(int[] arr1, int[] arr2, int[] sum) {
		int c = 0;
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = sum.length - 1;
		while (k >= 0) { // loop for result array
			int d = c; // variable d is the sum of 2 array number where carry value is assigned at each iteration.
			if (i >= 0) { // till array1 is not complete
				d = d + arr1[i];
			}
			if (j >= 0) { // till array2 is not complete
				d = d + arr2[j];
			}
			c = d / 10; // carry (example 9 + 4 then c = 1)
			d = d % 10; // remaining value (example 9 + 4 then d = 3)
			sum[k] = d;
			i--;
			j--;
			k--;
		}
		if(c != 0) {
			System.out.println(c);
		}
		return sum;
	}
}
