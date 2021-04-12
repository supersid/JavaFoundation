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
		if(n == 1) {
			return n;
		}
		int fmo = factorial(n-1);
		int factorial = n * fmo;
		return factorial;
	}
}
