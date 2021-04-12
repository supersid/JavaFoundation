/*
 * The number of permutations will be str.length() factorial
 * Number the string characters starting from 1
 * start each iteration with initial string
 * divide the iteration number with length of string
 * print the character with index value as remainder calculated above
 * delete the character from the string
 */

package stringsAndArraylist;

import java.util.Scanner;

public class PermutationOfString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
		scn.close();
	}

	public static void solution(String str) {
		int n = factorial(str.length());
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder(str);
			int temp = i;
			for (int div = str.length(); div >= 1; div--) {
				int q = temp / div;
				int r = temp % div;

				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);

				temp = q;
			}
			System.out.println();
		}
	}

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

}
