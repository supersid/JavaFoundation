/*
 * Expectation -> n(5) = 5 * 4 * 3 * 2 * 1
 * Faith -> 5 * n(4) where n(4) will be calculated
 */
package recursion;

import java.util.Scanner;

public class PrintFactorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(factorial(n));
		scn.close();
	}

	public static int factorial(int n) {
		if (n == 1) {
			return n;
		}
		return n * factorial(n - 1);
	}
}
