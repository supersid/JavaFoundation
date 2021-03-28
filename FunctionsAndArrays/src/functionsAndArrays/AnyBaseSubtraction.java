/*
 * Constraints for this question
 * 2 <= b <= 10
 * 0 <= n1 <= 256
 * n1 <= n2 <= 256
 */
package functionsAndArrays;

import java.util.Scanner;

public class AnyBaseSubtraction {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		scn.close();
		int d = getDifference(b, n1, n2);
		System.out.println(d);
	}

	public static int getDifference(int b, int n1, int n2) {
		int rv = 0;
		int c = 0;
		int place = 1;
		while (n2 > 0) {
			int d1 = n1 % 10;
			int d2 = n2 % 10;
			n1 = n1 / 10;
			n2 = n2 / 10;

			int d = 0;
			d2 = d2 + c;
			if (d2 >= d1) {
				c = 0;
				d = d2 - d1;
			} else {
				c = -1; // Since this a borrow
				d = d2 + b - d1;
			}
			rv = rv + place * d;
			place = place * 10;
		}
		return rv;
	}
}
