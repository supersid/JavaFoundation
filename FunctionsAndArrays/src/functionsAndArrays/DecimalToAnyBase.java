package functionsAndArrays;

import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); // Enter decimal number (example - 57)
		int b = scn.nextInt(); // Enter destination base (example - 2)
		scn.close();
		int dn = getValueInBase(n, b);
		System.out.println(dn);
	}

	public static int getValueInBase(int n, int b) {
		int rv = 0; // result value
		int place = 0; // place value
		while (n != 0) {
			int rem = n % b; // remainder after dividing decimal number with destination base (1, 0, 0, 1, 1, 1)
			rv = rv + rem * (int)(Math.pow(10, place)); // (1*10^0 + 0*10^1 + 0*10^2 + 1*10^3 + 1*10^4 + 1*10^5)
			place++; // (1, 2, 3, 4, 5, 6)
			n = n / b; // (28, 14, 7, 3, 1)
		}
		return rv; // (111001)
	}
}
