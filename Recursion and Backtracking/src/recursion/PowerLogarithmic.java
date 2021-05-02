/*
 * Logic here is 
 * x^n = x^n/2 * x^n/2, where n is even
 * x^n = x^n/2 * x^n/2 * x, where n is odd
 */
package recursion;

import java.util.Scanner;

public class PowerLogarithmic {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int xn = power(x, n);
		System.out.println(xn);
		scn.close();
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n % 2 == 0) {
			return power(x, n / 2) * power(x, n / 2);
		} else {
			return power(x, n / 2) * power(x, n / 2) * x;
		}
	}
}
