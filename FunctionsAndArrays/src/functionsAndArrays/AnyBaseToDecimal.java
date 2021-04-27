package functionsAndArrays;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); // Entered number (Example - 111001)
		int b = scn.nextInt(); // source base (Example - 2)
		scn.close();
		int d = getValueIndecimal(n, b);
		System.out.println(d);
	}

	public static int getValueIndecimal(int n, int b) {
		int rv = 0;
		int place = 0;
		while (n != 0) {
			int rem = n % 10; // (1, 0, 0, 1, 1, 1)
			rv = rv + rem * (int) (Math.pow(b, place));// (1*2^0 + 0*2^1 + 0*2^2 + 1*2^3 + 1*2^4 + 1*2^5)
			place++;
			n = n / 10; // (11100, 1110, 111, 11, 1)
		}
		return rv; // (57)
	}
}
