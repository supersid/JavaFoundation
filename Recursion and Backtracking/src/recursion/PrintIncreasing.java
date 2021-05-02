/*
 * Faith -> n(5) = 1,2,3,4,5
 * Expectation -> n(4) + 5
 */
package recursion;

import java.util.Scanner;

public class PrintIncreasing {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printIncreasing(n);
		scn.close();
	}

	public static void printIncreasing(int n) {
		if (n == 0) {
			return;
		}
		printIncreasing(n - 1);
		System.out.println(n);
	}
}
