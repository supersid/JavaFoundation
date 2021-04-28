/*
 * Span is defined as difference of maximum value and minimum value.
 */
package functionsAndArrays;

import java.util.Scanner;

public class SpanOfArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); // size of array
		int[] arr = new int[n];
		int max = 0; // default value of max
		int min = 0; // default value of min
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			if (i == 0) {
				max = arr[i]; // set 0 index value for comparison
				min = arr[i]; // set 0 index value for comparison
			}
			if (arr[i] >= max) {
				max = arr[i];
			}
			if (arr[i] <= min) {
				min = arr[i];
			}
		}
		scn.close();
		System.out.println(spanOfArray(max, min));
	}

	public static int spanOfArray(int max, int min) {
		return max - min;
	}
}
