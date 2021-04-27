package functionsAndArrays;

import java.util.Scanner;

public class AnyBaseAddition {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt(); // base for both n1 and n2 (Example - 8)
		int n1 = scn.nextInt(); // first number (Example - 777)
		int n2 = scn.nextInt(); // second number (Example - 1)
		scn.close();
		int d = getSum(b, n1, n2);
		System.out.println(d);
	}

	public static int getSum(int b, int n1, int n2) {
		int rv = 0;
		int c = 0;
		int place = 1;
		while (n1 > 0 || n2 > 0 || c > 0) {
			int d1 = n1 % 10; // to get rightmost digit (7, 7, 7, 0)
			int d2 = n2 % 10; // to get rightmost digit (1, 0, 0, 0)
			int d = d1 + d2 + c; // sum of last digits of n1 and n2 with carry (8, 8, 8, 1)
			c = d / b; // to calculate carry (1, 1, 1, 0)
			rv = rv + place * (d % b); // value after addition (0, 0, 0, 1000)
			place = place * 10; // (10, 100, 1000)
			n1 = n1 / 10;
			n2 = n2 / 10;
		}
		return rv; // (10000)
	}
}
