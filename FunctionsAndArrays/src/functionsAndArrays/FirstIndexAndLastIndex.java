/*
 * We have to use binary search for this question.
 * We have to use 2 loops to find the start index and the last index.
 * Logic for both is same with tweak for first and last index respectively. 
 */
package functionsAndArrays;

import java.util.Scanner;

public class FirstIndexAndLastIndex {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int d = scn.nextInt();
		scn.close();
		int l = 0;
		int h = arr.length - 1;
		int fi = -1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (d > arr[m]) {
				l = m + 1;
			} else if (d < arr[m]) {
				h = m - 1;
			} else {
				fi = m; // assigns potential value
				h = m - 1;
			}
		}
		l = 0;
		h = arr.length - 1;
		int li = -1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (d > arr[m]) {
				l = m + 1;
			} else if (d < arr[m]) {
				h = m - 1;
			} else {
				li = m; // assigns potential value
				l = m + 1;
			}
		}
		System.out.println(fi);
		System.out.println(li);
	}
}
