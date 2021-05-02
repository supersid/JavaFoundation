// Input -> 5
// Output
// 5
// 4
// 3
// 2
// 1
// 1
// 2
// 3
// 4
// 5
package recursion;

import java.util.Scanner;

public class PrintIncDec {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printIncreasingDecreasing(n);
		scn.close();
	}

	public static void printIncreasingDecreasing(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n); // going up
		printIncreasingDecreasing(n - 1);
		System.out.println(n); // coming down
	}
}
