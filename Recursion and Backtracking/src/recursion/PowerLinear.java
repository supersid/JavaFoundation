/*
 * Expectation -> n(2, 5) = (2 * 2^0) * (2 * 2^1) * (2 * 2^2) * (2 * 2^3) * (2 * 2^4) * (2 * 2^5)
 * Faith -> 2 * n(2, 4) where n(2, 4) will give correct result
 */
package recursion;

import java.util.Scanner;

public class PowerLinear {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(power(x, n));
		scn.close();
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}
}
