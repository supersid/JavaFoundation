/*
 * Constraints
 * 2 <= b <= 10
 * 0 <= n1 <= 10000
 * 0 <= n2 <= 10000
 * 
 * Logic
 * 
 * First multiply with single digit.
 * Then shift the place using variable p
 * The add all the values
 */
package functionsAndArrays;

import java.util.Scanner;

public class AnyBaseMultiplication {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		scn.close();
		int d = getProduct(b, n1, n2);
		System.out.println(d);
	}

	public static int getProduct(int b, int n1, int n2) {
		int rv = 0;
		int p = 1;
		while (n2 > 0) {
			int d2 = n2 % 10;
			n2 = n2 / 10;
			int sprd = getProductWithSingleDigit(b, n1, d2);
			rv = getSum(b, rv, sprd * p); // the reason we multiply with p is to shift the value because in real multiplication a 0 is inserted at the right position
			p = p * 10;
		}
		return rv;
	}

	public static int getProductWithSingleDigit(int b, int n1, int d2) {
		int rv = 0;
		int c = 0;
		int place = 1;
		while (n1 > 0 || c > 0) {
			int d1 = n1 % 10;
			n1 = n1 / 10;
			int d = d1 * d2 + c;
			c = d1 / b;
			d = d % b;
			rv = rv + place * d;
			place = place * 10;
		}
		return rv;
	}

	public static int getSum(int b, int n1, int n2) {
		int rv = 0;
		int c = 0;
		int place = 1;
		while (n1 > 0 || n2 > 0 || c > 0) {
			int d1 = n1 % 10;
			int d2 = n2 % 10;
			int d = d1 + d2 + c;
			c = d / b;
			rv = rv + place * (d % b);
			place = place * 10;
			n1 = n1 / 10;
			n2 = n2 / 10;
		}
		return rv;
	}
}
