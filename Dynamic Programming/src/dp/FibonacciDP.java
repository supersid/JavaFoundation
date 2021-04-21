package dp;

import java.util.Scanner;

public class FibonacciDP {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int f = fibonacci(n, new int[n + 1]);
		System.out.print(f);
	}

	public static int fibonacci(int n, int[] qb) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (qb[n] != 0) {
			return qb[n];
		}
		int fnm1 = fibonacci(n - 1, qb);
		int fnm2 = fibonacci(n - 2, qb);
		int fibonacciResult = fnm1 + fnm2;

		qb[n] = fibonacciResult;

		return fibonacciResult;
	}
}
