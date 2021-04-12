package recursion;

import java.util.Scanner;

public class PrintIncreasing {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printDecreasing(n);
		scn.close();
	}

	public static void printDecreasing(int n) {
		if (n == 0) {
			return;
		}
		printDecreasing(n - 1);
		System.out.println(n);
	}
}
