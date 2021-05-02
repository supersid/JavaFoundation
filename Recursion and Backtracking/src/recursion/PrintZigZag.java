/*
 * I have added the keywords "Pre", "Post" and "In" to give more clarification.
 * To submit the code in pepcoding portal remove these keywords.
 */
package recursion;

import java.util.Scanner;

public class PrintZigZag {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		pzz(n);
	}

	public static void pzz(int n) {
		if(n == 0) {
			return;
		}
		System.out.print("Pre" + n + " ");
		pzz(n-1);
		System.out.print("In" + n + " ");
		pzz(n-1);
		System.out.print("Post" + n + " ");
	}
}
