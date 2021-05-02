/*
 * Expectation -> n(5) = 5,4,3,2,1
 * Faith -> 5 + n(4)
 */
// Example
// Input - 5
// Output
// 5
// 4
// 3
// 2
// 1
package recursion;

import java.util.Scanner;

public class PrintDecreasing {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printDecreasing(n);
		scn.close();
	}

	public static void printDecreasing(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printDecreasing(n - 1);
	}
}
